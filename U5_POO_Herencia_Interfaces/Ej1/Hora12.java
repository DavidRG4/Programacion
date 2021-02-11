package com.company.Ej1;

public class Hora12 extends Hora{
   private String AmPm;

    public String getAmPm() {
        return AmPm;
    }

    public void setAmPm(String amPm) {
        AmPm = amPm;
    }

    public Hora12(Integer hora, Integer minuto, String amPm) {
        super(hora, minuto);
        getFranja();
    }

    public Hora12(Integer hora, Integer minuto) {
        super(hora, minuto);
        AmPm="am";
    }

    private void getFranja(){
        if (hora>12){
            hora-=12;
            this.AmPm="pm";
        }
    }

    @Override
    public String toString() {
        return "Hora12{" +
                "hora=" + hora +
                ", minuto=" + minuto +
                ", AmPm='" + AmPm + '\'' +
                '}';
    }
    @Override
    public void inc() {
        this.minuto++;
        if (this.minuto >=60) {
            hora++;
            minuto = 0;
            if (AmPm.equals("am")){
                if (hora>11){
                    AmPm="pm";
                }
            }else {
                hora=0;
                AmPm="am";
            }
          /*  if (hora>12){
                if (AmPm.equals("pm")){
                    hora=0;
                    AmPm="am";
                }else {
                    AmPm="pm";
                }

            }*/
        }
    }
    @Override
    public void setMinutos(Integer min) {
        if (min < 0 || min > 60) {
            System.out.println(" no es valido el valor");
        } else if (min == 60) {
            this.minuto = 0;

            if (AmPm.equals("pm")){
                if (hora==11){
                    this.hora=0;
                    this.AmPm="pm";
                }else if (hora==12){
                    this.hora=1;
                }
            }else {
                this.hora++;
                this.AmPm="pm";
            }
        } else {
            this.minuto = min;
        }
    }
    @Override
    public void SetHora(Integer H){
        if (H >= 13) {
            this.hora=1;
        } else {
            this.hora=H;
        }
    }
}
