package com.company;

import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,result=1;
        System.out.println("Dime un número y te dire su factorial");
        n1= sc.nextInt();
        for (int i = n1; i >= 1; i--) {
            result=result*i;
        }
        System.out.println(result);
    }
}
