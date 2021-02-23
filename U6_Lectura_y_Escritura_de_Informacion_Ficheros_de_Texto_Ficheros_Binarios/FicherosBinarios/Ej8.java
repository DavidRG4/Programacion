package com.company.FicherosBinarios;

import java.io.*;
import java.util.Arrays;

public class Ej8 {
    public static void main(String[] args) {
        int[] v=new int[(int)(Math.random()*100) ];
        for (int i = 0; i <v.length ; i++) {
            v[i]=(int) (Math.random()*100);
        }
        Arrays.sort(v);
        try {
            ObjectOutput flujoEntrada=new ObjectOutputStream(new FileOutputStream("Ej8.dat"));
            flujoEntrada.writeObject(v);
            flujoEntrada.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream flujoSalida=new ObjectInputStream(new FileInputStream("Ej8.dat"));
            System.out.println(Arrays.toString((int[]) flujoSalida.readObject()) );
            flujoSalida.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
