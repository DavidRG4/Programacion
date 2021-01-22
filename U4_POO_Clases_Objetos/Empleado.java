package com.company;

import java.time.Year;
import java.util.Calendar;

public class Empleado {
   private String nombre_completo_empleado;
   private String numeroSeguridadSocial;
   private String telf_emp;
   private Calendar fechEntrada=Calendar.getInstance();
   claseEmpleado ce;
   static int nEmp;

   public static int getnEmp() {
      return nEmp;
   }

   public static void setnEmp(int nEmp) {
      Empleado.nEmp = nEmp;
   }

   public String getNombre_completo_empleado() {
      return nombre_completo_empleado;
   }

   public void setNombre_completo_empleado(String nombre_completo_empleado) {
      this.nombre_completo_empleado = nombre_completo_empleado;
   }

   public String getNumeroSeguridadSocial() {
      return numeroSeguridadSocial;
   }

   public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
      this.numeroSeguridadSocial = numeroSeguridadSocial;
   }

   public String getTelf_emp() {
      return telf_emp;
   }

   public void setTelf_emp(String telf_emp) {
      this.telf_emp = telf_emp;
   }

   public Calendar getFechEntrada() {
      return fechEntrada;
   }

   public void setFechEntrada(Calendar fechEntrada) {
      this.fechEntrada = fechEntrada;
   }

   public claseEmpleado getCe() {
      return ce;
   }

   public void setCe(claseEmpleado ce) {
      this.ce = ce;
   }

   //Constructores

   public Empleado(String nombre_completo_empleado, String numeroSeguridadSocial, String telf_emp, claseEmpleado ce) {
      this.nombre_completo_empleado = nombre_completo_empleado;
      this.numeroSeguridadSocial = numeroSeguridadSocial;
      this.telf_emp = telf_emp;
      this.fechEntrada = Calendar.getInstance();
      this.ce = ce;
      Empleado.nEmp++;
   }

   public Empleado(String nombre_completo_empleado, String numeroSeguridadSocial, String telf_emp) {
      this(nombre_completo_empleado,numeroSeguridadSocial,telf_emp,claseEmpleado.tecnico);

   }

//ToString

   @Override
   public String toString() {
      String dia,mes,anio;
      dia=Integer.toString(fechEntrada.get(Calendar.DATE));
      mes=Integer.toString(fechEntrada.get(Calendar.MONTH+1));
      anio=Integer.toString(fechEntrada.get(Calendar.YEAR));
      return "Empleado{" +
              "nombre_completo_empleado='" + nombre_completo_empleado + '\'' +
              ", numeroSeguridadSocial='" + numeroSeguridadSocial + '\'' +
              ", telf_emp='" + telf_emp + '\'' +
              ", fechEntrada=" + dia+"/"+mes+"/"+anio+
              ", ce=" + ce +
              '}';
   }
}
