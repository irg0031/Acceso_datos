import java.io.RandomAccessFile;

public class Ejercicio6 {
    public static void main(String[] args) {
        
    try {
        
   
        RandomAccessFile file = new RandomAccessFile("./BLOQ_1/Tema_1/abecedario.txt", "rw");

        file.seek(5);
        System.out.println("Puntero Antes de leer: " + file.getFilePointer()); 
        int unbyte= file.read();
        System.out.println("Puntero Despues de leer: " + file.getFilePointer());
        System.out.println((char)unbyte);
        file.write('0');
        System.out.println("Puntero Despues de escribir: " + file.getFilePointer());


         } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
    }


    }
}
