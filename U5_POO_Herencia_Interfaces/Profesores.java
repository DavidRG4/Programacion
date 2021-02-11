package com.company;

public class Profesores extends Personas{
    private String nss;
    private String asignatura;

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public Profesores(String name, String dni, String tlf, String email, String direccion, String nss, String asignatura) {
        super(name, dni, tlf, email, direccion);
        this.nss = nss;
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "Profesores{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", tlf='" + tlf + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nss='" + nss + '\'' +
                ", asignatura='" + asignatura + '\'' +
                '}';
    }
}
