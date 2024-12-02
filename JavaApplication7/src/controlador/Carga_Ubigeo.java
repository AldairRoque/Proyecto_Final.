
package controlador;

import modelo.ubigeo;
import vista.Auditoria;

public class Carga_Ubigeo {
    private static final int FACTOR_CRECIMIENTO = 10;
    private static ubigeo[] ubigeos = new ubigeo[FACTOR_CRECIMIENTO];
    private static int contadorUbigeos = 0;

    // Obtener lista de ubigeos
    public static ubigeo[] getUbigeos() {
        return ubigeos;
    }

   

    // Cargar ubigeos desde los datos
    public static void cargarUbigeos() {
        try {
            for (int i = 0; i < Carga_Datos.getDatos().length; i++) {
                if (Carga_Datos.getDatos()[i] == null) {
                    break;
                }

                // Extraer datos necesarios de Carga_Datos
                int idUbigeo = Carga_Datos.getDatos()[i].getUbigeo();
                String departamento = Carga_Datos.getDatos()[i].getDepartamento();
                String provincia = Carga_Datos.getDatos()[i].getProvincia();
                String distrito = Carga_Datos.getDatos()[i].getDistrito();

                // Verificar si el ubigeo ya existe
                boolean existe = false;
                for (int j = 0; j < contadorUbigeos; j++) {
                    if (ubigeos[j].getId_ubigeo() == idUbigeo) {
                        existe = true;
                        break;
                    }
                }

                // Agregar nuevo ubigeo si no existe
                if (!existe) {
                    if (contadorUbigeos == ubigeos.length) {
                        ubigeo[] aux = new ubigeo[ubigeos.length + FACTOR_CRECIMIENTO];
                        System.arraycopy(ubigeos, 0, aux, 0, ubigeos.length);
                        ubigeos = aux;
                    }
                    ubigeos[contadorUbigeos] = new ubigeo(idUbigeo, departamento, provincia, distrito);
                    contadorUbigeos++;
                }
                //int ubigeo = Integer.parseInt("abc");
            }
        } catch (Exception e) {
            System.out.println("Error al cargar los ubigeos: " + e.getMessage());

             // Registrar el error en el archivo de auditoría
            String proceso = "Carga de Ubigeos desde datos";
            String tipoError = e.getClass().getName();
            String mensajeError = e.getMessage();
            Auditoria.registrarExcepcion(proceso, tipoError, mensajeError);
        }
    }

    // Imprimir todos los ubigeos
    public static void imprimirUbigeos() {
        for (int i = 0; i < contadorUbigeos; i++) {
            System.out.println(ubigeos[i].toString());
        }
    }
}
