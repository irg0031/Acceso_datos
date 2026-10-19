package practica3;

import java.io.FileReader;
import java.io.IOException;

public class Paso1 {
    public static void main(String[] args) {
        String ruta = "BLOQ_1/Tema_3/practica3/mis_datos.txt";
        // PRUEBA 1: cambia la ruta por "no_existe.txt"
        // PRUEBA 2: deniega al fichero mis_datos.txt el permiso de lectura desde Windows

        try (FileReader file = new FileReader(ruta)) {
            int c;
            while ((c = file.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.toString());
        }
    }
}