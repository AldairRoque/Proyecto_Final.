
package controlador;

import modelo.Resultado_Eleccion;
import vista.Auditoria;

public class Carga_ResultadoEleccion {
    private static final int FACTOR_CRECIMIENTO = 10;
    private static Resultado_Eleccion[] resultados = new Resultado_Eleccion[FACTOR_CRECIMIENTO];
    private static int contadorResultados;

    // Obtener la lista de resultados de elecciones
    public static Resultado_Eleccion[] getResultados() {
        return resultados;
    }


    // Cargar resultados desde los datos
    public static void cargarResultados() {
        try {
            for (int i = 0; i < Carga_Datos.getDatos().length; i++) {
                if (Carga_Datos.getDatos()[i] == null) {
                    break;
                }

                // Extraer datos necesarios de Carga_Datos
                String agrupacion = Carga_Datos.getDatos()[i].getAgrupacion();
                int votosObtenidos = Carga_Datos.getDatos()[i].getVotos_obtenidos();
                int electoresHabiles = Carga_Datos.getDatos()[i].getElectores_habiles();
                int votosBlancos = Carga_Datos.getDatos()[i].getVotos_blancos();
                int votosNulos = Carga_Datos.getDatos()[i].getVotos_nulos();
                int votosImpugnados = Carga_Datos.getDatos()[i].getVotos_impugnados();

                // Verificar si el resultado ya existe
                boolean existe = false;
                for (int j = 0; j < contadorResultados; j++) {
                    if (resultados[j].getAgrupacion().equals(agrupacion)) {
                        // Si la agrupación ya existe, sumar los votos obtenidos
                        resultados[j].sumarVotos(votosObtenidos); 
                        resultados[j].sumarElectoreshabiles(electoresHabiles);
                        resultados[j].sumarVotosBlancos(votosBlancos);
                        resultados[j].sumarVotosNulos(votosNulos);
                        //resultados[j].sumarVotosImpugnados(votosImpugnados);
                        // Llamada correcta al método
                        existe = true;
                      
                        break;
                    }
                }

                // Agregar nuevo resultado si no existe
                if (!existe) {
                    if (contadorResultados == resultados.length) {
                        Resultado_Eleccion[] aux = new Resultado_Eleccion[resultados.length + FACTOR_CRECIMIENTO];
                        System.arraycopy(resultados, 0, aux, 0, resultados.length);
                        resultados = aux;
                    }
                    resultados[contadorResultados] = new Resultado_Eleccion(
                            agrupacion,
                            votosObtenidos,
                            electoresHabiles,
                            votosBlancos,
                            votosNulos,
                            votosImpugnados
                    );
                    contadorResultados++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error al cargar los resultados: " + e.getMessage());

            // Registrar el error en el archivo de auditoría
            String proceso = "Carga de Resultados de Elección desde datos";
            String tipoError = e.getClass().getName();
            String mensajeError = e.getMessage();
            Auditoria.registrarExcepcion(proceso, tipoError, mensajeError);
        }
    }

    // Imprimir todos los resultados de las elecciones
    public static void imprimirResultados() {
        for (int i = 0; i < contadorResultados; i++) {
            System.out.println(resultados[i].toString());
        }
    }
}

