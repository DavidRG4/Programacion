package com.company.MapT2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Empleado extends Persona{
    double sueldo;
    Map<String,String> listado=new HashMap<>();

    public Empleado(String nombre, String dni, int edad, double estatura, double sueldo) {
        super(nombre, dni, edad, estatura);
        this.sueldo = sueldo;
    }

    public Empleado(String binario) {
        try {
            ObjectInputStream flujoEntrada=new ObjectInputStream(new FileInputStream(binario));
            System.out.println(flujoEntrada.readDouble());
            flujoEntrada.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
