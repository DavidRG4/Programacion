package com.company;

import java.util.Scanner;

public class Ej8_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1;
        System.out.println("dime un numero");
        n1= sc.nextInt();
        for (int i = 1; i <= n1; i++) {
            System.out.println("Escribe"+i);
        }
    }
}
/*
int n1,i;
do{
     System.out.println("Escribe"+i);
     i++;

}while(i<=n1)
*/
