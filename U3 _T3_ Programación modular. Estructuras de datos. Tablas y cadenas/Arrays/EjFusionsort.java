package com.company.Arrays;

import java.util.Arrays;

public class EjFusionsort {
    public static void main(String[] args) {
        int[] n1 = {5, 3, 4};
        int[] n2 = {7, 6, 10,82,5,23,562,53,24,241,4,3141,34,};
        int[] n3 = new int[n1.length + n2.length];
        for (int i = 0; i < n3.length; i++) {
            if (i<= n1.length-1){
                n3[i]=n1[i];
            }else {
                n3[i]=n2[i- n1.length];
            }
        }
        Arrays.sort(n3);
        System.out.println(Arrays.toString(n3));
    }


}
