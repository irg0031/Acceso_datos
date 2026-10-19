

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class LectorFicheros2 {

    // 1. Leer el primer caracter
    public int leerPrimerCaracter(String ruta) throws IOException {
        try (FileReader fr = new FileReader(ruta)) {
            return fr.read();
        }
    }

    // 2. Leer despues de cerrar el fichero
    public int leerTrasCerrar(String ruta) throws IOException {
        FileReader fr = new FileReader(ruta);
        fr.close();
        return fr.read();
    }

    // 3. Leer un entero de 4 bytes
    public int leerEntero(String ruta) throws IOException {
        try (DataInputStream in = new DataInputStream(new FileInputStream(ruta))) {
            return in.readInt();
        }
    }

    // 4. Ir a una posicion negativa
    public void irAPosicionNegativa(String ruta) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(ruta, "r")) {
            raf.seek(-1);
        }
    }

    // 5. Escribir en modo lectura
    public void escribirEnModoLectura(String ruta) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(ruta, "r")) {
            raf.write('X');
        }
    }
}
