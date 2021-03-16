package com.company.MapT2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String opcion2=" ",nfb,nombre,dni;
        int opcion,edad;
        double altura,saldo;
        System.out.println("1-Desea cargar datos de un fichero binario");
        System.out.println("2-Desea cargar datos de forma manual ");
        opcion= sc.nextInt();
        if (opcion==1){
            nfb=sc.nextLine();
            Empleado e=new Empleado(nfb);
        }else if(opcion==2){
            do {
                System.out.println("Dime un dni");
                dni=sc.nextLine();
                System.out.println("Dime un nombre");
                nombre=sc.nextLine();
                System.out.println("Dime la edad");
                edad=sc.nextInt();
                System.out.println("Dime la altura");
                altura=sc.nextDouble();
                System.out.println("Dime el saldo");
                saldo=sc.nextDouble();
                System.out.println("Quires seguir introduciendo datos[Y/N]");
                opcion2= sc.nextLine();
            }while (opcion2.equalsIgnoreCase("n"));
        }else {
            System.out.println("Ninguna opcion es valida");
        }
    }
}
