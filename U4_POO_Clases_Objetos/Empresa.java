package com.company;

import java.util.Arrays;

public class Empresa {
    private String nombre_empresa;
    Departamento[] dp;


   public String getNombre_empresa() {
      return nombre_empresa;
   }

   public void setNombre_empresa(String nombre_empresa) {
      this.nombre_empresa = nombre_empresa;
   }

   public Departamento[] getDp() {
      return dp;
   }

   public void setDp(Departamento[] dp) {
      this.dp = dp;
   }

   //Constructor

   public Empresa(String nombre_empresa) {
      this.nombre_empresa = nombre_empresa;
      this.dp=new Departamento[0];

   }



//Procesos


   public void addDepartamento(Departamento dp){
      this.dp=Arrays.copyOf(this.dp,this.dp.length+1);
      this.dp[this.dp.length-1]=dp;

   }
   public void mostrarDepart(){
      for (Departamento N :this.dp ) {
         System.out.println(N);
      }
   }
//ToString

   @Override
   public String toString() {
      return "Empresa{" +
              "nombre_empresa='" + nombre_empresa + '\'' +
              ", dp=" + Arrays.toString(dp) +
              '}';
   }
}
