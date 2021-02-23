package com.company.ExcepcionesPropias;

import java.util.Calendar;

public class Cliente {
    private String nombre;
    private String apellidos;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws EdadErronea,MenorEdad{
        if (edad<0 || edad>100){
            throw new EdadErronea(Calendar.getInstance()+"EdadErronea: imposible crear usuario con nombre "+nombre+".La edad no es la correcta (Edad indicada: "+edad+")");
        }else if (edad<18){
            throw  new MenorEdad(Calendar.getInstance()+"MenorEdad: imposible crear usuario con nombre "+nombre+".El cliente no puede ser menor de Edad (Edad indicada: "+edad+")");
        }else {
            this.edad = edad;}
    }

    public Cliente(String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;

        this.edad = edad;
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
}
