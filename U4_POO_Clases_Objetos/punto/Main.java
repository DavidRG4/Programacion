package com.company.punto;

public class Main {
    public static void main(String[] args) {
        Punto p1=new Punto(2.3,4.5);
        Punto p2=new Punto(5,3.2);

        p1.dezplazaX(3);
        p2.dezplazaX(5);
        System.out.println(p1);
        System.out.println(p2);
        p1.dezplazaXY(2,7);
        p2.dezplazaXY(1,3);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.DistanciaEuclidea(p2));

    }
}
