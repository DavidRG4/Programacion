package com.company;

import java.util.Scanner;

public class Ej8_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        System.out.println("Dime la altura de la L");
        n1 = sc.nextInt();
        for (int i = 0; i <n1 ; i++) {
            if (i< n1/2+1) {
                System.out.println("*--");
            }else {
                System.out.println("***");
            }
        }

    }
}
