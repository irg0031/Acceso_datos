package EJERCICIOS;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class ej5 {
    public static void main(String[] args) {
        
        try {

            FileInputStream fis = new FileInputStream("./BLOQ_1/Tema_1/EJERCICIOS/medac.jpg");
            FileOutputStream fos = new FileOutputStream("./BLOQ_1/Tema_1/EJERCICIOS/medac_copia.jpg");

            int data;
            int contador =0;
            long inicio1 = System.currentTimeMillis();
            while((data=fis.read()) != -1) {
                fos.write(data);
                contador++;

            }
            System.out.println("Se han copiado " + contador + " bytes");
            long final1= System.currentTimeMillis();
            System.out.println("FileInputStream ha tardado " + (final1-inicio1) + " ms");

            fis.close();
            fos.close();

        } catch (Exception e) {
            // TODO: handle exception
        }


        try {
            
            String origen2 = "./BLOQ_1/Tema_1/EJERCICIOS/medac.jpg";
            BufferedInputStream entrada = new BufferedInputStream(new FileInputStream(origen2));
            BufferedOutputStream salida = new BufferedOutputStream(new FileOutputStream("./BLOQ_1/Tema_1/EJERCICIOS/medac_buffer.jpg"));

            byte[] buffered = new byte[4096];

            int bytesLeidos;
            int contador=0;
            long ms = System.currentTimeMillis();


            while ((bytesLeidos = entrada.read(buffered)) != -1) {
                    salida.write(buffered, 0, bytesLeidos);
                    contador++;
            }

            long msdespues = System.currentTimeMillis();

            System.out.println("Ha pasado " + (msdespues-ms) + "ms");

            salida.close();
            entrada.close();


        } catch (Exception e) {
            // TODO: handle exception
        }



    }
}
