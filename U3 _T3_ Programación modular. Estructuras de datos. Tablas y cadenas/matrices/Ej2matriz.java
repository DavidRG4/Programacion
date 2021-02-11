package com.company.matrices;

import java.util.Arrays;

public class Ej2matriz {
    public static void main(String[] args) {
        int[][] matriz = {{2, 3, 4}, {1, 3, 3}, {1, 2, 4}};
        System.out.println(Arrays.deepToString(sudoku(matriz)));
    }


    public static int[][] sudoku(int[][] a) {
        int[][] resut=new int[a.length+1][a[0].length+1];

        for (int i = 0; i <a.length; i++) {
            int suma=0;
            for (int j = 0; j <a[i].length; j++) {
                suma+=a[i][j];
                resut[i][j]=a[i][j];
            }
            resut[i][a[i].length]=suma;
        }

        for (int i = 0; i <a[0].length ; i++) {
            int suma2=0;
            for (int j = 0; j <a.length ; j++) {
                suma2+=resut[j][i];
            }
            resut[a.length][i]=suma2;
        }

        return resut;

    }
}
