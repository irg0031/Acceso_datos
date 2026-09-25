import java.io.File;
//Ejemplo 3 — Crear una carpeta si no existe
public class Ejercicio3 {
    public static void main(String[] args) {
        
         String nombreCarpeta = "NuevaCarpeta";
        File carpeta = new File(".\\BLOQ_1\\Tema_1", nombreCarpeta);

        if (carpeta.exists())
            System.out.println("La carpeta " + carpeta.getName() + " ya existe");
        else {
            carpeta.mkdirs();
            System.out.println("La carpeta " + carpeta.getName() + " se ha creado");
            System.out.println("Ruta absoluta " + carpeta.getAbsolutePath());
            System.out.println("Ruta relativa " + carpeta.getPath());
            System.out.println("Carpeta padre " + carpeta.getParent());
        }
    
    }
}
