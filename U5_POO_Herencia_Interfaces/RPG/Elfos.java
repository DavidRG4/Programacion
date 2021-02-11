package com.company.RPG;

public class Elfos extends Personajes implements Atacar{
    private TipoElfo tipoElfo;

    public TipoElfo getTipoElfo() {
        return tipoElfo;
    }

    public void setTipoElfo(TipoElfo tipoElfo) {
        this.tipoElfo = tipoElfo;
    }

    public Elfos(String nombre, int energia, int ataque, int defensa, TipoElfo tipoElfo) {
        super(nombre, energia, ataque, defensa);
        this.tipoElfo = tipoElfo;
    }

    @Override
    public void atacarPersonaje() {
        System.out.println(this.nombre+"-ATACANDO");

    }

    @Override
    public int compareTo(Personajes o) {
        return this.energia-o.getEnergia();
    }
}
