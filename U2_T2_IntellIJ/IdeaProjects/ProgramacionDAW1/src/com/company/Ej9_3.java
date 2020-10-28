package com.company;

import java.util.Scanner;

public class Ej9_3 {
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

            if (j2==psw1){
                System.out.println("Acertaste");
                break;
            }
            System.out.println("Mal vuelve a intentarlo");
            if(j2==psw1)
            j2= sc.nextLine();

        }

    }
}//System.out.println("Tu segunda psita es que tiene "+Character.isDigit(psw1.charAt(psw1.length()))+" numeros y "+Character.isLetter(psw1.charAt(psw1.length()))+" letras");

