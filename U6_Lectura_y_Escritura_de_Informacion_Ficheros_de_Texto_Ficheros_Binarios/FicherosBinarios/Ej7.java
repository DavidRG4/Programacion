package com.company.FicherosBinarios;

import java.io.*;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String X;
        System.out.println("Introduce una Frase");
        X=sc.nextLine();
        try {
            ObjectOutput flujoEntrada=new ObjectOutputStream(new FileOutputStream("Ej7.dat"));
             flujoEntrada.writeUTF(X);
             flujoEntrada.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream flujoSalida=new ObjectInputStream(new FileInputStream("Ej7.dat"));
            System.out.println(flujoSalida.readUTF());
            flujoSalida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
