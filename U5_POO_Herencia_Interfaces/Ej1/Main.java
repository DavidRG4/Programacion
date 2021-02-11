package com.company.Ej1;

public class Main {
    public static void main(String[] args) {
        Hora h=new Hora(12,23);
        Hora12 h12A=new Hora12(11,59,"am");
        Hora12 h12B=new Hora12(11,59,"pm");
        Hora12 h12C=new Hora12(12,59,"pm");
        HoraExacta he=new HoraExacta(14,23,54);
        HoraExacta he2=new HoraExacta(14,23,54);

        System.out.println(h12A);
        h12A.inc();
        System.out.println(h12A);
        h12B.inc();
        System.out.println(h12B);
        h12C.inc();
        System.out.println(h12C);
    }
}
