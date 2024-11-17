package org.iesalandalus.programacion.damas;

import javax.naming.OperationNotSupportedException;
import org.iesalandalus.programacion.damas.modelo.Color;
import org.iesalandalus.programacion.damas.modelo.Direccion;
import org.iesalandalus.programacion.damas.modelo.Dama;

public class MainApp {
	/*
    * Realiza un commit y realiza el push a tu repositorio remoto en GitHub.
    */

    private static Dama dama;

    public static void main (String[] args){
        do {
            Consola.mostrarMenu();
            Consola.elegirOpcionMenu();
            ejecutarOpcion(Consola.elegirOpcionMenu());
        } while(Consola.elegirOpcionMenu() != 4);

    }

    private static void ejecutarOpcion(int opcion){
        Consola.mostrarMenu();
        opcion = Consola.elegirOpcionMenu();
        switch (opcion){
            case 1:
                crearDamaDefecto();
            case 2:
                crearDamaColor();
            case 3:
                mover();
            case 4:
                Consola.despedirse();
        }
    }


    private static void crearDamaDefecto(){
        dama = new Dama();
    }


    private static void crearDamaColor(){
        dama = new Dama(Consola.elegirColor());
    }


    private static void mover() {
        if (dama == null) {
            throw new NullPointerException("Dama nula. Debes de crear primero una dama.");
        }

        Consola.mostrarMenuDirecciones();

        Direccion direccion = Consola.elegirDireccion();
        int pasos;
        if (dama.getEsDamaEspecial()) {
            pasos = Consola.elegirPasos();
        } else {
            pasos = 1;
        }

        try {
            dama.mover(direccion, pasos);

        } catch(OperationNotSupportedException e){
            //Movimiento invalido: pasos de dama especial / sale del tablero
            System.out.println("ERROR: " + e.getMessage());
        } catch(IllegalArgumentException e){
            //Parámetro pasos incorrecto
            System.out.println("ERROR: " + e.getMessage());
        } catch(NullPointerException e){
            //Parámetro direccion nulo
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private static void mostrarDama(){
        if (dama == null ){
            System.out.println("No hay dama creada.");
        } else
            System.out.println("Dama creada:");
            System.out.println("- Color: " + dama.getColor());
            System.out.println("- Posicion: " + dama.getPosicion());
    }


}
