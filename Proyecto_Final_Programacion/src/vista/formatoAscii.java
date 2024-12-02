
package vista;

import controlador.Carga_Agrupaciones;
import controlador.Carga_MesaElectoral;
import controlador.Carga_ResultadoEleccion;
import controlador.Carga_Ubigeo;

public class formatoAscii {
    
    // formato ascii de carga_agrupaciones
    public static void imprimirAgrupacionesASCII(){
          System.out.println("--------------------------------------------------------------------------");
          System.out.printf("| %-10s | %-15s | %-40s |\n", "Tipo", "Agrupación", "Nombre");
          System.out.println("--------------------------------------------------------------------------");

    // Iterar y mostrar las agrupaciones en formato ASCII
    for (int i = 0; i < Carga_Agrupaciones.getAgrupaciones().length; i++) { //recorre las agrupaciones cargadas en el array
        if (Carga_Agrupaciones.getAgrupaciones()[i] != null) {  //no imprima errores nulos
            System.out.printf("| %-10s | %-15s | %-40s |\n",
                    Carga_Agrupaciones.getAgrupaciones()[i].getTipo_agrupacion(),
                    Carga_Agrupaciones.getAgrupaciones()[i].getCodigo_agrupacion(),
                    Carga_Agrupaciones.getAgrupaciones()[i].getNombre_agrupacion());
        }
    }

    // Línea de cierre decorativa
    System.out.println("--------------------------------------------------------------------------");
}
    // Método para imprimir resultados de elección formateados como reporte ASCII
    public static void imprimirResultadosASCII() {
        // Encabezado decorativo superior
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("| %-50s | %-10s | %-10s | %-10s | %-10s | %-10s |\n",
            "Agrupación", "Votos", "Hábiles", "Blancos", "Nulos", "Impugnados");
            System.out.println("------------------------------------------------------------------------------------------------------------------------");

    // Iterar y mostrar los resultados en formato ASCII
    for (int i = 0; i < Carga_ResultadoEleccion.getResultados().length; i++) {
        if (Carga_ResultadoEleccion.getResultados()[i] != null) {
            System.out.printf("| %-50s | %-10d | %-10d | %-10d | %-10d | %-10d |\n",
                    Carga_ResultadoEleccion.getResultados()[i].getAgrupacion(),
                    Carga_ResultadoEleccion.getResultados()[i].getVotos_obtenidos(),
                    Carga_ResultadoEleccion.getResultados()[i].getElectores_habiles(),
                    Carga_ResultadoEleccion.getResultados()[i].getVotos_blancos(),
                    Carga_ResultadoEleccion.getResultados()[i].getVotos_nulos(),
                    Carga_ResultadoEleccion.getResultados()[i].getVotos_impugnados());
        }
    }

    // Línea de cierre decorativa
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");
}

    //formato ASCII de Mesas
    public static void imprimirMesasASCII() {
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-20s | %-20s | %-10s |\n", "ID Mesa", "Tipo Elección", "Estado Mesa", "Ubicación");
        System.out.println("------------------------------------------------------------------------");
        for (int i = 0; i < Carga_MesaElectoral.getMesas().length; i++) {
            if (Carga_MesaElectoral.getMesas()[i] != null) {
                System.out.printf("%-10d | %-20s | %-20s | %-10d |\n",
                        Carga_MesaElectoral.getMesas()[i].getId_mesa(),
                        Carga_MesaElectoral.getMesas()[i].getTipo_eleccion(),
                        Carga_MesaElectoral.getMesas()[i].getEstado_mesa(),
                        Carga_MesaElectoral.getMesas()[i].getUbicacion_en_cedula());
            }
        }
        System.out.println("------------------------------------------------------------------------");
    }

    //formato ASCII de Ubigeo
    public static void imprimirUbigeosASCII() {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-20s | %-20s | %-20s |\n", "ID", "Departamento", "Provincia", "Distrito");
        System.out.println("---------------------------------------------------------------------------------");
        for (int i=0; i < Carga_Ubigeo.getUbigeos().length; i++){
            if(Carga_Ubigeo.getUbigeos()[i] != null) {
                System.out.printf("| %-10d | %-20s | %-20s | %-20s |\n",
                        Carga_Ubigeo.getUbigeos()[i].getId_ubigeo(),
                        Carga_Ubigeo.getUbigeos()[i].getDepartamento(),
                        Carga_Ubigeo.getUbigeos()[i].getProvincia(),
                        Carga_Ubigeo.getUbigeos()[i].getDistrito());
            }
            
            }
            System.out.println("-----------------------------------------------------------------------------------");
        }
    } 

