package com.company;

import java.util.*;

public class Ej5 {
    public static void main(String[] args) {
        ArrayList<Integer> n2 = new ArrayList<>();
        LinkedHashSet<Integer> N1 = new LinkedHashSet<>();
        for (int i = 0; i < 20; i++) {
            n2.add((int) (Math.random() * 100));
        }
        n2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        N1.addAll(n2);
        System.out.println(n2);
        System.out.println(N1);
    }
}
