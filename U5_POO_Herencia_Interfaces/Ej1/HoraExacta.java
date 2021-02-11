package com.company.Ej1;

public class HoraExacta extends Hora {
    private Integer segundos;

    public Integer getSegundos() {
        return segundos;
    }

    public void setSegundos(Integer segundos) {
        this.segundos = segundos;
    }

    public HoraExacta(Integer hora, Integer minuto, Integer segundos) {
        super(hora, minuto);
        if (segundos < 0 || segundos > 59) {
            this.segundos = 0;
        } else {
            this.segundos = segundos;
        }
    }
    public void setSegundo(Integer seg) {
        if (seg < 0 || seg> 60) {
            System.out.println(" no es valido el valor");
        } else if (seg==60 ) {
            this.segundos = 0;
            super.inc();
        } else {
            this.segundos = seg;
        }
    }

    public boolean identicas(HoraExacta he2){
        if (he2.getHora().equals(getHora()) && he2.getMinuto().equals(this.getMinuto()) && he2.getSegundos().equals(this.getSegundos())){
            return true;
        }else {
            return false;
        }
    }
    @Override
    public void inc() {
        segundos++;
        if (segundos > 59) {
            segundos = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {
        return "HoraExacta : "+ hora +
                ", "+ minuto +
                ", "+ segundos ;
    }
}
