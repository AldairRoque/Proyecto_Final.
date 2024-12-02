
package vista;

import controlador.Carga_Agrupaciones;
import controlador.Carga_MesaElectoral;
import controlador.Carga_ResultadoEleccion;
import controlador.Carga_Ubigeo;
import java.io.FileWriter;
import java.io.IOException;


public class exportaciones {
     // Método para exportar agrupaciones políticas a archivo
    public static void exportarAgrupaciones() {
        try (FileWriter writer = new FileWriter("agrupaciones.txt")) { //abrimos archivo
            for (int i = 0; i < Carga_Agrupaciones.getAgrupaciones().length; i++) { //recorre los metodos del arreglo carga_A
                if (Carga_Agrupaciones.getAgrupaciones()[i] != null) {
                    writer.write(Carga_Agrupaciones.getAgrupaciones()[i].toString() + "\n"); //escribe datos en el archivo
                }
            }
            System.out.println("Agrupaciones exportadas a agrupaciones.txt");
        } catch (IOException e) {
            System.out.println("Error al exportar las agrupaciones: " + e.getMessage());
        }
    }

    // Método para exportar mesas electorales a archivo
    public static void exportarMesas() {
        try (FileWriter writer = new FileWriter("mesas.txt")) {
            for (int i = 0; i < Carga_MesaElectoral.getMesas().length; i++) {
                if (Carga_MesaElectoral.getMesas()[i] != null) {
                    writer.write(Carga_MesaElectoral.getMesas()[i].toString() + "\n");
                }
            }
            System.out.println("Mesas exportadas a mesas.txt");
        } catch (IOException e) {
            System.out.println("Error al exportar las mesas: " + e.getMessage());
        }
    }

    // Método para exportar resultados de elecciones a archivo
    public static void exportarResultados() {
        try (FileWriter writer = new FileWriter("resultados.txt")) {
            for (int i = 0; i < Carga_ResultadoEleccion.getResultados().length; i++) {
                if (Carga_ResultadoEleccion.getResultados()[i] != null) {
                    writer.write(Carga_ResultadoEleccion.getResultados()[i].toString() + "\n");
                }
            }
            System.out.println("Resultados exportados a resultados.txt");
        } catch (IOException e) {
            System.out.println("Error al exportar los resultados: " + e.getMessage());
        }
    }
    
    // Método para exportar ubigeos a archivo
    public static void exportarUbigeos() {
        try (FileWriter writer = new FileWriter("ubigeos.txt")) {
            for (int i = 0; i < Carga_Ubigeo.getUbigeos().length; i++) {
                if (Carga_Ubigeo.getUbigeos()[i] != null) {
                    writer.write(Carga_Ubigeo.getUbigeos()[i].toString() + "\n");
                }
            }
            System.out.println("Ubigeos exportados a ubigeos.txt");
        } catch (IOException e) {
            System.out.println("Error al exportar los ubigeos: " + e.getMessage());
        }
        
    }
}
