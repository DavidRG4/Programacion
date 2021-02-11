package com.company.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] n1=new int[5];
        System.out.println("Dime losnumeros que van a formar el vector solo pares seran validos");
        System.out.println(Arrays.toString(rellenaPares(n1)));
    }

    public static int[] rellenaPares(int[] v){
        int [] result=new int[v.length];
        Scanner sc=new Scanner(System.in);
        int imp=0,n=0;
        for (int i = 0; i < v.length+imp ; i++) {
            n=sc.nextInt();
            if (n%2==0){
                result[i-imp]=n;
            }else {
                System.out.println("Solo se pueden poner pares los impares no se cuentan");
                imp++;
            }

        }
        return result;
    }

}
