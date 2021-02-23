package com.company.ExcepcionesPropias;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class Ej1 {
    public static void main(String[] args) throws IOException {
        Cliente c2 = new Cliente("Pepe", "Perez", 110);
        try {
            c2.setEdad(110);

        } catch (EdadErronea | MenorEdad e) {
            BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt",true));
            bw.newLine();
            bw.write(Calendar.getInstance().getTime()+" EdadErronea: imposible crear usuario con nombre: "+c2.getNombre()+".La edad no es la correcta (Edad indicada:"+c2.getEdad()+" )");
            bw.newLine();
            bw.flush();
            bw.close();
        }
        Cliente c4 = new Cliente("Manue", "Pera", 2);
        try {
            c4.setEdad(2);

        } catch (EdadErronea | MenorEdad edadErronea) {
            BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt",true));
            bw.newLine();
            bw.write(Calendar.getInstance().getTime() + " MenorEdad: imposible crear usuario con nombre: "+c4.getNombre()+" .El cliente no puede ser menor de Edad (Edad indicada:"+c4.getEdad()+" )");
            bw.newLine();
            bw.flush();
            bw.close();

        }
    }

}
