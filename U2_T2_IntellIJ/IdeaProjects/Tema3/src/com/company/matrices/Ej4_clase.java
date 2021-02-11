package com.company.matrices;

import java.util.Arrays;

public class Ej4_clase {
    public static void main(String[] args) {
        int [] n1=new int[(int)(Math.random()*10+1)];
        for (int i = 0; i < n1.length; i++) {
            n1[i]=(int) (Math.random()*200);
        }
        System.out.println(Arrays.toString(n1));
        System.out.println("El numero elegido fue: "+devuelveR(n1));
    }
    public static int devuelveR(int[] a){

        return a[(int)(Math.random()*a.length)];
    }
}
