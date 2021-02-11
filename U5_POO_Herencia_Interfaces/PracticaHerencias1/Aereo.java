package com.company.PracticaHerencias1;

public abstract class Aereo extends Vehiculos {
    protected int altura;
    protected String OACI;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getOACI() {
        return OACI;
    }

    public void setOACI(String OACI) {
        this.OACI = OACI;
    }

    public Aereo(String nombre, int numeroPersonas, int altura, String OACI) {
        super(nombre, numeroPersonas);
        this.altura = altura;
        this.OACI = OACI;
    }


}
