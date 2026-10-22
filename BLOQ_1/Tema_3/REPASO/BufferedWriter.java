package REPASO;

import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter {
    public static void main(String[] args) {
        
        String ruta = "archivo.txt";

        try (FileWriter escritor = new FileWriter(ruta)) {
            escritor.write("Hola, este es un texto de prueba.\n");
            escritor.write("Escribiendo una segunda línea.");
            System.out.println("Fichero creado y escrito correctamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir el fichero: " + e.getMessage());
        }




    }
}
