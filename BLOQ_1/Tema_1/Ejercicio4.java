import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//Ejemplo 4 — Lectura y escritura con caracteres (FileReader / FileWriter)
public class Ejercicio4 {
    public static void main(String[] args) {
        
        try {
           FileReader lector = new FileReader("./BLOQ_1/Tema_1/prueba.txt");
           FileWriter escritor = new FileWriter("./BLOQ_1/Tema_1/escritura.txt");
        int data;
        while ((data = lector.read()) != -1) {
            escritor.write(data);
            System.out.print((char)data);
        }
        
        lector.close();
        escritor.close();
        System.out.println("\nLectura correcta");

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
