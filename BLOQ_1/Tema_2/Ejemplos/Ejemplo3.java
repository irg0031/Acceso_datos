import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ejemplo3 {
    public static void main(String[] args) {
      
        try {
            
            DataOutputStream dps = new DataOutputStream(new FileOutputStream(".\\Tema_2\\Ejemplos\\salida.txt"));
            dps.writeInt(123);
            dps.writeInt(987);
            dps.writeFloat(123.455F);
            dps.writeLong(94848585);
            dps.writeDouble(9.3);
            dps.close();

            DataInputStream dis = new DataInputStream(new FileInputStream(".\\Tema_2\\Ejemplos\\salida.txt"));
            int entero1 = dis.readInt();
            int entero2 = dis.readInt();
            float numeroFloat = dis.readFloat();
            long numeroLong = dis.readLong();
            double numeroDouble = dis.readDouble();

            dis.close();
            
            System.out.println("El numero entero es" + entero1 + "y " + entero2);
            System.out.println("El decimal es " + numeroFloat);



        } catch (Exception e) {
            // TODO: handle exception
        }


    }
}
