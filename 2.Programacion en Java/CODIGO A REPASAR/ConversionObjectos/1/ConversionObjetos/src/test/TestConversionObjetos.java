package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado  empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
//        System.out.println("empleado = " + empleado);
        
        //System.out.println(empleado.obtenerDetalles());
        
        //downcasting
        //((Escritor)empleado).getTipoEscritura();
        Escritor escritor = (Escritor) empleado;
//             System.out.println(escritor.getTipoEscritura());
//        
//        //Upcasting
       Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
}