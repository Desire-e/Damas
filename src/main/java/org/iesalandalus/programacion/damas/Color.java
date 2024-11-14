package org.iesalandalus.programacion.damas;

public enum Color {
    BLANCO("Blanco"), NEGRO("Negro");

    private String cadenaAMostrar;

    private Color (String color) {
        cadenaAMostrar = color;
    }

    @Override
    public String toString() {
        return cadenaAMostrar;
    }
}
