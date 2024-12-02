
package controlador;

import modelo.Mesa_Electoral;
import vista.Auditoria;

public class Carga_MesaElectoral {
    private static final int FACTOR_CRECIMIENTO = 10;
    private static Mesa_Electoral[] mesas = new Mesa_Electoral[FACTOR_CRECIMIENTO];
    private static int contadorMesas = 0;

    // Obtener la lista de mesas electorales
    public static Mesa_Electoral[] getMesas() {
        return mesas;
    }



    // Cargar mesas electorales desde los datos
    public static void cargarMesas() {
        try {
            for (int i = 0; i < Carga_Datos.getDatos().length; i++) {
                if (Carga_Datos.getDatos()[i] == null) {
                    break;
                }

                // Extraer datos necesarios de CargaDatos
                int idMesa = Carga_Datos.getDatos()[i].getMesa();
                String tipoEleccion = Carga_Datos.getDatos()[i].getTipo_eleccion();
                String estadoMesa = Carga_Datos.getDatos()[i].getEstado_mesa();
                int ubicacionEnCedula = Carga_Datos.getDatos()[i].getUbicacion_en_cedula();
            
                // Verificar si la mesa ya existe
                boolean existe = false;
                for (int j = 0; j < contadorMesas; j++) {
                    if (mesas[j].getId_mesa() == idMesa) {
                        existe = true;
                        break;
                    }
                }

                // Agregar nueva mesa si no existe
                if (!existe) {
                    if (contadorMesas == mesas.length) {
                        Mesa_Electoral[] aux = new Mesa_Electoral[mesas.length + FACTOR_CRECIMIENTO];
                        System.arraycopy(mesas, 0, aux, 0, mesas.length);
                        mesas = aux;
                    }
                    mesas[contadorMesas] = new Mesa_Electoral(idMesa, tipoEleccion, estadoMesa, ubicacionEnCedula);
                    contadorMesas++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error al cargar las mesas: " + e.getMessage());

            //registrarlo en el archivo 'auditoria.log'
            String proceso = "Carga de Mesas Electorales";
            String tipoError = e.getClass().getName();
            String mensajeError = e.getMessage();
            Auditoria.registrarExcepcion(proceso, tipoError, mensajeError);
        }
    }

    // Imprimir todas las mesas electorales
    public static void imprimirMesas() {
        for (int i = 0; i < contadorMesas; i++) {
            System.out.println(mesas[i].toString());
        }
    }
}