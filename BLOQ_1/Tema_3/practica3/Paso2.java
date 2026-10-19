package practica3;

import java.io.FileWriter;
import java.io.IOException;

public class Paso2 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("archivo.txt")) {
            fw.write("hola");
        } catch (IOException e) {
            System.out.println("Error de escritura: " + e.toString());
        }
    }
}