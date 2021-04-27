package com.company.Entregables;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class RecorridoSax {
    public static void main(String[] args) {
        Sax s=new Sax();
        try {
            SAXParserFactory spf=SAXParserFactory.newInstance();
            SAXParser sp=spf.newSAXParser();
            sp.parse(new File("Entregable1.xml"),s);
        }catch (Exception e){
            System.out.printf(e.getMessage());
        }

    }
}
