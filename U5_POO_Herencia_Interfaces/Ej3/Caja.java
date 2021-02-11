package com.company.Ej3;

import java.util.SortedMap;

public class Caja {
    final protected double alto;
    final protected double ancho;
    final protected double fondo;
    Medida medidas;
    EtiquetaMadera Em;

    public Medida getMedidas() {
        return medidas;
    }

    public void setMedidas(Medida medidas) {
        this.medidas = medidas;
    }

    public EtiquetaMadera getEm() {
        return Em;
    }

    public void setEm(EtiquetaMadera em) {
        Em = em;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getFondo() {
        return fondo;
    }

    public Caja(double alto, double ancho, double fondo, Medida medidas) {
        this.alto = alto;
        this.ancho = ancho;
        this.fondo = fondo;
        this.medidas = medidas;
    }

    public void getVolumen() {
        if (this.medidas == Medida.cm) {
            System.out.println("Volumen: " + (alto * ancho) * fondo + " " + Medida.cm3);
        } else {
            System.out.println("Volumen: " + (alto * ancho) * fondo + " " + Medida.m3);
        }
    }

    @Override
    public String toString() {
        return "Caja{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", fondo=" + fondo +
                ", medidas=" + medidas +
                '}';
    }


}
