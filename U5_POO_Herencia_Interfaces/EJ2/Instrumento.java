package com.company.EJ2;
import java.util.Arrays;
public abstract class Instrumento {
    NotasEnum[] notas;
    final int max = 100;

    public Instrumento() {
        this.notas = new NotasEnum[0];
    }

    public boolean add(NotasEnum n) {
        if (this.notas.length== 100) {
            return false;
        } else {

            notas = Arrays.copyOf(this.notas, this.notas.length + 1);
            this.notas[this.notas.length - 1] = n;

            return true;
        }
    }

    public abstract void interpretar();
}
