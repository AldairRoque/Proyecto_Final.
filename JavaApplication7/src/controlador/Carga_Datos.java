
package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import modelo.Dato;
import vista.Auditoria;

public class Carga_Datos {
    private static final int FACTOR_CRECIMIENTO = 10;
    private static Dato[] datos = new Dato[FACTOR_CRECIMIENTO]; //almacenará los registros cargados desde el archivo.
    private static int contadorDatos = 0;
    
    //Permite acceder al array datos
    public static Dato[] getDatos() {
        return datos;
    }

    public static void agregarDatos() {
        try {
            File archivo = new File("datosEleccion.csv"); //localizamos el archivo
            if (!archivo.exists()) {
                System.out.println("El archivo no se encuentra en la ruta especificada: " + archivo.getAbsolutePath()); //Si no se encuentra, muestra un mensaje de error y detiene el proceso.
                return;
            }
    
            FileReader fr = new FileReader(archivo); //Leera el archivo en modo texto
            BufferedReader br = new BufferedReader(fr); //ayuda a leer datos linea por linea
    
            String linea;
            int contador = 0;
            while ((linea = br.readLine()) != null) { //lee el archivo línea por línea
                if (contador == 0) { //se ignora porque se asume que es el encabezado
                    contador++;
                    continue;
                }
                String[] datosLinea = linea.split(";"); //divide cada linea usando ';'
    
                // Validar que la línea tenga al menos 16 columnas
                if (datosLinea.length < 16) {
                    System.out.println("Línea con formato incorrecto (omitida): " + linea);
                    continue; // Omitir la línea y pasar a la siguiente
                }
    
                //asignmaos datos
                try {
                    int ubigeo = Integer.parseInt(datosLinea[0]); // Convertir a entero
                    String departamento = datosLinea[1];
                    String provincia = datosLinea[2];
                    String distrito = datosLinea[3];
                    String tipoEleccion = datosLinea[4];
                    int mesa = Integer.parseInt(datosLinea[5]); // Convertir a entero
                    String estadoMesa = datosLinea[6];
                    int ubicacionEnCedula = Integer.parseInt(datosLinea[7]); // Convertir a entero
                    String tipoAgrupacion = datosLinea[8];
                    int codigoAgrupacion = Integer.parseInt(datosLinea[9]); // Convertir a entero
                    String agrupacionPolitica = datosLinea[10];
                    int votosObtenidos = Integer.parseInt(datosLinea[11]); // Convertir a entero
                    int electoresHabiles = Integer.parseInt(datosLinea[12]); // Convertir a entero
                    int votosBlancos = Integer.parseInt(datosLinea[13]); // Convertir a entero
                    int votosNulos = Integer.parseInt(datosLinea[14]); // Convertir a entero
                    int votosImpugnados = Integer.parseInt(datosLinea[15]); // Convertir a entero
    
                    Dato dato = new Dato(ubigeo, departamento, provincia, distrito, tipoEleccion, mesa, estadoMesa,
                            ubicacionEnCedula, tipoAgrupacion, codigoAgrupacion, agrupacionPolitica, votosObtenidos,
                            electoresHabiles, votosBlancos, votosNulos, votosImpugnados);
    
                    // Verificar si es necesario aumentar la capacidad del array
                    if (contadorDatos == datos.length) {
                        Dato[] aux = new Dato[datos.length + FACTOR_CRECIMIENTO];
                        System.arraycopy(datos, 0, aux, 0, datos.length);
                        datos = aux;
                    }
                    datos[contadorDatos] = dato; //actualiza contador
                    contadorDatos++;
                } catch (NumberFormatException e) { //si ocurre error se detiene
                    System.out.println("Error al parsear datos en la línea (omitida): " + linea);
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error al cargar los datos: " + e.getMessage());

            // Registrar el error en el archivo de auditoría
            String proceso = "Carga de Datos desde archivo CSV";
            String tipoError = e.getClass().getName();
            String mensajeError = e.getMessage();
            Auditoria.registrarExcepcion(proceso, tipoError, mensajeError);
        }
    }
    
    //imprime todos los datos almacenados en el arrayDato
    public static void imprimirDatos() {
        for (int i = 0; i < contadorDatos; i++) {
            System.out.println(datos[i]);
        }
    }
}

