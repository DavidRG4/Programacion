package com.company.calendario;

public class Fecha {
    private int anio;
    private int mes;
    private int dia;

    public Fecha(int anio, int mes, int dia) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public Fecha() {
        this.anio = 1;
        this.mes = 1;
        this.dia = 1;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void incrementarDia(int cantidad) {
        if ((this.dia += cantidad) <= 31 && (this.dia += cantidad) >= 1) {
            this.dia += cantidad;
        } else {
            System.out.println("No es valido");
        }
    }

    public void incrementarMes(int cantidad) {
        if ((this.mes += cantidad) <= 12 && (this.mes += cantidad) >= 1) {
            if ((this.dia <= 31 && (this.mes += cantidad) == 1) || (this.dia <= 31 && (this.mes += cantidad) == 3) || (this.dia <= 31 && (this.mes += cantidad) == 5) || (this.dia <= 31 && (this.mes += cantidad) == 7) || (this.dia <= 31 && (this.mes += cantidad) == 8) || (this.dia <= 31 && (this.mes += cantidad) == 10) || (this.dia <= 31 && (this.mes += cantidad) == 12)) {
                this.mes += cantidad;
            }else if ((this.dia<=30 && (this.mes += cantidad)==4) ||(this.dia<=30 && (this.mes += cantidad)==6) ||(this.dia<=30 && (this.mes += cantidad)==9) ||(this.dia<=31 && (this.mes += cantidad)==11)){
                this.mes += cantidad;
            }else {
                this.mes += cantidad;
            }
        } else {
            System.out.println("no es valido");
        }
    }

    public void incrementarAnio(int cantidad) {

        if (cantidad > 0) {
            this.anio += cantidad;
        } else {
            System.out.println("No es valido");
        }
    }

    public boolean Iguales(int anio, int mes, int dia) {
        if (anio == this.anio && mes == this.mes && dia == this.dia) {
            return true;
        } else {

            return false;
        }
    }

    @Override
    public String toString() {
        return "Fecha{" +
                "anio=" + anio +
                ", mes=" + mes +
                ", dia=" + dia +
                '}';
    }
}





