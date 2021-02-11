package com.company.Frontera;

public class Persona {
    private String Nombre;
    private String DNI;
    Frontera F=new Frontera();


    public Persona(String nombre, String DNI) {
        Nombre = nombre;
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public void PasoFrontera(String Nom,String DNI){
        String result=Nom+" "+DNI;
        F.pasoFrontera(result);
   }
    public void TodasPersonas(){
        System.out.println(F);
    }
    public void FiltraNom(String nom){

    }


}
