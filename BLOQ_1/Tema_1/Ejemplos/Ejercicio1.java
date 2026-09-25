import java.io.File;
import java.io.IOException;

//Ejemplo 1 — Crear un fichero (File)
public class Ejercicio1 {
    public static void main(String[] args) {
        
        File fichero = new File("./BLOQ_1/Tema_1/crearFichero.txt");
try{

    if (fichero.createNewFile()) {
    System.out.println("Fichero creado: " + fichero.getName());
    } else {
    System.out.println("El fichero ya existe.");
    }
    
} catch (IOException e ) {
    e.printStackTrace();
}




    }
}
