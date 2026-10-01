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

        int tamanoBuffer = 1024;


        byte[] buffer= new byte[tamanoBuffer];

        try {
            
            BufferedInputStream entrada = new BufferedInputStream (new FileInputStream("./Tema_1/EJERCICIOS/medac.jpg"), tamanoBuffer);


            int bytesleidos;
            while ((bytesleidos= entrada.read(buffer)) != -1) {
                bloque ++;
                salida.write(buffer, 0, bytesleidos);
            }

            entrada.close();
            salida.close();

        } catch (Exception e) {
            // TODO: handle exception
        }


    }
}
