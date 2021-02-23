package com.company;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Ej8 {
    public static void main(String[] args) {
        String[] nombres={"Hola","Hola","buenas","que","que","patata","patata"};
        LinkedHashSet <String> lista=new LinkedHashSet<>();
        lista.addAll(Arrays.asList(nombres));
        System.out.println(Arrays.toString(nombres));
        System.out.println(lista);

    }

}
