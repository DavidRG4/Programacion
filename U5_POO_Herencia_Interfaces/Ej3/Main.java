package com.company.Ej3;

public class Main {
    public static void main(String[] args) {
        Caja c=new Caja(20,30,10,Medida.m);
        Caja c2=new Caja(40,60,13,Medida.cm);
        System.out.println(c);
        c.getVolumen();
        System.out.println(c2);
        c2.getVolumen();
      c.setEm(new EtiquetaMadera("daa","da","da"));

    }

}
