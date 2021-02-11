package com.company.ferroriarios.maquinaria;

public class Vagones {
  private int capacidad_max;
  private int Capacidad_act;
  private String mercancia;

    public int getCapacidad_max() {
        return capacidad_max;
    }

    public void setCapacidad_max(int capacidad_max) {
        this.capacidad_max = capacidad_max;
    }

    public int getCapacidad_act() {
        return Capacidad_act;
    }

    public void setCapacidad_act(int capacidad_act) {
        Capacidad_act = capacidad_act;
    }

    public String getMercancia() {
        return mercancia;
    }

    public void setMercancia(String mercancia) {
        this.mercancia = mercancia;
    }

    public Vagones(int capacidad_max, int capacidad_act, String mercancia) {
        this.capacidad_max = capacidad_max;
        Capacidad_act = capacidad_act;
        this.mercancia = mercancia;
    }

    @Override
    public String toString() {
        return "Vagones{" +
                "capacidad_max=" + capacidad_max +
                ", Capacidad_act=" + Capacidad_act +
                ", mercancia='" + mercancia + '\'' +
                '}';
    }
}
