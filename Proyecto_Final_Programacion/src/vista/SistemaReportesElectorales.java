
package vista;

import controlador.Carga_Agrupaciones;
import controlador.Carga_Datos;
import controlador.Carga_MesaElectoral;
import controlador.Carga_ResultadoEleccion;
import controlador.Carga_Ubigeo;
import java.util.Scanner;

public class SistemaReportesElectorales {
    public static void main(String[] args) {

        //controlador.Carga_Agrupaciones.ejemploBuscarAgrupacionNoExistente();
        // Solicitar login
        login.solicitarLogin();
        // Cargar todos los datos
        Carga_Datos.agregarDatos();
        Scanner lector = new Scanner(System.in);
        int opcion1 = 0;
        int opcion2 = 0;

        do {
            // Menú principal
            menuPrincipal();
            opcion1 = lector.nextInt();

            switch (opcion1) {
                case 1: // Reporte de Agrupaciones Políticas
                    do {
                        // Submenú para Agrupaciones Políticas
                        menuSubMenu();
                        opcion2 = lector.nextInt();
                        switch (opcion2) {
                            case 1:
                                Carga_Agrupaciones.cargarAgrupaciones();
                                vista.formatoAscii.imprimirAgrupacionesASCII();
                                break;
                            case 2:
                                vista.exportaciones.exportarAgrupaciones();
                                break;
                            case 3:
                                break;
                        }
                    } while (opcion2 != 3);
                    break;

                case 2: // Reporte de Mesas Electorales
                    do {
                        // Submenú para Mesas Electorales
                        menuSubMenu();
                        opcion2 = lector.nextInt();
                        switch (opcion2) {
                            case 1:
                                Carga_MesaElectoral.cargarMesas();
                                vista.formatoAscii.imprimirMesasASCII(); 
                                break;
                            case 2:
                                vista.exportaciones.exportarMesas();
                                break;
                            case 3:
                                break;
                        }
                    } while (opcion2 != 3);
                    break;

                case 3: // Reporte de Resultados de Elección
                    do {
                        // Submenú para Resultados de Elección
                        menuSubMenu();
                        opcion2 = lector.nextInt();
                        switch (opcion2) {
                            case 1:
                                Carga_ResultadoEleccion.cargarResultados();
                                vista.formatoAscii.imprimirResultadosASCII(); // Llamar al método ASCII
                                
                                break;
                            case 2:
                                vista.exportaciones.exportarResultados();
                                break;
                            case 3:
                                break;
                        }
                    } while (opcion2 != 3);
                    break;

                case 4: // Reporte de Ubigeos
                    do {
                        // Submenú para Ubigeos
                        menuSubMenu();
                        opcion2 = lector.nextInt();
                        switch (opcion2) {
                            case 1:
                                Carga_Ubigeo.cargarUbigeos();
                                vista.formatoAscii.imprimirUbigeosASCII();
                                break;
                            case 2:
                                vista.exportaciones.exportarUbigeos();
                                break;
                            case 3:
                                break;
                        }
                    } while (opcion2 != 3);
                    break;

                case 5: // Salir
                    System.out.println("Saliendo del sistema...");
                    break;
            }
        } while (opcion1 != 5);

        lector.close();
    }

    // Método para cargar los datos
    public static void cargarDatos() {
        Carga_Agrupaciones.cargarAgrupaciones();
        Carga_MesaElectoral.cargarMesas();
        Carga_ResultadoEleccion.cargarResultados();
        Carga_Ubigeo.cargarUbigeos();
    }

    // Menú principal
    public static void menuPrincipal() {
        System.out.println("\nMenu de opciones");
        System.out.println("1. Reporte de Agrupaciones Políticas");
        System.out.println("2. Reporte de Mesas Electorales");
        System.out.println("3. Reporte de Resultados de Elección");
        System.out.println("4. Reporte de Ubigeos");
        System.out.println("5. Salir");
        System.out.print("Ingrese una opcion: ");
    }

    // Submenú para cada tipo de reporte
    public static void menuSubMenu() {
        System.out.println("\nSub-Menu de opciones");
        System.out.println("1. Mostrar en pantalla");
        System.out.println("2. Exportar a archivo");
        System.out.println("3. Atras");
        System.out.print("Ingrese una opcion: ");
    }



   
    
    
}

