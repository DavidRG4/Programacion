package com.company.matrices;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1matriz {
    public static void main(String[] args) {
        int[][] m={{2,2,6},{1,0,4},{2,8,6}};
        int suma=0;
        for (int i = 0; i <m.length ; i++) {
            for (int j = 0; j <m[i].length ; j++) {
                suma+=m[i][j];
            }
        }
        System.out.println(Arrays.deepToString(m));
        System.out.println("La suma de todo ellos es "+suma);
    }
}
