package com.company;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1;
        n1=sc.nextInt();
        eco(n1);
    }

    public static void eco(int a){
        for (int i = 0; i <a; i++) {
            System.out.println("Ecooo...");

        }
    }
}
