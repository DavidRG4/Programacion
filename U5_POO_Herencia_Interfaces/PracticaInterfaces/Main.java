package com.company.PracticaInterfaces;

public class Main {
    public static void main(String[] args) {
        Juegos j1=new Juegos(1992,"España");
        Juegos j2=new Juegos(1935,"España");
        Juegos j3=new Juegos(1922,"España");
        Juegos j4=new Juegos(1915,"España");
        Baloncesto b=new Baloncesto("Baloncesto","1",23);
        Baloncesto b2=new Baloncesto("Baloncesto","2",3);
        Judo ju=new Judo("judo","3",2);
        Judo ju2=new Judo("judo","4",5);
        Atletismo At=new Atletismo("Atletismo","6",9);
        Atletismo At2=new Atletismo("Atletismo","7",10);
        Pais p1=new Pais("España",45);
        Pais p2=new Pais("Portugal",25);
        Pais p3=new Pais("Francia",75);
        Pais p4=new Pais("Italia",745);
        Judokas jk1=new Judokas("Pepe",19,79);
        JugadorBaloncesto jb=new JugadorBaloncesto("manue",29,1.89);
        JugadorBaloncesto jb2=new JugadorBaloncesto("Alvaro",49,1.99);
        JugadorBaloncesto jb3=new JugadorBaloncesto("Manolo",19,1.79);
        Atletas Atl=new Atletas("Jose",30,"salto Longitud");

        System.out.println(j1);
        System.out.println(j2);
        System.out.println(j3);
        System.out.println(j4);

        j1.addDeportes(b);
        j1.addDeportes(b2);
        j1.addDeportes(At2);
        j1.addDeportes(At);
        j1.addDeportes(ju);
        j1.addDeportes(ju2);
        j2.addDeportes(b2);
        j2.addDeportes(b);
        j2.addDeportes(ju);
        j2.addDeportes(ju2);
        j2.addDeportes(At);
        j2.addDeportes(At2);
        j3.addDeportes(b2);
        j2.addDeportes(At);
        j1.addDeportes(b2);
        j4.addDeportes(At2);
        j4.addDeportes(b2);
        j1.addDeportes(At2);
        j3.addDeportes(At);
        j3.addDeportes(b);

        System.out.println(j1);
        System.out.println(j2);
        System.out.println(j3);
        System.out.println(j4);

        j1.deleteDeporte();
        j1.deleteDeporte();
        j2.deleteDeporte();
        j3.deleteDeporte();

        System.out.println(j1);
        System.out.println(j2);
        System.out.println(j3);

        j1.addPaises(p1);
        j1.addPaises(p4);
        j1.addPaises(p2);
        j1.addPaises(p3);

        j1.mostrarPaises();

        j1.mostrarPaisesParaCeremonia();

        ju.addPArticipantes(jk1);
        ju2.addPArticipantes(jk1);
        At.addPArticipantes(Atl);
        At2.addPArticipantes(Atl);
        b2.addPArticipantes(jb);
        b.addPArticipantes(jb);
        b.addPArticipantes(jb2);
        b2.addPArticipantes(jb2);
        b.addPArticipantes(jb3);
        b2.addPArticipantes(jb3);

        jb.hacerJuramento();
        jb2.hacerJuramento();
        jb3.hacerJuramento();
        jk1.hacerJuramento();
        Atl.hacerJuramento();

        b.mostrarParticipantes();
        At.mostrarParticipantes();
        ju.mostrarParticipantes();
    }
}
