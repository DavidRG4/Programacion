package com.company.Funciones;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.println("Dime el primer numero");
        n1= sc.nextInt();
        System.out.println("Dime el segundo numero");
        n2= sc.nextInt();
         if(amigo1(n1)==amigo2(n2)){
             System.out.println(n1+" es amigo de "+n2);
         }else{
             System.out.println(n1+" no es amigo de "+n2);
         }
    }
    public static int amigo1(int a) {
      int suma=0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                suma=suma +i;
            }
        }
       return suma;
    }
public static int amigo2(int a){
    int suma=0;
    for (int i = 1; i < a; i++) {
        if (a % i == 0) {
            suma=suma +i;
        }
    }
    return suma;
}


}
