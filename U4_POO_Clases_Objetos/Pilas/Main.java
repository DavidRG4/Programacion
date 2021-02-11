package com.company.Pilas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0;
        Integer apilado;
        PilaTablas p1=new PilaTablas();
        do {
            System.out.println("Dime si quieres apilar -1- o desapilar -2- o salir -3-" );
            num= sc.nextInt();
            if (num==1){
                System.out.println("Dime que numero quieres apilar");
                apilado=sc.nextInt();
                p1.apilar(apilado);
                System.out.println(p1);
            }else if (num==2){
                System.out.println("Se ha deapilado");
                p1.desapilar();
                System.out.println(p1);
            }
        }while (num!=3);


    }
}
