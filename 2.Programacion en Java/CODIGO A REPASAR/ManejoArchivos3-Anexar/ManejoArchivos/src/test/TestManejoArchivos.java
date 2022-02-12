package test;

import manejoarchivos.ManejoArchivos;
import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
//        crearArchivo(nombreArchivo);

        ManejoArchivos.anexarArchivo(nombreArchivo, "Hola desde Java");
        anexarArchivo(nombreArchivo, "adios");
    }
}
