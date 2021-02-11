package com.company;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       cilindro(1, 2,3);

    }


    public static double cilindro(int tipo, double radio, double altura){
        if(tipo==1){
            System.out.println("El area es"+2*Math.PI*radio*(altura*radio));
            return 2*Math.PI*radio*(altura*radio);
        }else if (tipo==2){
            System.out.println("El volumen es"+Math.PI*radio*radio*altura);
            return Math.PI*radio*radio*altura;
        }else {
            System.out.println("Error");
            return 0;
        }

    }
}
