package com.company;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n;
        TreeSet<String> palabras=new TreeSet<>();
        System.out.println("Dime una serie de nombre, di fin para acabar");
        do {
            n=sc.nextLine();
            if (!n.equals("fin")){
                palabras.add(n);
            }
        }while (!n.equals("fin"));

        System.out.println(palabras);

    }
}
