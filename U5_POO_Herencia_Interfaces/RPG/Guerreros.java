package com.company.RPG;

public class Guerreros extends Humanos implements Atacar{
   private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Guerreros(String nombre, int energia, int ataque, int defensa, int edad) {
        super(nombre, energia, ataque, defensa);
        this.edad = edad;
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
