package Ejercicios;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Ej1 {
    public static void main(String[] args) {
        

        try {
            File archivo = new File("fichero.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.parse(archivo);

            NodeList bibliotecas = documento.getElementsByTagName("library");

            for (int i = 0; i < bibliotecas.getLength(); i++) {

                Element biblioteca = (Element) bibliotecas.item(i);

                String nombre = biblioteca.getElementsByTagName("name")
                                          .item(0).getTextContent();

                String ubicacion = biblioteca.getAttribute("location");

                System.out.println("Biblioteca: " + nombre + " (" + ubicacion + ")");

                NodeList libros = biblioteca.getElementsByTagName("book");

                for (int j = 0; j < libros.getLength(); j++) {

                    Element libro = (Element) libros.item(j);

                    String titulo = libro.getElementsByTagName("title")
                                         .item(0).getTextContent();

                    String autor = libro.getElementsByTagName("author")
                                        .item(0).getTextContent();

                    String anio = libro.getElementsByTagName("year")
                                       .item(0).getTextContent();

                    System.out.println(" - " + titulo + " (" + autor + ", " + anio + ")");
                }

                System.out.println("Total de libros: " + libros.getLength());
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("Error al leer el archivo XML");
        }


    }
}
