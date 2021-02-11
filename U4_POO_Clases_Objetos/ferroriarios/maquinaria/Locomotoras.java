package com.company.ferroriarios.maquinaria;

import com.company.ferroriarios.Personal.Mecanicos;

public class Locomotoras {
   private String matricula;
   private String potencia;
   private int anio;
   private Mecanicos mecanico;

    public Locomotoras(Mecanicos mecanico) {
        this.mecanico = mecanico;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Locomotoras(String matricula, String potencia, int anio, Mecanicos mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.anio = anio;
        this.mecanico = mecanico;
    }

    @Override
    public String toString() {
        return "Locomotoras{" +
                "matricula='" + matricula + '\'' +
                ", potencia='" + potencia + '\'' +
                ", anio=" + anio +
                ", mecanico=" + mecanico +
                '}';
    }
}
