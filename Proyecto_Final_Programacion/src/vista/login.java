
package vista;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class login {
    public static boolean autenticarUsuario(String usuario, String contrasena) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("usuarios.txt")); //lee el archivo usuario.txt
            String linea;
            while ((linea = reader.readLine()) != null) { //lee lineas del archivo
                String[] credenciales = linea.split(";"); //divide el arreglo en 2 elementos
                if (credenciales.length == 2) { //comprueba que este dividio en 2
                    String usuarioArchivo = credenciales[0];
                    String contrasenaArchivo = credenciales[1];
                    if (usuarioArchivo.equals(usuario) && contrasenaArchivo.equals(contrasena)) { //compara credenciales
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de usuarios."); //muestra el error
        }
        return false;
    }

    public static void solicitarLogin() {
        Scanner scanner = new Scanner(System.in);
        String usuario;
        String contrasena;
        int intentos = 0;
        boolean autenticado = false;

        while (intentos < 3 && !autenticado) {
            System.out.print("Ingrese su usuario: ");
            usuario = scanner.nextLine();
            System.out.print("Ingrese su contraseña: ");
            contrasena = scanner.nextLine();

            autenticado = autenticarUsuario(usuario, contrasena);

            if (autenticado) {
                System.out.println("Bienvenido al sistema.");
            } else {
                intentos++;
                System.out.println("Credenciales incorrectas. Intento " + intentos + " de 3.");
            }
        }
        //finalizar tras 3 intentos fallidos
        if (!autenticado) {
            System.out.println("Demasiados intentos fallidos. Saliendo...");
            System.exit(0);  // Finaliza el programa si los intentos fallan.
        }
    }
}
