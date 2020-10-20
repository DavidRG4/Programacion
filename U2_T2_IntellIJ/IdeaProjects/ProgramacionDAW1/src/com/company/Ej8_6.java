package com.company;

import java.util.Scanner;

public class Ej8_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=0,result=0;
        System.out.println("Los multiplos de 7 son");

        while (result<=100){
            result=n1*7;
            if(result<=100){
            System.out.println("7 X "+n1+" = "+result);
            n1++;
            }
        }
    }
}
