package com.company.Entregables;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Sax extends DefaultHandler {
    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("Comienzo Documento");
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.println("Final Documento");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);


        //Abro la etiqueta
        System.out.print("<"+qName);


        //Recorro los atributos (si tuviera)
        if (attributes != null) {
            for (int i = 0; i < attributes.getLength(); i++) {
                System.out.print(" "+attributes.getQName(i)+"=\""+attributes.getValue(i)+"\"");
            }
        }

        //Cierro la etiqueta
        System.out.print(">");

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);

        System.out.println("</"+qName+">");

    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
        String content = new String(ch,start,length);
        System.out.print(content);
    }
}
