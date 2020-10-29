package com.David.Ej9;

import java.util.Scanner;

public class Ej9_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String psw1;
        String j2;
        int pista=0,digitos=0,letras=0;
        System.out.println("jugador uno inserta la contraseña");
        psw1=sc.nextLine();
        for (int i = 0; i <psw1.length(); i++) {
            if(Character.isDigit(psw1.charAt(i))){
                digitos++;
            }else if(Character.isLetter((psw1.charAt(i)))){
                letras++;
            }
        }

        System.out.println("jugador dos intenta adivinarla");
        j2= sc.nextLine();
        while (j2!=psw1){
            if (j2.equals(psw1)){
                System.out.println("Acertaste");
                break;
            }
            System.out.println("Mal vuelve a intentarlo");
            pista++;
            if (pista==2){
                System.out.println("Tu primer pista es que es de "+psw1.length()+" caracteres de largo");
            }
            if (pista==3){
                System.out.println("Tu segunda psita es que tiene "+digitos+" numeros y "+letras+" letras");
            }
            if (pista==4){
                System.out.println("Comienza con la letra "+psw1.charAt(0)+" termina con la letra "+psw1.charAt(psw1.length()-1));

            }
            if (pista==5){
                System.out.println("Fallaste te quedaste sin intetos");
                break;
            }
            j2= sc.nextLine();

        }

    }
}
