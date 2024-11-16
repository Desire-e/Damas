package org.iesalandalus.programacion.damas;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
    private Consola(){

    }




    public static void mostrarMenu(){
        System.out.println("====================================================================");
        System.out.println("JUEGO DE LAS DAMAS");
        System.out.println("====================================================================");
        System.out.println("1. Crear dama por defecto.");
        System.out.println("2. Crear dama eligiendo color.");
        System.out.println("3. Mover.");
        System.out.println("4. Salir.");
    }

    public static int elegirOpcionMenu(){
        int opcion;
        do{
            System.out.println("Elige una opción introduciendo el número correspondiente.");
            opcion= Entrada.entero();
        } while (opcion<1 || opcion>4);
        return opcion;
    }





}
