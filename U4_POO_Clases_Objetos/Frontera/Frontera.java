package com.company.Frontera;

import java.util.Arrays;

public class Frontera {
private String[] Personas;

    public Frontera() {
        Personas = new String[0];
    }

    public String[] getPersonas() {
        return Personas;
    }

    public void setPersonas(String[] personas) {
        Personas = personas;
    }

    public void pasoFrontera(String persona){
     this.Personas= Arrays.copyOf(this.Personas,this.Personas.length+1);
     this.Personas[this.Personas.length-1]=persona;
    }
    public void filtroNombre(){

    }

    @Override
    public String toString() {
        return "Todas las Persona" + Arrays.toString(Personas);
    }
}
