package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String frase="";
        System.out.println("Dime una frase");
        frase=sc.nextLine();
        ArrayList<String> F=new ArrayList<>();
        String[] palabras= frase.split(" ");
        for (int i = 0; i <palabras.length ; i++) {
            F.add(palabras[i]);

        }


    }
}
