package com.company.Ej3;

public class EtiquetaCarton {
    protected String codigo;
    protected String direccion;

    public EtiquetaCarton(String codigo, String direccion) {
        this.codigo = codigo;
        this.direccion = direccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "EtiquetaCarton{" +
                "codigo='" + codigo + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
