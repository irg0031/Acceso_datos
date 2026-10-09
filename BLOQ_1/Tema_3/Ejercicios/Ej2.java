package Ejercicios;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Ej2 {
    public static void main(String[] args) {
        try {
            File archivo = new File("fichero.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.parse(archivo);

            NodeList plataformas = documento.getElementsByTagName("plataforma");

            int totalVideojuegos = 0;

            for (int i = 0; i < plataformas.getLength(); i++) {

                Element plataforma = (Element) plataformas.item(i);

                String nombre = plataforma.getAttribute("nombre");

                System.out.println("Plataforma: " + nombre);

                NodeList videojuegos = plataforma.getElementsByTagName("videojuego");

                for (int j = 0; j < videojuegos.getLength(); j++) {

                    Element videojuego = (Element) videojuegos.item(j);

                    String titulo = videojuego.getElementsByTagName("titulo")
                                              .item(0).getTextContent();

                    String genero = videojuego.getElementsByTagName("genero")
                                              .item(0).getTextContent();

                    String anio = videojuego.getElementsByTagName("anio")
                                            .item(0).getTextContent();

                    System.out.println(" - Título: " + titulo);
                    System.out.println("   Género: " + genero);
                    System.out.println("   Año: " + anio);

                    totalVideojuegos++;
                }

                System.out.println("Total de videojuegos: " + videojuegos.getLength());
                System.out.println();
            }

            System.out.println("Total de plataformas: " + plataformas.getLength());
            System.out.println("Total de videojuegos del catálogo: " + totalVideojuegos);

        } catch (Exception e) {
            System.out.println("Error al leer el archivo XML");
        }
    }
}
