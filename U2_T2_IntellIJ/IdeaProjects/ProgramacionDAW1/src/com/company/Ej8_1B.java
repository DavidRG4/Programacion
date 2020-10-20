package com.company;

import java.util.Scanner;

public class Ej8_1B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,C=3;
        System.out.println("dime la contraseña de la caja fuerte");
                while (C>=0){
                    n1= sc.nextInt();
                    if (n1==12345){
                        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                        break;
                    }else {
                        System.out.println("la contraseña es incorrecta, vuelve a intentarlo");
                        C=C-1;
                    }
                    if (C<0){
                        System.out.println("La caja ya no se abrira");
                    }
                }

    }
}
