package com.MJMV.x00198319;

public class Documento {
    private String Nombre;
    private String Numero;

    public Documento(String nombre, String numero) {
        Nombre = nombre;
        Numero = numero;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getNumero() {
        return Numero;
    }

    @Override
    public String toString() {
        return
                "\nTipo de documento:'" + Nombre + '\'' +
                "\nNumero:'" + Numero ;
    }
}