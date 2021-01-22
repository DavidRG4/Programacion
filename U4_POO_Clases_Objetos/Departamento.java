package com.company;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Departamento {
    private String nombre_departamento;
    private String Ciudad_Cede;
    private String tlf;
    Empleado[] em=new Empleado[0];
    static int nDep;

    public static int getnnDep() {
        return nDep;
    }

    public static void setnnDep(int nEmp) {
        Departamento.nDep = nEmp;
    }

    public String getNombre_departamento() {
        return nombre_departamento;
    }

    public void setNombre_departamento(String nombre_departamento) {
        this.nombre_departamento = nombre_departamento;
    }

    public String getCiudad_Cede() {
        return Ciudad_Cede;
    }

    public void setCiudad_Cede(String ciudad_Cede) {
        Ciudad_Cede = ciudad_Cede;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public Empleado[] getEm() {
        return em;
    }

    public void setEm(Empleado[] em) {
        this.em = em;
    }

    //Contrcutores
    public Departamento(String nombre_departamento, String ciudad_Cede, String tlf) {
        this.nombre_departamento = nombre_departamento;
        Ciudad_Cede = ciudad_Cede;
        this.tlf = tlf;
        this.em = new Empleado[0];
        Departamento.nDep++;
    }

    public Departamento(String nombre_departamento, String tlf) {
        this.nombre_departamento = nombre_departamento;
        Ciudad_Cede = "Castilleja";
        this.tlf = tlf;

    }

    //Procesos

    public void addEmpl(Empleado emp) {
        this.em = Arrays.copyOf(this.em, this.em.length + 1);
        this.em[this.em.length - 1] = emp;

    }

    public void DeleteEmpl() {
        this.em = Arrays.copyOf(this.em, this.em.length - 1);
    }

    public void MostrarEmpleado() {
        for (Empleado Z : this.em) {
            System.out.println(Z);
        }

    }

    //ToString

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre_departamento='" + nombre_departamento + '\'' +
                ", Ciudad_Cede='" + Ciudad_Cede + '\'' +
                ", tlf='" + tlf +
                '}';
    }
}
