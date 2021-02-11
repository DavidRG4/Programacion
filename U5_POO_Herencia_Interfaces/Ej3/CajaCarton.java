package com.company.Ej3;

public class CajaCarton extends Caja {
    public CajaCarton(double alto, double ancho, double fondo, Medida medidas) {
        super(alto, ancho, fondo, medidas=Medida.cm);
    }
    @Override
    public void getVolumen() {
        System.out.println("Volumen: " + ((alto * ancho) * fondo)*0.80 + " " + Medida.cm3);
    }

}
