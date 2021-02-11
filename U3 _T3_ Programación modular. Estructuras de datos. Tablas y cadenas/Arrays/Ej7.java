package com.company.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n1 = new int[5];
        int[] n2 = new int[5];
        int[] n3 = new int[5];
        double med1 = 0, med2 = 0, med3 = 0;
        double a1=0,a2=0,a3=0,a4=0,a5=0;

        System.out.println("Notas del 1 trimestre");
        for (int i = 0; i < n1.length; i++) {
            n1[i] = sc.nextInt();
            med1 += n1[i];
        }
        med1 = med1 / n1.length;

        System.out.println("otas del 2 trimestre");
        for (int i = 0; i < n1.length; i++) {
            n2[i] = sc.nextInt();
            med2 += n2[i];
        }
        med2 = med2 / n2.length;

        System.out.println("Notas del 3 trimestre");
        for (int i = 0; i < n1.length; i++) {
            n3[i] = sc.nextInt();
            med3 += n3[i];
        }
        med3 = med3 / n3.length;

        for (int i = 0; i < n1.length; i++) {
            if (i == 0) {
                a1=n1[i]+n3[i]+n2[i];
                a1=a1/ 3;
            } else if (i == 1) {
                a2=n1[i]+n3[i]+n2[i];
                a2=a2/ 3;
            } else if (i == 2) {
                a3=n1[i]+n3[i]+n2[i];
                a3=a3/ 3;
            } else if (i == 3) {
                a4=n1[i]+n3[i]+n2[i];
                a4=a4/3;
            } else if (i == 4) {
                a5=n1[i]+n3[i]+n2[i];
                a5=a5/3;
            }
        }

        System.out.println("La media del grupo del 1ªtri " + med1);
        System.out.println("La media del grupo del 2ªtri " + med2);
        System.out.println("La media del grupo del 3ªtri " + med3);
        System.out.println("La media del 1º alumno es "+a1);
        System.out.println("La media del 2º alumno es "+a2);
        System.out.println("La media del 3º alumno es "+a3);
        System.out.println("La media del 4º alumno es "+a4);
        System.out.println("La media del 5º alumno es "+a5);
        System.out.println(Arrays.toString(n1));
        System.out.println(Arrays.toString(n2));
        System.out.println(Arrays.toString(n3));
    }
}
