package com.company.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Double[] numeros =new Double[5];
        System.out.println("Dime 5 numeros");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= sc.nextDouble();
        }
        System.out.println(Arrays.toString(numeros));
    }
}
