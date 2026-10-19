
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomExcepciones {

    public static void main(String[] args) {

        String fichero = "fichero.xml";
        String etiqueta = "titulo";
        String atributo = "nombre";
        String expresion = "/plataformas/plataforma";

        try {
            DocumentBuilderFactory factory =
                    DocumentBuilderFactory.newInstance();

            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new File(fichero));
            doc.getDocumentElement().normalize();

            XPath xPath = XPathFactory.newInstance().newXPath();

            NodeList plataformas = (NodeList) xPath.compile(expresion)
                    .evaluate(doc, XPathConstants.NODESET);

            for (int i = 0; i < plataformas.getLength(); i++) {
                Element plataforma = (Element) plataformas.item(i);

                String nombre = plataforma.getAttribute(atributo);

                String videojuego = plataforma
                        .getElementsByTagName(etiqueta)
                        .item(0)
                        .getTextContent();

                System.out.println("Plataforma: " + nombre
                        + " (videojuego: " + videojuego + ")");
            }

        } catch (ParserConfigurationException e) {
            System.out.println("Error de configuración del analizador: "
                    + e.getMessage());

        } catch (IOException e) {
            System.out.println("Error de lectura del fichero XML ("
                    + e.getClass().getSimpleName() + "): "
                    + e.getMessage());

        } catch (SAXException e) {
            System.out.println("Error SAX ("
                    + e.getClass().getSimpleName() + "): "
                    + e.getMessage());

        } catch (XPathExpressionException e) {
            System.out.println("Error en la expresión XPath: "
                    + e.getMessage());

        } catch (Exception e) {
            System.out.println("Otro error ("
                    + e.getClass().getSimpleName() + "): "
                    + e.getMessage());
        }
    }
}
