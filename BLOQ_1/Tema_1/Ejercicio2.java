import java.io.File;
//Ejemplo 2 — Mover un fichero con renameTo
public class Ejercicio2 {
    public static void main(String[] args) {
        
        File fichero0 = new File("./BLOQ_1/Tema_1/crearFichero.txt");
        File carpeta = new File("./BLOQ_1/Tema_1/", "backup");   
        carpeta.mkdirs();

        File destino = new File("./BLOQ_1/Tema_1/backup/fichero_movido.txt");
        if (fichero0.renameTo(destino)) {
            System.out.println("El fichero se ha movido correctamente");
        } else {
            System.out.println("El fichero no se ha podido mover");
        }

    }
}
