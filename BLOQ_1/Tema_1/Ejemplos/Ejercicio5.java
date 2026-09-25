import java.io.FileInputStream;
import java.io.FileOutputStream;

//Ejemplo 5 — Lectura y escritura con bytes (FileInputStream / FileOutputStream)
public class Ejercicio5 {
    public static void main(String[] args) {
        
        String path = "./BLOQ_1/Tema_1/images.jpg";
        String pathEscritura = "./BLOQ_1/Tema_1/copia.jpg";
        int num = 0;

        try {
            FileInputStream entrada = new FileInputStream(path);
            FileOutputStream salida = new FileOutputStream(pathEscritura);
            int data;
            while ((data = entrada.read()) != -1) {
                num ++;
               salida.write(data);
            }
            entrada.close();
            salida.close();
            System.out.println(num);
        } catch (Exception e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }



    }

}
