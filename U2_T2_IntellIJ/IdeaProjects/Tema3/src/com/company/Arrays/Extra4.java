package com.company.Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Extra4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n1 = {3, 4, 5, 7, 8, 9, 10};
        int inc, fin, num = 0;
        int pos = 0;
//        System.out.println(Arrays.toString(n1));
//        System.out.println("que numero quires poner");
//        num = sc.nextInt();
//        System.out.println("Dime que posicion quieres ponerlo");
//        pos = sc.nextInt();
//        System.out.println("numero inicial");
//        inc = sc.nextInt();
//        System.out.println("numero final");
//        fin = sc.nextInt();
//        System.out.println(Arrays.toString(quitar2(n1, num, inc, fin, pos - 1)));
//        System.out.println(Arrays.toString(insertINC(n1, num)));
//        System.out.println(Arrays.toString(insertFIN(n1, num)));
        System.out.println(Arrays.toString(insertaOrden(n1, 12)));
        System.out.println(Arrays.toString(insertaOrden2(n1, 11)));
    }

    public static int[] quitar2(int[] a, int num, int inc, int fin, int pos) {
        int[] result = new int[a.length + 1];
        for (int i = 0; i < result.length; i++) {
            if (i == 0) {
                result[i] = inc;
            } else if (i < pos) {
                result[i] = a[i - 1];
            } else if (i == pos) {
                result[i] = num;
            } else if (i < a.length - 1) {
                result[i] = fin;
            } else {
                result[i] = a[i - 1];
            }
        }
        return result;
    }

    public static int[] insertINC(int[] a, int b) {
        int[] result = new int[a.length + 1];
        for (int i = 0; i < result.length; i++) {
            if (i == 0) {
                result[i] = b;
            } else {
                result[i] = a[i - 1];
            }
        }
        return result;
    }

    public static int[] insertFIN(int[] a, int b) {
        int[] result = new int[a.length + 1];
        for (int i = 0; i < result.length; i++) {
            if (i > a.length - 1) {
                result[i] = b;
            } else {
                result[i] = a[i];
            }
        }
        return result;
    }

    public static int[] insertaOrden(int[] a, int b) {
        int[] result = new int[a.length + 1];
        int suma = 0, fin = 0;
        for (int i = 0; i < result.length; i++) {
            if (suma < b) {
                result[i] = a[i];
                suma += result[i];
            } else if (suma >= b && fin == 0) {
                result[i] = b;
                fin++;
            } else if (fin == 1 && suma >= b) {
                result[i] = a[i - 1];
            }
        }
        return result;
    }

    public static int[] insertaOrden2(int[] a, int b) {
        int[] result = new int[a.length + 1];
        int c = 0;
        for (int i = 0; i < result.length; i++) {
            if (a[i-c] < b) {
                result[i] = a[i];
            } else if (a[i-c] >= b && c==0) {
                result[i] = b;
                c++;
            } else if (a[i-c] >= b && c == 1) {
                result[i] = a[i - 1];
            }else {
                result[i]=b;
            }

        }
        return result;
    }
}
