package com.company.Ejer2;

public class Ameba {
    private int peso;

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Ameba() {
        this.peso = 3;
    }

    public void come(int n){
        this.peso+=n-1;
    }
    public void come(Ameba a){
        int result;
        this.peso+=a.peso-1;
        result=a.peso;
        a.peso-=result;
    }

    @Override
    public String toString() {
        return "La Ameba pesa = " + peso + " miligramos";
    }
}
