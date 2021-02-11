package com.company.matrices;

import java.util.Arrays;

public class Ej3_clase {
    public static void main(String[] args) {
        int[] n1 =new int[((int) (Math.random() * 20) +1)];
        String cadena=" ";
        for (int i = 0; i < n1.length; i++) {
            n1[i]= (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(n1));
        for (int i = 0; i < n1.length ; i++) {
            int num=n1[i];
            cadena+=EnString(num);

        }

        System.out.println(cadena);
    }
    public static String EnString(int a){
        String b=Integer.toString(a);
        return b;
    }
}
