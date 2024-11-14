package org.iesalandalus.programacion.damas.modelo;

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


}
