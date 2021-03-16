package com.company.Ejercicios;

import java.util.ArrayList;
import java.util.Objects;

public class Carrito {
    ArrayList<Elemento> carro=new ArrayList<>();

    public ArrayList<Elemento> getCarro() {
        return carro;
    }

    public void setCarro(ArrayList<Elemento> carro) {
        this.carro = carro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carrito carrito = (Carrito) o;
        return Objects.equals(carro, carrito.carro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carro);
    }

    @Override
    public String toString() {
        return "Carrito " + carro ;
    }
}
