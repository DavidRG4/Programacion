package com.company.Ej4;

public abstract class Publicaciones {
   protected String ISBN;
   protected String Titulo;
  protected   int anio_Publicacion;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getAnio_Publicacion() {
        return anio_Publicacion;
    }

    public void setAnio_Publicacion(int anio_Publicacion) {
        this.anio_Publicacion = anio_Publicacion;
    }

    public Publicaciones(String ISBN, String titulo, int anio_Publicacion) {
        this.ISBN = ISBN;
        Titulo = titulo;
        this.anio_Publicacion = anio_Publicacion;
    }
}
