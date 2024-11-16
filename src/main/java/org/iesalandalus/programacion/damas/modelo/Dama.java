package org.iesalandalus.programacion.damas.modelo;

import java.util.Random;

public class Dama {
    private Color color;
    private Posicion posicion;
    private boolean esDamaEspecial = false;


    //getters y setters del tipo Color
    public Color getColor(){
        return color;
    }
    private void setColor(Color color) {
        if (color == null){
            throw new NullPointerException("El color es nulo.");
        }
        this.color = color;
    }

    //getters y setters del tipo Posicion
    public Posicion getPosicion(){
        return posicion;
    }
    public void setPosicion(Posicion posicion){
        if (posicion == null){
            throw new NullPointerException("La posición es nula.");
        }
        this.posicion = posicion;
    }


    //Constructor por defecto
    public Dama(){
        setColor(Color.BLANCO);
        //Setter llama al método que crea posición aleatoria inicial, y se asigna como parámetro el resultado
        setPosicion(crearPosicionInicial());
    }


    // Método para generar posición inicial
    private Posicion crearPosicionInicial() {
        int filaInicial;
        char columnaInicial = 'a';

        //Fila aleatoria entre 1 y 3
        filaInicial = (int) (Math.random() * 3) + 1;

        //Columna dependiendo de la fila
        if (filaInicial == 1 || filaInicial == 3) {
            //Enumeración de opción aleatoria entre 0 y 3 (cada valor de opción representa una columna)
            int opcion = (int) (Math.random() * 4);
            switch (opcion) {
                case 0 -> columnaInicial = 'a';
                case 1 -> columnaInicial = 'c';
                case 2 -> columnaInicial = 'e';
                case 3 -> columnaInicial = 'g';
            }
        } else if (filaInicial == 2) {
            int opcion = (int) (Math.random() * 4);
            switch (opcion) {
                case 0 -> columnaInicial = 'b';
                case 1 -> columnaInicial = 'd';
                case 2 -> columnaInicial = 'f';
                case 3 -> columnaInicial = 'h';
            }
        }
        Posicion posicionInicial = new Posicion(filaInicial, columnaInicial);
        return posicionInicial;
    }


    public static void main(String[] args) {
        Dama dama = new Dama();
        System.out.println("La posición y color de la dama es:" + dama);
    }




/*
CODIGO 1º
    private Posicion crearPosicionInicial() {
        Random random = new Random(); // Crear el objeto Random

        //Fila aleatoria entre 1 y 3
        int fila = random.nextInt(3) + 1;
        char columna = 'a';
        //'opcion' toma valores entre 0 y 3, que representan cada caso de cada switch
        int opcion = random.nextInt(4);

        if (fila == 1 || fila == 3) {
            switch (opcion) {
                case 0 -> columna = 'a';
                case 1 -> columna = 'c';
                case 2 -> columna = 'e';
                case 3 -> columna = 'g';
            }
        } else if (fila == 2) {
            switch (opcion) {
                case 0 -> columna = 'b';
                case 1 -> columna = 'd';
                case 2 -> columna = 'f';
                case 3 -> columna = 'h';
            }
        }

        return columna + fila;
    }
*/



    /*
    damaBlanca = new Dama(Color.BLANCO);
    damaNegra = new Dama(Color.NEGRO);
    */

}
