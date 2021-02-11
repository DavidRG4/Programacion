package com.company.ferroriarios;

import com.company.ferroriarios.Personal.Maquinistas;
import com.company.ferroriarios.Personal.Mecanicos;
import com.company.ferroriarios.maquinaria.Locomotoras;
import com.company.ferroriarios.maquinaria.Trenes;
import com.company.ferroriarios.maquinaria.Vagones;

public class Main {
    public static void main(String[] args) {
        Mecanicos pepe= new Mecanicos("pepe",3334,"general");
        Locomotoras loc;
        loc= new Locomotoras("2222333fss","200",300,pepe);
        Maquinistas maquinistas;
        maquinistas =new Maquinistas("Luis","2223334444v",200,"alto");
        Vagones[] vagones={new Vagones(1,23,"carbon"),new Vagones(2,3,"lana")};

        Trenes tren1=new Trenes(maquinistas,loc);

        System.out.println(tren1);
    }
}
