package com.company.PracticaInterfaces;

import java.util.Arrays;

public abstract class Deporte {
  protected   String nombreDep;
  protected   String pabellon;
  protected   Participantes[] listaPart;

    public String getNombreDep() {
        return nombreDep;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }

    public String getPabellon() {
        return pabellon;
    }

    public void setPabellon(String pabellon) {
        this.pabellon = pabellon;
    }

    public Participantes[] getListaPart() {
        return listaPart;
    }

    public void setListaPart(Participantes[] listaPart) {
        this.listaPart = listaPart;
    }

    public Deporte(String nombreDep, String pabellon) {
        this.nombreDep = nombreDep;
        this.pabellon = pabellon;
        this.listaPart = new Participantes[0];
    }

    public void addPArticipantes(Participantes p){
        listaPart=Arrays.copyOf(listaPart,listaPart.length+1);
        listaPart[listaPart.length-1]=p;
    }
    public void deletePArticipantes(){
        listaPart=Arrays.copyOf(listaPart,listaPart.length-1);
    }
    public void mostrarParticipantes(){
        Arrays.sort(listaPart);
        System.out.println(Arrays.toString(listaPart));
    }
    @Override
    public String toString() {
        return "Deporte{" +
                "nombreDep='" + nombreDep + '\'' +
                ", pabellon='" + pabellon + '\'' +
                ", listaPart=" + Arrays.toString(listaPart) +
                '}';
    }
}
