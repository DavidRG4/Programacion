package com.company.Ejercicios;

import java.util.Objects;

public class Cartas {
    private String numero;
    private String palo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public Cartas(String numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cartas cartas = (Cartas) o;
        return Objects.equals(numero, cartas.numero) && Objects.equals(palo, cartas.palo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, palo);
    }

    @Override
    public String toString() {
        return "Cartas " + numero + '\''+ palo + '\'';
    }
}
