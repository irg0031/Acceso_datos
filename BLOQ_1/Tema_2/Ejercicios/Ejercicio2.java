package BLOQ_1.Tema_2.Ejercicios;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Indica que linea quieres leer: ");
        int numeroLinea = sc.nextInt();

        LineNumberReader lector = new LineNumberReader(new FileReader("./Tema_2/Ejercicios/salida.txt"));

        String linea = null;

        while (lector.getLineNumber() < numeroLinea) {
            linea = lector.readLine();

            if (linea == null) {
                break;
            }
        }

        if (linea != null) {
            System.out.println("Contenido de la linea numero " + numeroLinea + ":");
            System.out.println(linea);
        } else {
            System.out.println("La linea " + numeroLinea + " no existe.");
        }

        lector.close();
        sc.close();

    }
}
