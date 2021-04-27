package com.company;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class Sax {
    public static void main(String[] args) {
        alumnoSax as= new alumnoSax();
        try {
            SAXParserFactory spf=SAXParserFactory.newInstance();
            SAXParser saxParser= spf.newSAXParser();
            saxParser.parse(new File("nuevosAlumnos.xml"),as);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
