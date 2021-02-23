package com.company.FicherosBinarios;

import java.io.*;

public class Ej9 {
    public static void main(String[] args) {
        Tren t1=new Tren("Tren1",90);
        Tren t2=new Tren("Tren2",590);
        Tren t3=new Tren("Tren3",990);
        Tren t4=new Tren("Tren4",190);

        try {
            ObjectOutput flujoEntrada=new ObjectOutputStream(new FileOutputStream("Ej9.dat"));

            flujoEntrada.writeObject(t1);
            flujoEntrada.writeObject(t2);
            flujoEntrada.writeObject(t4);
            flujoEntrada.writeObject(t3);
            flujoEntrada.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ObjectInputStream flujoSalida=new ObjectInputStream(new FileInputStream("Ej9.dat"));
            System.out.println(flujoSalida.readObject());
            System.out.println(flujoSalida.readObject());
            System.out.println(flujoSalida.readObject());
            System.out.println(flujoSalida.readObject());
            flujoSalida.close();

        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
