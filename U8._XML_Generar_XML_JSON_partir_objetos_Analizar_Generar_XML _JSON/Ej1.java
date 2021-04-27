package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class Ej1 {
    public static void main(String[] args) {
        String[] asignaturas = {"DBD", "DBD", "SIS", "SIS", "PROG", "PROG", "PROG"};
        TransformerFactory tf = TransformerFactory.newInstance();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            Transformer transformer = tf.newTransformer();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("horario.xml"));
            Element root = doc.getDocumentElement();
            Element lunes = (Element) doc.getElementsByTagName("dia").item(0);
            root.removeChild(lunes);

            Element martes = doc.createElement("dia");
            martes.setAttribute("nombre", "martes");

            for (int i = 0; i < asignaturas.length; i++) {
                Element tramo = doc.createElement("tramo");
                tramo.setTextContent(asignaturas[i]);

                //Text a = doc.createTextNode(asignaturas[i]);
                //tramo.appendChild(a);

            martes.appendChild(tramo);
            }
            root.appendChild(martes);

            DOMSource oDOM = new DOMSource(root);
            File nuevoHorario = new File("nuevoHorario.xml");
            StreamResult destino = new StreamResult(nuevoHorario);

            transformer.transform(oDOM, destino);
        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            e.printStackTrace();
        }


    }
}
