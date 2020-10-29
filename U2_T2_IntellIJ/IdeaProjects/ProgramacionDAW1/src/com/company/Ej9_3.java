package com.David.Ej9;

import java.util.Scanner;

public class Ej9_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String psw1;
        String j2;
        System.out.println("jugador uno inserta la contraseña");
        psw1=sc.nextLine();
        System.out.println("jugador dos intenta adivinarla");
        j2= sc.nextLine();
        while (j2!=psw1){

            if (j2.equals(psw1)){
                System.out.println("Acertaste");
                break;
            }
            j2.compareToIgnoreCase(psw1);
            System.out.println("Mal vuelve a intentarlo");
            if (j2.compareToIgnoreCase(psw1)<0){
                System.out.println("Es mas grande la frase");
            }
            if (j2.compareToIgnoreCase(psw1)>0){
                System.out.println("Es mas pequeña la frase");
            }
            j2= sc.nextLine();

        }
    }
}
