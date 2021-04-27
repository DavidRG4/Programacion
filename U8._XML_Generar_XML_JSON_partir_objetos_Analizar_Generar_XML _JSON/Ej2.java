package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Ej2 {
    public static void main(String[] args) {
        String[] nombres = {"Pepe", "Manue", "Jose", "Maria", "Marco"};
        String[] apellidos = {"Perez", "Lopez", "Castallo", "Rivera", "Garcia"};
        try {
            TransformerFactory tf = TransformerFactory.newInstance();
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File("Alumnos.xml"));
            Element root = doc.getDocumentElement();

            for (int i = 0; i < nombres.length; i++) {
                Element alumno = doc.createElement("alumno");
                Element nombre = doc.createElement("nombre");
                nombre.setTextContent(nombres[i]);
                Element apellido = doc.createElement("apellido");
                apellido.setTextContent(apellidos[i]);
                alumno.appendChild(nombre);
                alumno.appendChild(apellido);
                root.appendChild(alumno);
            }


            DOMSource oDOM = new DOMSource(root);
            File nuevosAlumnos = new File("nuevosAlumnos.xml");
            StreamResult destino = new StreamResult(nuevosAlumnos);
            transformer.transform(oDOM, destino);

        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }


    }
}
