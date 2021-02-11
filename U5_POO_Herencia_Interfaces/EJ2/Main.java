package com.company.EJ2;

public class Main {
    public static void main(String[] args) {
        Piano p =new  Piano();
        Campana c =new Campana();

        c.add(NotasEnum.DO);
        c.add(NotasEnum.RE);
        c.add(NotasEnum.ME);
        c.add(NotasEnum.FA);
        c.add(NotasEnum.SOL);
        c.add(NotasEnum.LA);
        c.add(NotasEnum.SI);
        c.interpretar();
        p.add(NotasEnum.DO);
        p.add(NotasEnum.RE);
        p.add(NotasEnum.ME);
        p.add(NotasEnum.FA);
        p.add(NotasEnum.SOL);
        p.add(NotasEnum.LA);
        p.add(NotasEnum.SI);

        p.interpretar();
    }
}
