package com.company.PracticaHerencias1;

public class Motocicleta extends Terrestre{
    public Motocicleta(String nombre, int numeroPersonas, String matricula, int anio, Colores color) {
        super(nombre, numeroPersonas, matricula, anio, color);
    }

    @Override
    public String toString() {
        return "Motocicleta " +
                "matricula: " + matricula + '\'' +
                ", anio: " + anio +
                ", color: " + color +
                ", nombre: " + nombre + '\'' +
                ", Pasajeros: " + numeroPersonas ;
    }

    @Override
    public int compareTo(Terrestre o) {
     return    matricula.compareTo(o.getMatricula());
    }
}
