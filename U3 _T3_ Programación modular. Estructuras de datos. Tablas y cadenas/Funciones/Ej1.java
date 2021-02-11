package com.company.Funciones;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Dime 3 numeros");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        System.out.println(sumanumeros(n1,n2,n3));
    }
    public static int sumanumeros(int a,int b, int c){
        return a+b+c;
    }
}
