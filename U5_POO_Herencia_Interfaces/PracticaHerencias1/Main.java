package com.company.PracticaHerencias1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Coche c1=new Coche("coche1",0,"DAW12",1999,Colores.Amarillo);
        Coche c2=new Coche("coche2",0,"DAW17",2000,Colores.Rojo);
        Coche c3=new Coche("coche3",0,"DAW15",1979,Colores.Azul);
        Motocicleta m1=new Motocicleta("moto1",0,"SS12",2144,Colores.Verde);
        Motocicleta m2=new Motocicleta("moto2",0,"SS10",2144,Colores.Rojo);
        Motocicleta m3=new Motocicleta("moto3",0,"SS17",2144,Colores.Azul);
        Helicoptero h1=new Helicoptero("Helicoptero",0,234,"UOP_123");
        Avioneta a1=new Avioneta("Avioneta",0,2124,"UOP-23");

        Terrestre[] terrestres= new Terrestre[6];
        terrestres[0]=c1;
        terrestres[1]=c2;
        terrestres[2]=c3;
        terrestres[3]=m1;
        terrestres[4]=m2;
        terrestres[5]=m3;
        System.out.println(Arrays.toString(terrestres));
        Arrays.sort(terrestres);
        System.out.println(Arrays.toString(terrestres));

        h1.transportar(9);
        System.out.println(h1);
        System.out.println(c1);
    }
}
