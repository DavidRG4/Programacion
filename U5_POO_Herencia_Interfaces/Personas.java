package com.company;

public class Personas {
    protected String name;
   protected String dni;
    protected String tlf;
    protected String email;
    protected String direccion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Personas(String name, String dni, String tlf, String email, String direccion) {
        this.name = name;
        this.dni = dni;
        this.tlf = tlf;
        this.email = email;
        this.direccion = direccion;
    }

    public Personas(String name, String dni, String tlf, String direccion) {
        this(name,dni,tlf,"",direccion);
    }

    @Override
    public String toString() {
        return "Personas{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", tlf='" + tlf + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
