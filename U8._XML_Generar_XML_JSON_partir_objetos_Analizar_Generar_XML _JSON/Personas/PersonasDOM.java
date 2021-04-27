package com.company.Personas;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

public class PersonasDOM {
    public static void main(String[] args) {
        try {
            //LecturA
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("Personas.xml"));

            Element personas = doc.getDocumentElement();
            NodeList persona = personas.getChildNodes();
            for (int i = 0; i < persona.getLength(); i++) {
                Node n = persona.item(i);
                if (n.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) persona.item(i);
                    NodeList nlinterior = e.getChildNodes();
                    for (int j = 0; j < nlinterior.getLength(); j++) {
                        Node nodo = nlinterior.item(j);
                        if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                            Element el = (Element) nodo;
                            if (el.getTagName().equals("nombre")) {
                                System.out.println("nombre: " + el.getTextContent());
                            }
                            if (el.getTagName().equals("edad")) {
                                System.out.println("edad: " + el.getTextContent());
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
