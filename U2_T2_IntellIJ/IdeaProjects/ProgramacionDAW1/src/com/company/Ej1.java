package com.David.practicar;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String recuperacion,marca;
        double n1, n2, media;
        marca=" ";
        System.out.print("nota del primer control: ");
        n1 = sc.nextInt();
        System.out.print("nota del segundo control: ");
        n2 = sc.nextInt();
        media=(n1+n2)/2;
        if (media<5){

            System.out.print("¿Cual ha sido el resultado de la recuperacion?(apto/no apto)");
           // sc.nextLine();
            recuperacion=sc.nextLine();
            if(recuperacion.equals("apto")){
                media=5;
            }else{
                marca="Suspenso";
            }

        }
        if(media>=5 && media<6){
            marca="Suficiente";
        }else if(media>=6 && media<7){
            marca="Bien";
        } else if(media>=7 && media<9){
            marca="Notable";
        }else if(media>9){
            marca="Sobresaliente";
        }
        System.out.println("tu nota de programacion es:" +media+" - "+marca);


    }
}
