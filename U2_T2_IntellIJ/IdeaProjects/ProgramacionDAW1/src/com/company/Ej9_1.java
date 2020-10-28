package com.company;

import java.util.Scanner;

public class Ej9_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text1;
        String text2;
        int t1=0,t2=0;
        System.out.println("Dime la primera palabra");
        text1= sc.nextLine();
        System.out.println("Dime la segunda palabra");
        text2= sc.nextLine();
        for (int i = 0; i < text1.length(); i++) {
            t1++;
        }
        for (int i = 0; i < text2.length(); i++) {
            t2++;
        }
        if (t1<t2){
            System.out.println(text2+" Es la palabra mas larga");
        }else if (t1>t2){
            System.out.println(text1+" Es la palabra mas larga");
        }else{
            System.out.println("Las dos palabras son igual de largas");
        }
    }
}
