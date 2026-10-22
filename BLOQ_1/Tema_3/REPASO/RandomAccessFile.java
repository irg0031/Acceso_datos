package REPASO;

import java.io.IOException;

public class RandomAccessFile {
    public static void main(String[] args) {
        String ruta = "datos.dat";

        try (RandomAccessFile raf = new RandomAccessFile(ruta, "rw")) { // "rw" = lectura y escritura
            // Escribir datos
            raf.writeInt(100);
            raf.writeUTF("Hola Mundo");

            // Mover el puntero al inicio del archivo (posición 0)
            raf.seek(0);

            // Leer datos
            int numero = raf.readInt();
            String texto = raf.readUTF();

            System.out.println("Número: " + numero);
            System.out.println("Texto: " + texto);

        } catch (IOException e) {
            System.err.println("Error con RandomAccessFile: " + e.getMessage());
        }
    }
}
