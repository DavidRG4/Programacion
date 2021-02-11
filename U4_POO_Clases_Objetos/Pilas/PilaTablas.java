package com.company.Pilas;

import java.util.Arrays;


public class PilaTablas {
    private Integer num;
    private int[] pila=new int[0];

    public void apilar(Integer n){
        this.num=n;
        this.pila= Arrays.copyOf(this.pila,this.pila.length+1);
        this.pila[this.pila.length-1]=this.num;
    }
    public void desapilar(){
        this.pila= Arrays.copyOf(this.pila,this.pila.length-1);
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public int[] getPila() {
        return pila;
    }

    public void setPila(int[] pila) {
        this.pila = pila;
    }

    @Override
    public String toString() {
        return "PilaTablas{" +
                "pila=" + Arrays.toString(pila) +
                '}';
    }
}
