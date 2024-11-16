package org.iesalandalus.programacion.damas.modelo;

import java.util.Objects;

public class Posicion {

    private int fila;
    private char columna;


    //Constructor con parámetros: estado inicial se da cuando construimos objeto
    public Posicion(int fila, char columna){
        setFila(fila);
        setColumna(columna);
    }

    //Constructor copia
    public Posicion(Posicion posicion){
        setFila(posicion.getFila());
        setColumna(posicion.getColumna());
        /*
        if (otra == null) {
            throw new NullPointerException("No se puede copiar una posición nula.");
        }
        */
    }



    public int getFila() { return fila; }
    private void setFila(int fila){
        if (fila<1 || fila>8){
            //Ex. no comprobada
            throw new IllegalArgumentException("la fila como mínimo debe ser 1, como máximo 8.");
        }

        this.fila = fila;
    }

    public char getColumna() { return columna; }
    private void setColumna(char columna){
        if (columna < 'a' || columna > 'h'){
            throw new IllegalArgumentException("La columna debe ser desde la 'a' hasta la 'h'.");
        }

        this.columna = columna;
    }


    //Métodos equals() y hashcode()
    @Override
    /* Verifica los enlaces (códigos hash) de dos objetos para determinar su equivalencia */
    public boolean equals(Object o) {
        if (this == o) return true;
        /* Si el objeto con el que me estoy comparando soy yo, devuelve 'true'.*/
        if (o == null || getClass() != o.getClass()) return false;
        /* Si 'o' no tiene valor, o la clase del objeto en cuestión (this) es != de la clase del objeto o,
        devuelve false. (Es falso que sean el mismo objeto). */

        Posicion posicion = (Posicion) o;
        /* Convierte 'o' de tipo Object a tipo Posicion, y asigna su valor a objeto 'posicion' tipo Posicion */
        return fila == posicion.fila && columna == posicion.columna;
        /* Devuelve fila del objeto posicion, y columna del objeto posicion */
    }

    @Override
    /* Mapea los datos en un conjunto de caracteres (crea un código para esos datos) */
    public int hashCode() {
        return Objects.hash(fila, columna);
        /* Devuelve el hash de los objetos fila y columna */
    }


    @Override
    public String toString() {
        return "{"+
                "fila=" + fila +
                ", columna=" + columna +
                '}';
    }
}
