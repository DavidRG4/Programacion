package com.company.MapT4;

import java.util.*;

public class Ej1 {
    public static void main(String[] args) {
        Map<String, Double> productos = new HashMap<>();
        List producto=new ArrayList<LineaPedido>();
        boolean aux;
        Scanner sc = new Scanner(System.in);
        String pr,codDescuento;
        int cant;
        Double result=0.0,descuento=0.0;
        productos.put("Tomate",1.59);
        productos.put("Quinoa",4.50);
        productos.put("Avena",2.21);

        do {
            System.out.println("Producto: ");
            pr = sc.nextLine();

            if (!pr.equalsIgnoreCase("fin")) {
                System.out.println("Cantidad: ");
                cant = sc.nextInt();
                sc.nextLine();
                LineaPedido lp=new LineaPedido(pr,cant);

                producto.add(lp);

                }
        } while (!pr.equalsIgnoreCase("fin"));
        System.out.println("Introduzca un codigo descuento(Pulse Intro si no tiene)");
        codDescuento=sc.nextLine();
        if (codDescuento.equalsIgnoreCase("ecodto")){
            aux=true;
        }else {
            aux=false;
        }

        System.out.println("Producto  Precio  Cantidad  Subtotal");

        Iterator it=producto.iterator();
        while (it.hasNext()){
            LineaPedido lp2= (LineaPedido) it.next();
            System.out.println(lp2.getNombre()+"    "+
                    productos.get(lp2.getNombre())+"    "+
                    lp2.getCantidad()+"         "+
                    (lp2.getCantidad()*productos.get(lp2.getNombre())));
            result+=(lp2.getCantidad()*productos.get(lp2.getNombre()));
        }
        if (aux){
            descuento=result*0.1;
            System.out.println("Descuento realizado= "+descuento);
            System.out.println("Total a pagar= "+(result-descuento));
        }else {
            System.out.println("Total a pagar= "+result);
        }

    }
}
