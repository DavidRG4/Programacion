package com.company.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejextra {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer [] num= new Integer[10];
        System.out.println("Dime 10 numeros distintos no dejes ninguno vacio");
        for (int i = 0; i < num.length; i++) {
            num[i]=sc.nextInt();
        }
        if (lleno(num)){
            System.out.println("Este numero esta completo");
            System.out.println(Arrays.toString(num));
        }else{
            System.out.println("Este numero esta incompleto");
            System.out.println(Arrays.toString(num));
        }
    }
    public static boolean lleno(Integer[] a){
        boolean lleno=true;
        for (int i = 0; i < a.length ; i++) {
            if (a[i]==null){
                return lleno=false;
            }
        }
        return true;
    }
}
