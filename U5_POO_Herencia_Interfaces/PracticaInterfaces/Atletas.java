package com.company.PracticaInterfaces;

public class Atletas extends Participantes implements Correr{
   private String nomPrueba;

    public String getNomPrueba() {
        return nomPrueba;
    }

    public void setNomPrueba(String nomPrueba) {
        this.nomPrueba = nomPrueba;
    }

    public Atletas(String nombre, int edad, String nomPrueba) {
        super(nombre, edad);
        this.nomPrueba = nomPrueba;
    }

    @Override
    public void hacerJuramento() {
        System.out.println("Yo "+this.nombre+", como atleta juro los valores deportivos mundiales");
    }

    @Override
    public String toString() {
        return "Atletas{" +
                "nomPrueba='" + nomPrueba + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }


}
