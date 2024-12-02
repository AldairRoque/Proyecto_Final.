
package vista;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Auditoria {
    // Método para registrar las excepciones en auditoria.log
    public static void registrarExcepcion(String proceso, String tipoError, String mensajeError) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("auditoria.log", true))) { //buffered para escribir dentro del auditoria.log, filewrite agrega registros
            // Obtener la fecha y hora actual
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String fechaHora = LocalDateTime.now().format(formatter);

            // Escribir en el archivo auditoria.log
            writer.write("Fecha: " + fechaHora + "\n");
            writer.write("Proceso: " + proceso + "\n");
            writer.write("Tipo de error: " + tipoError + "\n");
            writer.write("Mensaje de error: " + mensajeError + "\n");
            writer.write("----------------------------------------\n");

        } catch (IOException e) { //si ocurre un error se detiene
            System.out.println("Error al escribir en el archivo de auditoría: " + e.getMessage()); //en caso haya error
        }
    }
}
