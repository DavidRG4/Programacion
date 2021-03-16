package com.company.MapT4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Map<String, String> CapitalesPaises = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String opcion, nuevo;
        CapitalesPaises.put("España", "Madrid");
        CapitalesPaises.put("Portugal", "Lisboa");
        CapitalesPaises.put("Francia", "Paris");
        do {
            System.out.println("Dime el nombre de un Pais y te dire su capital");
            opcion = sc.nextLine();
            if (!opcion.equalsIgnoreCase("salir")) {
                if (CapitalesPaises.containsKey(opcion)) {
                    System.out.println("la capital de " + opcion + " es " + CapitalesPaises.get(opcion));
                } else {
                    System.out.println("No conozco la respuesta ¿Cual es la capital de " + opcion + "?");
                    nuevo = sc.nextLine();
                    CapitalesPaises.put(opcion, nuevo);
                }
            }
        } while (!opcion.equalsIgnoreCase("salir"));


    }
}
