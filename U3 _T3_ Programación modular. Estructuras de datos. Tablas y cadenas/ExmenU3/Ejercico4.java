package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercico4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] original = new int[4][5];
        int total = -1, pedido = 0;
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                original[i][j] = (int) ((Math.random() + 10) * 10);
                total++;
            }
        }
        System.out.println(  Arrays.deepToString(original));

        System.out.println("Dime una posicion y te dare un numero");
        pedido = sc.nextInt();
        if (pedido >= total || pedido < 0) {
            System.out.println("Devuelve: -1");
        } else {
            System.out.println("Devuelve: "+nEsimo(original, pedido));
        }
    }

    public static int nEsimo(int[][] o, int vl) {
        int result = 0, P = 0;
        if (vl == 0) {
            result = o[0][0];
        } else {
            for (int i = 0; i < o.length; i++) {
                for (int j = 0; j < o.length; j++) {
                    P++;
                    if (P == vl-1) {
                        result = o[i][j];
                    }
                }
            }
        }
        return result;
    }
}
