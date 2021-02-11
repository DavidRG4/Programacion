package com.company;

public class Main {
    public static void main(String[] args) {
        Cuenta_Corriente c1 = new Cuenta_Corriente("Pepe", "123456789V");
        Cuenta_Corriente c2 = new Cuenta_Corriente("Rosa", "154335689V");
            Cuenta_Corriente.nombreBanco="bankia";
        c1.Informacion();
    }


}
