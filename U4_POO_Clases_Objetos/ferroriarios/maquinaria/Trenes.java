package com.company.ferroriarios.maquinaria;

import com.company.ferroriarios.Personal.Maquinistas;

import java.util.Arrays;

public class Trenes {
    private Maquinistas maquinista;
    static final int capacidad = 5;
    private Locomotoras locomotora;
    private Vagones[] vagones;

    public static int getCapacidad() {
        return capacidad;
    }

    public Vagones[] getVagones() {
        return vagones;
    }

    public void setVagones(Vagones[] vagones) {
        this.vagones = vagones;
    }

    public Maquinistas getMaquinista() {
        return maquinista;
    }

    public void setMaquinista(Maquinistas maquinista) {
        this.maquinista = maquinista;
    }

    public Locomotoras getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotoras locomotora) {
        this.locomotora = locomotora;
    }

    public Trenes(Maquinistas maquinista, Locomotoras locomotora, Vagones[] vagones) {
        this.maquinista = maquinista;
        this.locomotora = locomotora;
        if (vagones.length <= Trenes.capacidad) {
            this.vagones = vagones;
        } else {
            vagones = new Vagones[0];
        }
    }

    public boolean addVagon(Vagones v) {
        if (this.vagones.length < 5) {
            this.vagones = Arrays.copyOf(this.vagones, this.vagones.length + 1);
            return true;
        } else {
            return false;
        }
    }
    public boolean removeVagon(){
        if (this.vagones.length>0){
            this.vagones=Arrays.copyOf(this.vagones,this.vagones.length-1);
            return true;
        }else {
            return false;
        }
    }



    public Trenes(Maquinistas maquinista, Locomotoras locomotora) {
        this(maquinista, locomotora, new Vagones[0]);
    }

    @Override
    public String toString() {
        return "Trenes{" +
                "maquinista=" + maquinista +
                ", locomotora=" + locomotora +
                ", vagones=" + Arrays.toString(vagones) +
                '}';
    }
}
