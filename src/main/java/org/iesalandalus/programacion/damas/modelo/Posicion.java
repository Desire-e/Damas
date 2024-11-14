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
    public Posicion(Posicion p){
        setFila(p.getFila());
        setColumna(p.getColumna());
    }



    public int getFila() { return fila; }
    public void setFila(int fila){
        if (fila<1 || fila>8){
            throw new IllegalArgumentException("ERROR: la fila como mínimo debe ser 1, como máximo 8");
        }

        this.fila = fila;
    }

    public char getColumna() { return columna; }
    public void setColumna(char columna){
        if (columna == 'a' || columna == 'b' || columna == 'c' || columna == 'd' || columna == 'e'
                || columna == 'f' || columna == 'g' || columna == 'h'){
            this.columna = columna;

        } else
            throw new IllegalArgumentException("ERROR: La columna debe ser desde la 'a' hasta la 'h'");
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

        Posicion other = (Posicion) o;
        /* Convierte 'o' de tipo Object a tipo Posicion, y asigna su valor a objeto 'other' tipo Posicion */
        return fila == other.fila && columna == other.columna;
        /* Devuelve fila del objeto other, y columna del objeto other */
    }

    @Override
    /* Mapea los datos en un conjunto de caracteres (crea un código para esos datos) */
    public int hashCode() {
        return Objects.hash(fila, columna);
        /* Devuelve el hash de los objetos fila y columna */
    }


    @Override
    public String toString() {
        return "Posicion{" +
                "fila=" + fila +
                ", columna=" + columna +
                '}';
    }
}
