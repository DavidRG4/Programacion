package com.company.FicherosBinarios;

import java.io.*;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1;
        double n2;
        System.out.println("Dime un numero entero");
        n1=sc.nextInt();
        try {
            ObjectOutput flujoSalida=new ObjectOutputStream(new FileOutputStream("Ej4.dat",true));
            System.out.println("Dame numeros decimales");
            for (int i = 0; i <n1 ; i++) {
                n2=sc.nextDouble();
                flujoSalida.writeDouble(n2);
            }
            flujoSalida.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
