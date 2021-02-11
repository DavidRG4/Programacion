package com.company.MInecraft;

import java.util.Arrays;

public class Minecraft {
  private   Materiales[] materiales;

    public Materiales[] getMateriales() {
        return materiales;
    }

    public void setMateriales(Materiales[] materiales) {
        this.materiales = materiales;
    }

    public Minecraft() {
        this.materiales = new Materiales[0];
    }

    public void addMaterial(Materiales m){
        if (materiales.length>=10){
            System.out.println("No se puede añadir no hay sitio");
        }else {
            materiales= Arrays.copyOf(materiales,materiales.length+1);
            materiales[materiales.length-1]=m;
        }
    }
    public void borraSinMasas(){
        int j=0,n=0;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i].masa<=0){
                n++;
            }
        }
        Materiales[] m1=new Materiales[materiales.length-n];
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i].masa>0){
                m1[j]=materiales[i];
                j++;
            }

        }

    }




}
