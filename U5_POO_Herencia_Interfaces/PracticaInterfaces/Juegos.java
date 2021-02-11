package com.company.PracticaInterfaces;

import java.util.Arrays;
import java.util.Comparator;

public class Juegos {
    private int anio;
    private String sede;
    private Pais[] paises;
    private Deporte[] deportes;

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public Pais[] getPaises() {
        return paises;
    }

    public void setPaises(Pais[] paises) {
        this.paises = paises;
    }

    public Deporte[] getDeportes() {
        return deportes;
    }

    public void setDeportes(Deporte[] deportes) {
        this.deportes = deportes;
    }

    public Juegos(int anio, String sede) {
        this.anio = anio;
        if (this.anio % 4 != 0) {
            do {
                this.anio++;
            } while (this.anio % 4 != 0);
        }
        this.sede = sede;
        this.paises = new Pais[0];
        this.deportes = new Deporte[0];
    }

    public void addPaises(Pais p) {
        paises = Arrays.copyOf(paises, paises.length + 1);
        paises[paises.length - 1] = p;
    }

    public void deletePaises() {
        paises = Arrays.copyOf(paises, paises.length - 1);
    }

    public void addDeportes(Deporte d) {
        deportes = Arrays.copyOf(deportes, deportes.length + 1);
        deportes[deportes.length - 1] = d;
    }

    public void deleteDeporte() {
        deportes = Arrays.copyOf(deportes, deportes.length - 1);
    }

    public void mostrarPaises() {
        Arrays.sort(paises, new Comparator<Pais>() {
            @Override
            public int compare(Pais o1, Pais o2) {
                return o2.getNumParticipantes() - o1.getNumParticipantes();
            }
        });
        System.out.println(Arrays.deepToString(paises));
    }

    public void mostrarPaisesParaCeremonia() {
        Arrays.sort(paises, new Comparator<Pais>() {
            @Override
            public int compare(Pais o1, Pais o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        System.out.println(Arrays.deepToString(paises));
    }

    @Override
    public String toString() {
        return "Juegos{" +
                "anio=" + anio +
                ", sede='" + sede + '\'' +
                ", deportes=" + Arrays.toString(deportes) +
                '}';
    }
}
