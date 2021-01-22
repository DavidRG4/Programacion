package com.company;

import java.lang.reflect.Method;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Empresa Emp = new Empresa("Intell");

        Departamento Dp = new Departamento("publicidad", "Sevilla", "134125213");
        Departamento Dp1 = new Departamento("Encargos", "Sevilla", "134125213");
        Departamento Dp2 = new Departamento("Comunicaciones", "134125213");

        Empleado Emple = new Empleado("Manue Rivas", "123DW", "14221329", claseEmpleado.administrativo);
        Empleado Emple1 = new Empleado("francisco Perez", "128DW", "14221329", claseEmpleado.administrativo);
        Empleado Emple2 = new Empleado("Pepe Perez", "164DW", "14221329");
        Empleado Emple3 = new Empleado("Maria Garcia", "116DW", "14221329", claseEmpleado.directivo);
        Empleado Emple4 = new Empleado("Toni Rivas", "142DW", "14221329", claseEmpleado.directivo);
        Empleado Emple5 = new Empleado("john Castaño", "102DW", "14221329");

        Emp.addDepartamento(Dp);
        Emp.addDepartamento(Dp1);
        Emp.addDepartamento(Dp2);

        Dp.addEmpl(Emple);
        Dp.addEmpl(Emple1);
        Dp1.addEmpl(Emple2);
        Dp1.addEmpl(Emple3);
        Dp2.addEmpl(Emple4);
        Dp2.addEmpl(Emple5);

        Emp.mostrarDepart();
        Dp.MostrarEmpleado();
        Dp1.MostrarEmpleado();

        System.out.println(Departamento.getnnDep());
        System.out.println(Empleado.getnEmp());
    }
}
