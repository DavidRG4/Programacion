package com.company.FicherosBinarios;

import java.io.*;
import java.util.Arrays;

public class Ej5 {
    public static void main(String[] args) {
        double[] D={2.43,3.7,4.5,6.2,1.3};
        try {
            ObjectOutput flujoEntrada=new ObjectOutputStream(new FileOutputStream("Ej5.dat"));
            flujoEntrada.writeObject(D);
            flujoEntrada.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        try {
            ObjectInputStream flujoSalida=new ObjectInputStream(new FileInputStream("Ej5.dat"));
            System.out.println(Arrays.toString((double[]) flujoSalida.readObject()) );
            flujoSalida.close();
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }


    }
}
