package com.company.PracticaExamen;

import com.company.Ejercicios.Elemento;

import java.io.*;
import java.util.*;

public class Concurso {
    Map<String, Perros> concursante = new HashMap<>();

    public void addDog(String raza1, Perros p1) {
        if (!p1.getRaza().equalsIgnoreCase(raza1)) {
            System.out.println("Error la raza introducida no coincide con la del perro");
        } else {
            concursante.put(p1.getRaza(), p1);
        }
    }

    public void disqualifyDog(Perros p2) {
        concursante.remove(p2.getRaza(), p2);
    }

    public void ownerDogs(String duenio) {

    }

    public void perrosporPeso(String raza2)
    {
        List<Object> n=new ArrayList<>();


    }

    public void perrosporEdad() {

    }

    public void guardarperros(){
        try {
            ObjectOutputStream f_s=new ObjectOutputStream(new FileOutputStream("perros.dat"));
            f_s.writeObject(concursante);

        } catch (IOException e) {
            System.out.println("Todos los perros guardados");
        }
    }

    public void cargarperros(){
        try {
            ObjectInputStream f_n=new ObjectInputStream(new FileInputStream("perros.dat"));
            String n=(String) f_n.readObject();
            String[] n2=n.split("=");


        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Todos los perros guardados");
        }
    }
}
