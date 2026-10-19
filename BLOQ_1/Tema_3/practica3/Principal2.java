

import java.io.FileNotFoundException;
import java.io.IOException;

public class Principal2 {

    public static void main(String[] args) {

        LectorFicheros2 lector = new LectorFicheros2();

        // Caso 1
        try {
            System.out.println("Caso 1 -> "
                    + lector.leerPrimerCaracter("iniciales.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Caso 1 -> catch FileNotFoundException: "
                    + e.getMessage());
        } catch (IOException e) {
            System.out.println("Caso 1 -> catch IOException: " + e);
        }

        // Caso 2
        try {
            System.out.println("Caso 2 -> "
                    + lector.leerTrasCerrar("iniciales.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Caso 2 -> catch FileNotFoundException: "
                    + e.getMessage());
        } catch (IOException e) {
            System.out.println("Caso 2 -> catch IOException: " + e);
        }

        // Caso 3
        try {
            System.out.println("Caso 3 -> "
                    + lector.leerEntero("iniciales.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Caso 3 -> catch FileNotFoundException: "
                    + e.getMessage());
        } catch (IOException e) {
            System.out.println("Caso 3 -> catch IOException: " + e);
        }

        // Caso 4
        try {
            lector.irAPosicionNegativa("iniciales.txt");
            System.out.println("Caso 4 -> sin error");
        } catch (FileNotFoundException e) {
            System.out.println("Caso 4 -> catch FileNotFoundException: "
                    + e.getMessage());
        } catch (IOException e) {
            System.out.println("Caso 4 -> catch IOException: " + e);
        }

        // Caso 5
        try {
            lector.escribirEnModoLectura("iniciales.txt");
            System.out.println("Caso 5 -> sin error");
        } catch (FileNotFoundException e) {
            System.out.println("Caso 5 -> catch FileNotFoundException: "
                    + e.getMessage());
        } catch (IOException e) {
            System.out.println("Caso 5 -> catch IOException: " + e);
        }
    }
}
