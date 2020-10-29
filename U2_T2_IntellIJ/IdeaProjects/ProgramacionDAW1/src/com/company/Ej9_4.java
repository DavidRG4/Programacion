package com.David.Ej9;

import java.util.Scanner;

public class Ej9_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String palabra,blanco=" ";
        boolean espacio=false;
        int medio=0;
        System.out.println("Dime una frase");
        palabra= sc.nextLine();
        for (int i = 0; i <palabra.length(); i++) {
            medio++;
        }
        medio=(int)Math.floor(medio/2);
        if (palabra.charAt(medio)==' '){
            espacio=true;
        }
        if(espacio){
            System.out.println("En medio de la frase hay un espacio");

        }
        if (!espacio){
            System.out.println("En medio de la frase no hay un espacio");
        }

    }
}
