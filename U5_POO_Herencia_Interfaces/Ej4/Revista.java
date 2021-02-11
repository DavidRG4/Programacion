package com.company.Ej4;

public class Revista extends Publicaciones implements Comparable<Revista>{
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Revista(String ISBN, String titulo, int anio_Publicacion, int numero) {
        super(ISBN, titulo, anio_Publicacion);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "ISBN : " + ISBN + '\'' +
                ", Titulo : " + Titulo + '\'' +
                ", anio_Publicacion :" + anio_Publicacion +
                ", numero : " + numero +
                '}';
    }

    @Override
    public int compareTo(Revista o) {
        return numero- o.getNumero();
    }
}
