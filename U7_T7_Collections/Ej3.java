package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class Ej3 {
    public static void main(String[] args) {

        ArrayList<Integer> lista =new ArrayList<>();
        for (int i = 0; i <20 ; i++) {
            lista.add((int)(Math.random()*10));
        }

        lista.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        /* lista.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });*/
        for(Integer n : lista){
            System.out.println(n);
        }
    }
}
