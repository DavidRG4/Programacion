package com.company.Entregables;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Scanner;

public class RecorridoDOM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n;
        int caso;
        boolean salir = false;
        do {
            System.out.println("Dime que quieres hacer:");
            System.out.println("1-Mostrar el numero de hijos");
            System.out.println("2-Mostrar XML desde los hijos principales");
            System.out.println("3-Buscar por una etuqueta concreta");
            System.out.println("4-salir/nada");
            caso= sc.nextInt();
            switch (caso) {
                case 1 -> numNodosHijos();
                case 2 -> mostrarXMLDom();
                case 3 -> {
                    System.out.println("Dime la Etiqueta que quieres buscar");
                    sc.nextLine();
                    n = sc.nextLine();
                    mostrarContenidoEtiqueta(n);
                }
                default -> salir = true;
            }

        }while (!salir);
    }

    //Primera Funcion
    public static void numNodosHijos() {
        try {
            //Lectura
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("Entregable1.xml"));

            Element personas = doc.getDocumentElement();
            NodeList persona = personas.getChildNodes();

            for (int i = 0; i < persona.getLength(); i++) {
                if (persona.item(i).getNodeType() == Node.TEXT_NODE) {
                    System.out.println("El hijo de numero: " + i + " Es una etiqueta de tipo Texto");
                } else if (persona.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println("El hijo de numero: " + i + " Es una etiqueta de tipo Etiqueta");
                }
            }
            System.out.println();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static void mostrarXMLDom() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("Entregable1.xml"));

            Element personas = doc.getDocumentElement();
            NodeList persona = personas.getChildNodes();
            for (int i = 0; i < persona.getLength(); i++) {
                if (!persona.item(i).getTextContent().equals("\n")){
                    System.out.println(persona.item(i).getTextContent());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static void mostrarContenidoEtiqueta(String e) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("Entregable1.xml"));

            NodeList Etiquetas = doc.getElementsByTagName(e);
            if (Etiquetas.getLength()==0){
                System.out.println("Etiqueta no valida");
                System.out.println();
            }else{
            for (int i = 0; i < Etiquetas.getLength(); i++) {
                System.out.println(Etiquetas.item(i).getTextContent());

            }}
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


}
