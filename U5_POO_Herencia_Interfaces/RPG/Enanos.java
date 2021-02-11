package com.company.RPG;

public class Enanos extends Personajes implements Atacar{
   private int altura;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Enanos(String nombre, int energia, int ataque, int defensa, int altura) {
        super(nombre, energia, ataque, defensa);
        this.altura = altura;
    }

    @Override
    public void atacarPersonaje() {
        System.out.println(this.nombre+"ATACANDO");
    }

    @Override
    public int compareTo(Personajes o) {
        return energia-o.getEnergia();
    }
}
