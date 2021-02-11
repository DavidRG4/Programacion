package com.company.RPG;

public class Orcos extends Personajes implements Atacar{
    private int tonelaje;

    public int getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(int tonelaje) {
        this.tonelaje = tonelaje;
    }

    public Orcos(String nombre, int energia, int ataque, int defensa, int tonelaje) {
        super(nombre, energia, ataque, defensa);
        this.tonelaje = tonelaje;
    }

    @Override
    public void atacarPersonaje() {
        System.out.println(this.nombre+"-ATACANDO");
    }

    @Override
    public int compareTo(Personajes o) {
        return energia-o.getEnergia();
    }
}
