package com.company.PracticaHerencias1;

import java.util.Objects;

public abstract class Terrestre extends Vehiculos implements Comparable<Terrestre>{
    protected String matricula;
    protected int anio;
    protected Colores color;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public Terrestre(String nombre, int numeroPersonas, String matricula, int anio, Colores color) {
        super(nombre, numeroPersonas);
        this.matricula = matricula;
        this.anio = anio;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Terrestre terrestre = (Terrestre) o;
        return matricula.equals(terrestre.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

}
