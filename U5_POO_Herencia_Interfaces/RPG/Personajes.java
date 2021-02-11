package com.company.RPG;

public abstract class Personajes implements Comparable<Personajes>{
   protected String nombre;
   protected int energia;
   protected int ataque;
   protected int defensa;
   protected boolean encantamiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public boolean isEncantamiento() {
        return encantamiento;
    }

    public void setEncantamiento(boolean encantamiento) {
        this.encantamiento = encantamiento;
    }

    public Personajes(String nombre, int energia, int ataque, int defensa) {
        this.nombre = nombre;
        this.energia = energia;
        this.ataque = ataque;
        this.defensa = defensa;
        this.encantamiento = false;
    }

    public Personajes(String nombre) {
        this.nombre = nombre;
        this.energia = (int)(Math.random()*1001);
        this.ataque =  (int)(Math.random()*101);
        this.defensa =  (int)(Math.random()*101);
    }
}
