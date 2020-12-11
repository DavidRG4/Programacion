package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
    int [] original=new int[(int) (Math.random()*10)];
        for (int i = 0; i <original.length ; i++) {
            original[i]=(int) (Math.random()*200);
        }
        System.out.println("Este es el Arrays original");
        System.out.println(Arrays.toString(original));
        System.out.println("Y Este es un numero aleatorio que contiene el Arrays original");
        System.out.println(aleatorioDeArrays(original));
    }

    public static int aleatorioDeArrays(int[] a){
        int result=0,b;
        b=(int)(Math.random()*a.length);
        result=a[b];
        return result;
    }
}
