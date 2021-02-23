package com.company.FicherosBinarios;
import java.io.*;
import java.util.Scanner;
public class Ej1_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double numero;
        System.out.println("Dime un numero con decimales");
        numero=sc.nextDouble();

        try {
            ObjectOutput flujoSalida=new ObjectOutputStream(new FileOutputStream("Ej1.dat"));
            flujoSalida.writeDouble(numero);
            flujoSalida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream flujoEntrada=new ObjectInputStream(new FileInputStream("Ej1.dat"));
            System.out.println(flujoEntrada.readDouble());
            flujoEntrada.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}