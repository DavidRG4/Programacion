package com.company;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1;
        System.out.println("Dime un numero");
        n1=sc.nextInt();
        System.out.println(primos(n1));
    }
    public static int primos(int a){
        int contador=0;
        for (int i = 1; i <a ; i++) {
            if (esprimo(i)){
                contador++;
            }
        }
        return contador;
    }
public static boolean esprimo(int b){
    for (int i = 2; i <b ; i++) {
        if (b%i!=0){
            return false;
        }
    }
    return true;
}
}
