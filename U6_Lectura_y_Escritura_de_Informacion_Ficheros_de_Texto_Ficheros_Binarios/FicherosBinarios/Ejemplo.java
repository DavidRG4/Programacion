package com.company.FicherosBinarios;

import java.io.*;

public class Ejemplo {
    public static void main(String[] args) {

        try {
            int[] V={1,2,3,4,5,6,7,8,9,10};

            ObjectOutput flujoSalida= new ObjectOutputStream(new FileOutputStream("datos.dat"));
            flujoSalida.write(60);
            flujoSalida.writeObject(V);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try {
            ObjectInputStream flujoEntrada=new ObjectInputStream(new FileInputStream("datos.dat"));
            System.out.println(flujoEntrada.readInt());
            System.out.println(flujoEntrada.readObject());
            flujoEntrada.close();
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
