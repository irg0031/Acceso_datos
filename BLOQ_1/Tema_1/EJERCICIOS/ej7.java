package EJERCICIOS;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        
         
  Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la posicion inicial (0-19): ");
        int inicio = teclado.nextInt();

        System.out.print("Cuantos asientos quieres consultar?: ");
        int cantidad = teclado.nextInt();

        if (inicio < 0 || inicio > 19 || cantidad <= 0 || inicio + cantidad > 20) {
            System.out.println("El rango de asientos no es valido.");
            teclado.close();
            return;
        }

        try (RandomAccessFile fichero = new RandomAccessFile("asientos.txt", "r")) {

            fichero.seek(inicio);

            byte[] asientos = new byte[cantidad];

            int bytesLeidos = fichero.read(asientos, 0, cantidad);

            if (bytesLeidos == cantidad) {

                System.out.println("\nEstado de los asientos:");

                for (int i = 0; i < cantidad; i++) {
                    char estado = (char) asientos[i];

                    System.out.println("Asiento " + (inicio + i) + ": " + estado);
                }

            } else {
                System.out.println("No se han podido leer todos los asientos.");
            }

        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        }

        teclado.close();




    }
}
