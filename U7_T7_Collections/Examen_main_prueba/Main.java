package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0, opcion2 = 0, dorsal,marca;
        String nombre, pais;
        Categoria categoria;
        Maraton m = new Maraton();
        do {


            System.out.println("1.Cargar Atletas");
            System.out.println("2.Guardar Atletas");
            System.out.println("3.Inscribir Atleta");
            System.out.println("4.Guardar Tiempo");
            System.out.println("5.Borrar Atleta");
            System.out.println("6.Mostrar Atletas que han acabado");
            System.out.println("7.Atletas segun su categoria");
            System.out.println("8.Atletas segun su pais");
            System.out.println("9.salir");
            System.out.println("¿Que quiere hacer?");
            opcion = sc.nextInt();
            //OPCION 1 INSCRIBIR
            if (opcion==1){
                m.cargarAtletas();
            }
            //OPCION 2 INSCRIBIR
            if (opcion==2){
                m.guardarAtletas();
            }
            //OPCION 3 INSCRIBIR
            if (opcion == 3) {
                System.out.println("dorsal");
                dorsal = sc.nextInt();
                System.out.println("nombre Atlteta");
                sc.nextLine();
                nombre = sc.nextLine();
                System.out.println("Pais Atleta");
                pais = sc.nextLine();
                System.out.println("Categoria:");
                System.out.println("1.Senior:");
                System.out.println("2.Junior:");
                System.out.println("3.Veterano:");
                opcion2 = sc.nextInt();
                if (opcion2 == 1) {
                    categoria = Categoria.SENIOR;
                } else if (opcion2 == 2) {
                    categoria = Categoria.JUNIOR;
                } else {
                    categoria = Categoria.VETERANO;
                }
                m.addAtleta(dorsal, nombre, pais, categoria);
            }
            //OPCION 4 GUARDAR TIEMPOS
            if (opcion==4) {
                System.out.println("Dime la dorsal");
                dorsal=sc.nextInt();
                System.out.println("Dime la marca de Tiempo");
                marca=sc.nextInt();
                m.guardarTiempo(dorsal,marca);
            }
            //OPCION 5 BORRAR ATLETA
            if (opcion == 5) {
                System.out.println("Dorsal del Atleta a Borrar");
                dorsal = sc.nextInt();
                m.deleteAtleta(dorsal);
            }
            //OPCION 6 INSCRIBIR
            if (opcion == 6) {
                m.MostrarListaFinishers();
            }
            //OPCION 7 INSCRIBIR
            if (opcion == 7) {
                System.out.println("Categoria:");
                System.out.println("1.Senior:");
                System.out.println("2.Junior:");
                System.out.println("3.Veterano:");
                opcion2 = sc.nextInt();
                if (opcion2 == 1) {
                    categoria = Categoria.SENIOR;
                } else if (opcion2 == 2) {
                    categoria = Categoria.JUNIOR;
                } else {
                    categoria = Categoria.VETERANO;
                }
                m.MostrarListaCategoria(categoria);
            }
            //OPCION 8 INSCRIBIR
            if (opcion == 8) {
                System.out.println("Dime el pais");
                sc.nextLine();
                pais = sc.nextLine();
                m.ParticipantesPorPaís(pais);
            }
            if (opcion==0){
                m.todofuera();
            }
        } while (opcion != 9);

    }
}
