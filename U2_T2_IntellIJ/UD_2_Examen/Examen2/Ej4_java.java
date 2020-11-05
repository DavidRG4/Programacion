package com.company;

import java.util.Scanner;

public class Ej4_java {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=-1,m=-1,s=-1,n1=0;
        while(h<0 || h>=24){
        System.out.print("Dime la hora: ");
        h= sc.nextInt();
        }
        while (m<0 || m>=60){
        System.out.print("Dime los minutos: ");
        m=sc.nextInt();
        }
        while (s<0 || s>=60){
        System.out.print("Dime los segundos: ");
        s= sc.nextInt();
        }
        System.out.print("Segundos a incrementar: ");
        n1=sc.nextInt();
        for (int i = 0; i <=n1; i++) {
            System.out.println(h+":"+m+":"+s);
            s++;
            if (s==60 || s==61){
                m++;
                s=0;
            }
            if (m==60){
                h++;
                m=0;
            }
            if (h==24){
                h=0;
            }

        }



    }
}
