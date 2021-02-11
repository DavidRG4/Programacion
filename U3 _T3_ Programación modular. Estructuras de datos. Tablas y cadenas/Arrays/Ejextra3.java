package com.company.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejextra3 {
    public static void main(String[] args) {
        int[] n1={5,3,7,6,9,3};
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println(Arrays.toString(n1));
        System.out.println("Dime de que numero a numero quires cortar");
        num=sc.nextInt();
        System.out.println(Arrays.toString(quitar(n1,num)));
    }
    public static int[] quitar(int[] a,int b){
        int c=0;
        int[] resultado;
        for (int i = 0; i <a.length; i++) {
            if(a[i]==b){
               c++;
            }
        }
        if (c==0){
            return a;
        }else {
            int pos=0;
            resultado=new int[a.length-c];
            for (int i = 0; i <a.length ; i++) {
                if (a[i]!=b){
                    resultado[pos]=a[i];
                    pos++;
                }
            }
            return resultado;
        }

    }
}
