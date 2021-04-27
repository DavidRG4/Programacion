package com.company.Personas;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class PesonasTransformer {
    public static void main(String[] args) {
        String[] nombres={"Manue","jose","Pepe"};
        String[] edades={"60","29","80"};

        TransformerFactory tf = TransformerFactory.newInstance();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Transformer transformer = null;
        try {
            transformer = tf.newTransformer();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc=db.parse(new File("Personas.xml"));
            Element root = doc.getDocumentElement();

            for (int i = 0; i < nombres.length ; i++) {
                Element persona=doc.createElement("Persona");
                Element nombre= doc.createElement("nombre");
                Element edad=doc.createElement("Edad");
                nombre.setTextContent(nombres[i]);
                edad.setTextContent(edades[i]);
                persona.appendChild(nombre);
                persona.appendChild(edad);
                root.appendChild(persona);
            }


            DOMSource oDOM = new DOMSource(root);
            File nuevosPersonas = new File("nuevosPersonas.xml");
            StreamResult destino = new StreamResult(nuevosPersonas);
            transformer.transform(oDOM, destino);

        } catch (Exception e) {
            e.printStackTrace();
        }

        transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
        transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
        transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

    }

}
