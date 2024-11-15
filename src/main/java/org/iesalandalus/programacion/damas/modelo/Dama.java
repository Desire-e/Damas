package org.iesalandalus.programacion.damas.modelo;

public class Dama {
    private Color color;
    private Posicion posicion;
    private boolean esDamaEspecial = false;


    //getters y setters del tipo enum
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

    /*
    damaBlanca = new Dama(Color.BLANCO);
    damaNegra = new Dama(Color.NEGRO);
    */

}
