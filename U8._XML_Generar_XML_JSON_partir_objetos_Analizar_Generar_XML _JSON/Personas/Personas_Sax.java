package com.company.Personas;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class Personas_Sax {
    public static void main(String[] args) {
       Sax_Personas sxp=new Sax_Personas();
        try {
            SAXParserFactory spf=SAXParserFactory.newInstance();
            SAXParser sp=spf.newSAXParser();
            sp.parse(new File("Personas.xml"),sxp);
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
    }
}
