package EJERCICIOS;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ej4 {
    public static void main(String[] args) {

        String origen = "images.jpg";
        String destino = "foto_copia_buffer.jpg";

        byte[] buffer = new byte[1024];
        int bytesLeidos;
        int numeroBloque = 1;

        try (BufferedInputStream entrada = new BufferedInputStream(new FileInputStream(origen));
                BufferedOutputStream salida = new BufferedOutputStream(new FileOutputStream(destino))) {

            // Leer y escribir bloques de 1024 bytes
            while ((bytesLeidos = entrada.read(buffer)) != -1) {

                salida.write(buffer, 0, bytesLeidos);

                System.out.println("Fin copia bloque " + numeroBloque);
                numeroBloque++;
            }

            System.out.println("Copia finalizada correctamente.");

        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }

    }
}
