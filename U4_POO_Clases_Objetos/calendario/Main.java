package com.company.calendario;

public class Main {
    public static void main(String[] args) {
        Fecha f=new Fecha(2,3,5);
        System.out.println(f);
        f.incrementarAnio(200);
        System.out.println(f);
        f.incrementarDia(23);
        System.out.println(f);
        f.incrementarMes(1);
        System.out.println(f);
        System.out.println(f.Iguales(2000,3,21));
    }
}
