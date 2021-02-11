package com.company.RPG;

public class Magos extends Humanos implements Mago{
int barba;

    public int getBarba() {
        return barba;
    }

    public void setBarba(int barba) {
        this.barba = barba;
    }

    public Magos(String nombre, int energia, int ataque, int defensa, int barba) {
        super(nombre, energia, ataque, defensa);
        this.barba = barba;
    }


    @Override
    public int compareTo(Personajes o) {
        return energia-o.getEnergia();
    }
}
