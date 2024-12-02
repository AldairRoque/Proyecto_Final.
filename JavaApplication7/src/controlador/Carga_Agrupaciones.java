
package controlador;

import modelo.Agrupacion_Politica;
import vista.Auditoria;
public class Carga_Agrupaciones {
    //controlar el aumento del tamaño cuando se llena
  private static final int FACTOR_CRECIMIENTO = 10; //cuantas posiciones adicionales se añaden al arreglo adicionales se añaden al arreglo
    private static Agrupacion_Politica[] agrupaciones = new Agrupacion_Politica[FACTOR_CRECIMIENTO]; //Este arreglo será usado para almacenar objetos que representan agrupaciones políticas
    private static int contadorAgrupaciones = 0; 

    
    // Obtener lista de agrupaciones
    public static Agrupacion_Politica[] getAgrupaciones() {
        return agrupaciones;
    }

   

    // Cargar agrupaciones políticas
    public static void cargarAgrupaciones() {
        try {
                for (int i = 0; i < Carga_Datos.getDatos().length; i++) {
                if (Carga_Datos.getDatos()[i] == null) {
                    break;
                }

                // Extraer datos necesarios de CargaDatos
                String tipoAgrupacion = Carga_Datos.getDatos()[i].getTipo_agrupacion();
                int codigoAgrupacion = Carga_Datos.getDatos()[i].getCodigo_agrupacion();
                String nombreAgrupacion = Carga_Datos.getDatos()[i].getAgrupacion();

                // Verificar si la agrupación ya existe
                boolean existe = false;//supone que la agrupacion no existe
                for (int j = 0; j < contadorAgrupaciones; j++) {
                    if (agrupaciones[j].getCodigo_agrupacion() == codigoAgrupacion) { //compara los codigos de agrupacion 
                        existe = true;
                        break;
                    }
                }

                // agrega una nueva agrupación política al arreglo agrupaciones,
                if (!existe) {
                    if (contadorAgrupaciones == agrupaciones.length) {
                        Agrupacion_Politica[] aux = new Agrupacion_Politica[agrupaciones.length + FACTOR_CRECIMIENTO];
                        System.arraycopy(agrupaciones, 0, aux, 0, agrupaciones.length);
                        agrupaciones = aux;
                    }
                    agrupaciones[contadorAgrupaciones] = new Agrupacion_Politica(codigoAgrupacion, tipoAgrupacion, nombreAgrupacion);
                    contadorAgrupaciones++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error al cargar las agrupaciones: " + e.getMessage());

             // Registrar el error en el archivo de auditoría
            String proceso = "Carga de Agrupaciones Políticas";
            String tipoError = e.getClass().getName();
            String mensajeError = e.getMessage();
            Auditoria.registrarExcepcion(proceso, tipoError, mensajeError);
        }
    }

    // Imprimir todas las agrupaciones políticas
    public static void imprimirAgrupaciones() {
        for (int i = 0; i < contadorAgrupaciones; i++) {
            System.out.println(agrupaciones[i].toString());
        }
    }
    /* 
    public static void ejemploBuscarAgrupacionNoExistente() {
        try {
            // Forzar NullPointerException al intentar buscar una agrupación no cargada
            Agrupacion_Politica agrupacion = Carga_Agrupaciones.buscarAgrupacion(99999); // Código de agrupación que no existe
            if (agrupacion == null) {
                throw new Exception("Agrupación no encontrada");
            }
            
        } catch (Exception e) {
            String proceso = "Búsqueda de agrupación política";
            String tipoError = e.getClass().getName();
            String mensajeError = e.getMessage();
            Auditoria.registrarExcepcion(proceso, tipoError, mensajeError);
        }
            
    } */
}
