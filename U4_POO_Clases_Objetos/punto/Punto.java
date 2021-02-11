package com.company.punto;

public class Punto {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void dezplazaX(double dx){
        this.x+=dx;
    }
    public void dezplazaXY(double dx, double dy){
        this.x+=dx;
        this.y+=dy;
    }
    double DistanciaEuclidea(Punto otro){
        double a;
        a = ((this.x+this.y) - (otro.getX()+otro.getY()));

        return a;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
