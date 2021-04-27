package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Ejemplo_1 {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder db= dbf.newDocumentBuilder();

            Document doc =db.parse(new File("horario.xml"));

            NodeList horario= doc.getElementsByTagName("dia");

            Node dia=horario.item(0);
            if (dia.hasChildNodes()){
                NodeList nlInterior= dia.getChildNodes();
                for (int i = 0; i < nlInterior.getLength(); i++) {
                    Node nodo = nlInterior.item(i);
                    if (nodo.getNodeType()==Node.ELEMENT_NODE){
                        Element e= (Element) nodo;
                        System.out.println(e.getTagName()+" : "+e.getTextContent());
                    }
                }
            }
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }

    }
}
