package com.company;

import java.io.*;
import java.util.*;

public class Maraton {
    private Map<Integer, Set<Atleta>> maraton;

    public Maraton() {
        this.maraton = new HashMap<>();
    }

    public Map<Integer, Set<Atleta>> getMaraton() {
        return maraton;
    }

    public void setMaraton(Map<Integer, Set<Atleta>> maraton) {
        this.maraton = maraton;
    }

    public void addAtleta(int dorsal, String nombre, String pais, Categoria categoria) {
        boolean repetir = true;
        Atleta a = new Atleta(nombre, pais, categoria);
        Set<Atleta> a2=new LinkedHashSet<>();
        a2.add(a);
        do {
            if (!maraton.containsKey(dorsal)) {
                maraton.put(dorsal, a2);
                repetir = false;

            } else {
                dorsal++;
            }
        } while (repetir);

    }

    public void deleteAtleta(int dorsal) {
        maraton.remove(dorsal);
    }

    public void guardarTiempo(int dorsal, int tiempo) {
        Set<Atleta> a = maraton.get(dorsal);
        Set<Atleta> a2=new LinkedHashSet<>();
            for (Atleta b : a) {
                b.setMarca(tiempo);
                b.setFinisher(true);
                a2.add(b);
            }
        maraton.remove(dorsal);
        maraton.put(dorsal, a2);


    }

    public void MostrarListaFinishers() {
        Collection<Set<Atleta>> a = maraton.values();
        ArrayList<Atleta> ordenado = new ArrayList<>();
        for (Set<Atleta> p : a) {
            for (Atleta b : p) {
                if (b.isFinisher()) {
                    ordenado.add(b);
                }
            }
        }
        Collections.sort(ordenado, new Comparator<Atleta>() {
            @Override
            public int compare(Atleta o1, Atleta o2) {
                return o1.getMarca() - o2.getMarca();
            }
        });
        System.out.println(ordenado);
    }

    public void MostrarListaCategoria(Categoria categoria) {
        Collection<Set<Atleta>> a = maraton.values();
        ArrayList<Atleta> ordenado = new ArrayList<>();
        for (Set<Atleta> p : a) {
            for (Atleta b : p) {
                if (b.getCategoria().equals(categoria)) {
                    ordenado.add(b);
                }
            }
        }
        Collections.sort(ordenado, new Comparator<Atleta>() {
            @Override
            public int compare(Atleta o1, Atleta o2) {
                return o1.getMarca() - o2.getMarca();
            }
        });
        System.out.println(ordenado);
    }

    public void ParticipantesPorPaís(String pais) {
        int contador = 0;
        Collection<Set<Atleta>> a = maraton.values();
        for (Set<Atleta> p : a) {
            for (Atleta b : p) {
                if (b.getPais().equalsIgnoreCase(pais)) {
                    contador++;
                }
            }
        }
        System.out.println(pais + " posee " + contador + " Atletas");
    }


    public void guardarAtletas() {
        try {
            ObjectOutputStream ots = new ObjectOutputStream(new FileOutputStream("maraton.dat",true));
            Collection<Set<Atleta>> a1 = maraton.values();
            for (Set<Atleta> a2 : a1) {
                ots.writeObject(a2);

            }
            ots.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cargarAtletas() {
        int dorsal=0;

        try {
            ObjectInputStream otn = new ObjectInputStream(new FileInputStream("maraton.dat"));
            while (otn.readObject()!=null){
              boolean repetido=true;
                do {
                    if (!maraton.containsKey(dorsal)){
                        maraton.put(dorsal, (Set<Atleta>) otn.readObject());
                        repetido=false;
                    }else {
                        dorsal++;
                    }
                }while (repetido);


            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
