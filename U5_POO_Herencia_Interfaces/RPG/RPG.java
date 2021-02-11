package com.company.RPG;

import java.util.Arrays;

public class RPG {
   private Personajes[] personajes = new Personajes[0];

    public Personajes[] getPersonajes() {
        return personajes;
    }

    public void setPersonajes(Personajes[] personajes) {
        this.personajes = personajes;
    }

    public void addPersonaje(Personajes p) {
        if (personajes.length <= 10) {
            personajes = Arrays.copyOf(personajes, personajes.length + 1);
            personajes[personajes.length - 1] = p;
        } else {
            System.out.println("No caben mas personajes");
        }
    }
    public void borrarMuertos(){
        Personajes[] resultado=new Personajes[0];
        int n=0;
        for (int i = 0; i <this.personajes.length; i++) {
            if (this.personajes[i].getEnergia()<=0){
                n++;
            }else {
                resultado=Arrays.copyOf(resultado,resultado.length+1);
                resultado[i-n]=this.personajes[i];
            }
            this.personajes=resultado;
        }
    }
    public void mostrarEstado(){
        ;
    }




}
