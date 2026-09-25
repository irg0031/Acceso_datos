package EJERCICIOS;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el numero de asiento (0-19): ");
        int asiento = teclado.nextInt();

        
        if (asiento < 0 || asiento > 19) {
            System.out.println("Ese asiento no esta disponible.");
            teclado.close();
            return;
        }

        try (RandomAccessFile fichero = new RandomAccessFile("asientos.txt", "rw")) {

          
            fichero.seek(asiento);

            
            int estado = fichero.read();

            if (estado == 'C') {
                System.out.println("El asiento " + asiento + " ya esta ocupado.");
            } else if (estado == 'L') {

                fichero.seek(asiento);
                fichero.write('C');

                System.out.println("El asiento " + asiento + " ha sido comprado correctamente.");

            } else {
                System.out.println("El estado del asiento no es válido.");

            }

        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }

        teclado.close();

    }
}
