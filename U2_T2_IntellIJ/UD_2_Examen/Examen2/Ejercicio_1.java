package com.company;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numero;
        boolean primo = false;
        int valido = 0, n_primo;
        System.out.println("Introduce tu numero de cuenta");
        numero = sc.nextLine();
        while (valido == 0) {
            if (numero.charAt(4) == '-' && numero.charAt(9) == '-' && numero.charAt(12) == '-' && numero.length() == 23) {
                n_primo = Integer.parseInt(numero.substring(13, 23));
                if (esprimo(n_primo)) {
                    System.out.println("Este numero de cuenta es valido");
                    valido++;
                }
            } else {
                System.out.println("No es un numero de cuenta valido");
            }
            if (valido == 1) {
                break;
            } else {
                numero = sc.nextLine();
            }
        }
    }

    public static boolean esprimo(int a) {
        boolean primo = false;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                primo = true;
            }
            if (primo) {
                break;
            }

        }
        return primo;
    }


}

