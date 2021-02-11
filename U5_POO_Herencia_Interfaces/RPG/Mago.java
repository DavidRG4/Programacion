package com.company.RPG;

public interface Mago<H extends Personajes> {
    public default void encantar(Personajes p){
        p.encantamiento=true;
    };
    public default void desencantar(Personajes p){
        p.encantamiento=false;
    };
}
