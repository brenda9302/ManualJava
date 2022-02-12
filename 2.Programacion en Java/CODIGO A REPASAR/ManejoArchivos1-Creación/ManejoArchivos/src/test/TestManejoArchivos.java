package test;

import static manejoarchivos.ManejoArchivos.crearArchivo;

public class TestManejoArchivos {

    public static void main(String[] args) {
        String nombreArchivo = "prueba.txt";
// String nombreArchivo = "C:\\Users\\Brenda Violeta\\Documents\\Programacion en Java\\prueba\\prueba.txt";
        crearArchivo(nombreArchivo);
    }
}
