package org.iesalandalus.programacion.damas;

import javax.naming.OperationNotSupportedException;
import org.iesalandalus.programacion.damas.modelo.Color;
import org.iesalandalus.programacion.damas.modelo.Direccion;
import org.iesalandalus.programacion.damas.modelo.Dama;

public class MainApp {


    private static Dama dama;

    public static void main (String[] args) {
        int opcion;
        do {
            Consola.mostrarMenu();
            opcion = Consola.elegirOpcionMenu();
            ejecutarOpcion(opcion);
        } while (opcion != 4);

    }


    private static void ejecutarOpcion(int opcion){

        switch (opcion){
            case 1:
                crearDamaDefecto();
                mostrarDama();
                break;
            case 2:
                crearDamaColor();
                mostrarDama();
                break;
            case 3:
                mover();
                break;
            case 4:
                Consola.despedirse();
                break;
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
            System.out.println("Dama nula. Debes de crear primero una dama.");
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
            mostrarDama();

        } catch(OperationNotSupportedException e){
            //Movimiento invalido: pasos de dama especial / sale del tablero
            System.out.println(e.getMessage());
        } catch(IllegalArgumentException e){
            //Parámetro pasos incorrecto
            System.out.println(e.getMessage());
        } catch(NullPointerException e){
            //Parámetro direccion nulo
            System.out.println(e.getMessage());
        }

    }

    private static void mostrarDama(){
        if (dama == null ){
            System.out.println("No hay dama creada.");
        } else
            System.out.println("- Color: " + dama.getColor());
            System.out.println("- Posicion: " + dama.getPosicion());
    }

}
