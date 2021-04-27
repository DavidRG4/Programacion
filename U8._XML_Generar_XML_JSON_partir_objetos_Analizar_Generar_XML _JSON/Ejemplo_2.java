package com.company;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Ejemplo_2 {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        {
            try {
                DocumentBuilder db = dbf.newDocumentBuilder();
                Document doc = db.parse(new File("Banco.xml"));
                Element banco = doc.getDocumentElement();
                NodeList cuentas = banco.getChildNodes();

                for (int i = 0; i < cuentas.getLength(); i++) {
                    Node n = cuentas.item(i);

                    if (n.getNodeType() == Node.ELEMENT_NODE) {

                        Element e = (Element) cuentas.item(i);
                        Attr a = e.getAttributeNode("cc");
                        System.out.println("CC: " + a.getValue());
                        //System.out.println("CC: "+e.getAttribute("cc"));


                        NodeList nlInterior = e.getChildNodes();
                        for (int j = 0; j < nlInterior.getLength(); j++) {
                            Node nodo = nlInterior.item(j);
                            if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                                Element el = (Element) nodo;
                                if (el.getTagName().equalsIgnoreCase("cliente")) {
                                    String nombre= el.getElementsByTagName("nombre").item(0).getTextContent();
                                    String apellido=el.getElementsByTagName("apellido").item(0).getTextContent();
                                    System.out.println("Cliente: "+nombre+" , "+apellido);
                                }
                                if (el.getTagName().equals("saldo")) {
                                    System.out.println("Saldo: " + el.getTextContent());
                                }
                            }
                        }

                    }
                }
            } catch (ParserConfigurationException | SAXException | IOException e) {
                e.printStackTrace();
            }
        }
    }

}
