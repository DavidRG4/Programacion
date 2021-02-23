package com.company;

public class Cliente implements Comparable<Cliente>{
    private String nombre;
    private String apelldos;
    private String direccion;
    private String dni;

    public Cliente(String nombre, String apelldos, String direccion, String dni) {
        this.nombre = nombre;
        this.apelldos = apelldos;
        this.direccion = direccion;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelldos() {
        return apelldos;
    }

    public void setApelldos(String apelldos) {
        this.apelldos = apelldos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public int compareTo(Cliente o) {
        return this.apelldos.compareTo(o.getApelldos());
    }
}
