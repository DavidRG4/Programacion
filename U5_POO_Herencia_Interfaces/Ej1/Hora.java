package com.company.Ej1;

public class Hora {
    protected Integer hora;
    protected Integer minuto;

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Integer getMinuto() {
        return minuto;
    }

    public void setMinuto(Integer minuto) {
        this.minuto = minuto;
    }

    public Hora(Integer hora, Integer minuto) {
        if (hora<0|| hora>23||minuto>59||minuto<0) {
            this.hora=12;
            this.minuto=12;
        }else {
            this.hora = hora;
            this.minuto = minuto;
        }
        }

    public Hora() {
        this.hora = 12;
        this.minuto=0;
    }

    public void inc() {
        this.minuto++;
        if (this.minuto == 60) {
            this.hora++;
            this.minuto = 0;
            if (this.hora==24){
                this.hora=0;
            }
        }
    }

    public void setMinutos(Integer min) {
        if (min < 0 || min > 60) {
            System.out.println(" no es valido el valor");
        } else if (min == 60) {
            this.minuto = 0;
            this.hora++;
        } else {
            this.minuto = min;
        }
    }
    public void SetHora(Integer H){
        if (H < 0 || H > 24) {
            System.out.println(" no es valido el valor");
        } else if (H == 24) {
            this.hora=0;
        } else {
            this.hora=H;
        }
    }

    @Override
    public String toString() {
        return "Hora : " + hora +
                "," + minuto ;
    }
}
