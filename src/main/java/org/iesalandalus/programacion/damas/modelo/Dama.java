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
        if (color != Color.BLANCO || color != Color.NEGRO) {
            throw new IllegalArgumentException("ERROR: eL color solo puede ser Blanco o Negro");
        } else
            this.color=color;
    }

    //getters y setters del tipo Posicion
    public Posicion getPosicion(){
        return posicion;
    }
    public void setPosicion(Posicion posicion){
        this.posicion=posicion;
        //COMPROBAR VALIDEZ? TIPO DE EXCEPCION?
    }




}
