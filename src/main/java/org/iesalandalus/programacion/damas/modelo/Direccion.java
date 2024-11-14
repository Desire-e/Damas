package org.iesalandalus.programacion.damas.modelo;

public enum Direccion {
    NORESTE("Noreste"), SURESTE("Sureste"), SUROESTE("Suroeste"), NOROESTE("Noroeste");

    private String cadenaAMostrar;

    private Direccion (String direccion) {
        cadenaAMostrar = direccion;
    }

    @Override
    public String toString(){
        return "Dirección{" + cadenaAMostrar + "}";
    }


}