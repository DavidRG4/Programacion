package com.David.practicar;

import java.util.Scanner;

public class Ej5_segun_profesor_hueco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, anchura, num_esp;
        System.out.println("Dime una altura impar");
        altura = sc.nextInt();
        num_esp=(altura-1)/2;
        //parte arriba
        for (int i = 0; i < altura ; i++) {
            //espacios
            for (int j = 0; j <num_esp ; j++) {
                System.out.print(" ");
            }
            //asteriscos
            for (int j = 0; j < altura-2*num_esp ; j++) {
                if(j==0 || j==altura-2*num_esp-1){
                    System.out.print("*");
                }else {
                    System.out.print("-");
                }

            }
            System.out.println("");

            if (i< altura/2){
                //primera mitad
                num_esp--;
            }else {
                //Segunda parte
                num_esp++;
            }
        }
        //parte de abajo

    }
}
/*
      for (int i = 0; i <altura ; i++) {
            for (int j = 0; j <(i*2)-j; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <(anchura)-i*2 ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
*/
/*
for (int i = 0; i < altura / 2; i++) {

            for (int j = 0; j < num_esp; j++) {// primero se imprimen los espacios
                System.out.print("-");
            }
            for (int j = 0; j < anchura - i * 2; j++) { //imprimo asteriscos
                System.out.print("*");
            }
            System.out.println("");
        }
 */