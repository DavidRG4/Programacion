package com.company.matrices;

import java.util.Arrays;

public class Ej2_clase {
    public static void main(String[] args) {
        int[] n1 = new int [(int) (Math.random() * 50) + 1];
        for (int i = 0; i < n1.length; i++) {
            n1[i] = (int) (Math.random() * 1001);
        }
        System.out.println(Arrays.toString(n1));
        System.out.println(Arrays.toString(filtracion7(n1)));

    }

    public static int[] filtracion7(int v[]) {
        int[] result = new int[0];
        for (int n : v) {
            if (tieneCifra(n,7)){
                result=Arrays.copyOf(result,result.length+1);
                result[result.length-1]=n;
            }
        }

        return result;
    }

    public static boolean tieneCifra(int num,int cifra){
        String numero=String.valueOf(num);
        return numero.contains(Integer.toString(cifra));
    }
}
