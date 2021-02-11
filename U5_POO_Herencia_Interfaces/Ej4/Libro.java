package com.company.Ej4;

public class Libro extends Publicaciones implements Prestable,Comparable<Libro>{
   private boolean prestado;

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public Libro(String ISBN, String titulo, int anio_Publicacion) {
        super(ISBN, titulo, anio_Publicacion);
        prestado=false;
    }

    @Override
    public void presta() {
    if (this.prestado){
        System.out.println("Este libro ya esta prestado");
    }else {
        this.prestado=true;
    }

    }
    @Override
    public void devuelve() {
        if (this.prestado){
            this.prestado=false;
        }

    }

    @Override
    public boolean estaPrestado() {
        if (this.prestado){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Libro{" +
                " ISBN : " + ISBN + '\'' +
                ", Titulo: " + Titulo + '\'' +
                ", anio_Publicacion :" + anio_Publicacion +"prestado=" + prestado +
                '}';
    }

    @Override
    public int compareTo(Libro l) {
       return anio_Publicacion-l.getAnio_Publicacion();
    }
}
