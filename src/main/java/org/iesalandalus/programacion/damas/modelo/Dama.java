package org.iesalandalus.programacion.damas.modelo;

import javax.naming.OperationNotSupportedException;

public class Dama {
    private Color color;
    private Posicion posicion;
    private boolean esDamaEspecial;




    //Constructor por defecto
    public Dama(){
        setColor(Color.BLANCO);
        //Setter llama al método que crea posición aleatoria inicial, y se asigna como parámetro el resultado
        setPosicion(crearPosicionInicial());
        this.esDamaEspecial = false;
    }

    //Constructor copia
        // Según lo que reciba este constructor, será    Color color = Color.BLANCO o Color.NEGRO;
    public Dama (Color color){
        /*
        if (color == null) {
            throw new NullPointerException("El color no puede ser nulo.");
        }
         */
        setColor(color);
        setPosicion(crearPosicionInicial());
        this.esDamaEspecial = false;
    }




    //Getter y setter de variable tipo Color
    public Color getColor(){
        return color;
    }
    private void setColor(Color color) {
        if (color == null){
            throw new NullPointerException("ERROR: El color no puede ser nulo.");
        }
        this.color = color;
    }

    //Getter y setter de variable tipo Posicion
    public Posicion getPosicion(){
        return posicion;
        /* return new Posicion(posicion); */
    }
    public void setPosicion(Posicion posicion){
        if (posicion == null){
            throw new NullPointerException("La posición es nula.");
        }
        this.posicion = posicion;
        /* this.posicion = new Posicion(posicion); */
    }

    public boolean getEsDamaEspecial(){
        return esDamaEspecial;
    }




    // Método para generar posición inicial
    private Posicion crearPosicionInicial() {
        // Definir las filas iniciales dependiendo del color de la dama (de 1 a 8)
        int filaInicial;
        if (color == Color.BLANCO) {
            filaInicial = (int)(Math.random()*3)+1;  // Fila de 1 a 3
        } else {
            filaInicial = (int)(Math.random()*3)+6;  // Fila de 6 a 8
        }

        // Generar una columna dependiendo de la fila (de 'a' a 'h')
        char columnaInicial = 'a';

        if (filaInicial == 1 || filaInicial == 3 || filaInicial == 7) {
            //Enumeración de opción aleatoria, entre 0 y 3 (cada valor de opción representa una columna)
            int opcion = (int) (Math.random() * 4);
            switch (opcion) {
                case 0 -> columnaInicial = 'a';
                case 1 -> columnaInicial = 'c';
                case 2 -> columnaInicial = 'e';
                case 3 -> columnaInicial = 'g';
            }
        } else if (filaInicial == 2 || filaInicial == 8 || filaInicial == 6) {
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
        /*  return new Posicion(filaInicial, columnaInicial);  */
    }




    public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
        //Dirección no puede ser nula
        if (direccion == null){
            throw new NullPointerException("ERROR: La dirección no puede ser nula.");
        }

        //Pasos para dama que esDamaEspecial
        if (pasos < 1) {
            throw new IllegalArgumentException("El número de pasos debe ser mayor o igual a 1");
        }

        //Pasos para dama que NO esDamaEspecial
        if (!esDamaEspecial && pasos != 1) {
            throw new OperationNotSupportedException("ERROR: Las damas normales solo se pueden mover 1 casilla.");
        }

        //Dirección cuando la dama NO esDamaEspecial, teniendo en cuenta el color
        if (!esDamaEspecial) {
            if (color == Color.BLANCO && (direccion == Direccion.SURESTE || direccion == Direccion.SUROESTE)) {
                throw new  OperationNotSupportedException("ERROR: Movimiento no permitido.");
            }
            if (color == Color.NEGRO && (direccion == Direccion.NORESTE || direccion == Direccion.NOROESTE)) {
                throw new OperationNotSupportedException("ERROR: Movimiento no permitido.");
            }
        }

        //Cambios de valor en fila y columna según dirección indicada y nº de pasos.
        int siguienteFila = posicion.getFila();
        char siguienteColumna = posicion.getColumna();

        switch(direccion) {
            case NORESTE -> {
                siguienteFila += pasos;
                siguienteColumna += pasos;
            }
            case NOROESTE -> {
                siguienteFila += pasos;
                siguienteColumna -= pasos;
            }
            case SURESTE -> {
                siguienteFila -= pasos;
                siguienteColumna += pasos;
            }
            case SUROESTE -> {
                siguienteFila -= pasos;
                siguienteColumna -= pasos;
            }
        }

        //Paso de dama a esDamaEspecial
        if (color == Color.BLANCO && siguienteFila == 8 || color == Color.NEGRO && siguienteFila == 1){
            esDamaEspecial = true;
        }

        if (siguienteFila < 1 || siguienteFila > 8 || siguienteColumna < 'a' || siguienteColumna > 'h'){
            throw new OperationNotSupportedException("La dama se sale del tablero. Las filas van de 1 a 8 y las columnas de 'a' hasta 'h'.");
        }

        // Actualizar posición mientras sea válido.
        this.posicion = new Posicion(siguienteFila, siguienteColumna);
    }




    //Método toString
    @Override
    public String toString() {
        return "color=" + color + ", posicion=(" + posicion + ")";
    }

}
