package com.company;

public class Cuenta_Corriente {
    Banco B1=new Banco(50.2,"C/patata");

    private double saldo;
    private double limite;
    public String nombre;
    String DNI;
    static String nombreBanco;


    public Cuenta_Corriente(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.saldo = 0;
        this.limite = -50;
    }

    public boolean sacar(double cantidad) {
        if (this.saldo - cantidad > this.limite) {
            return false;
        } else {
            return true;
        }

    }

    public void Ingresar(double Ingresos) {
        this.saldo += Ingresos;
    }

    public void Informacion() {
        System.out.println("Titular "+this.nombre+nombreBanco);
        System.out.println("DNI "+this.DNI);
        System.out.println("Saldo " + this.saldo);
        System.out.println("Limite " + this.limite);
    }


    public Cuenta_Corriente(double saldo) {
        this.saldo = saldo;
        this.limite = 0;
        this.nombre = "";
        this.DNI = "";
    }

    public Cuenta_Corriente(double saldo, double limite, String DNI) {
        this.saldo = saldo;
        this.limite = limite;
        this.DNI = DNI;
        this.nombre="";
    }
public static void cambiarBanco(String bancoNuevo){
        nombreBanco=bancoNuevo;

}
}
