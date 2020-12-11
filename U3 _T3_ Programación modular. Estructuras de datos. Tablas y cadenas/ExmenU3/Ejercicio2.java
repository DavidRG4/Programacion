package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[(int) (Math.random() * 20)];
        int pos = 0, val = 0;
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(v));
        System.out.println("Dime un Valor");
        val = sc.nextInt();
        System.out.println("Dime La posicion");
        pos = sc.nextInt();
        if (pos > v.length) {
            System.out.println("Esa posicion excede los limites prueba otra");
        }
        while (pos>v.length){
            pos = sc.nextInt();
            if (pos > v.length) {
                System.out.println("Esa posicion excede los limites prueba otra");
            }
        }

        System.out.println(Arrays.toString(insertarValor(v,val,pos)));
    }

    public static int[] insertarValor(int[] v1, int vl, int p) {
        int[] result = new int[v1.length + 1];
        boolean x=false;
        for (int i = 0; i < result.length; i++) {
            if (i==p) {
                result[i]=vl;
                x=true;
            } else if (x){
                result[i]=v1[i-1];
            }else {
                result[i]=v1[i];
            }
        }
        return result;
    }
}
