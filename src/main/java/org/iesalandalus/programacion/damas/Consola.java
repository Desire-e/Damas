package org.iesalandalus.programacion.damas;

public class Consola {
    private Consola(){

    }

    /*mostrará el menú con las opciones de nuestra aplicación:
    - crear dama por defecto,
    - crear dama eligiendo el color,
    - mover,
    - salir.
     */
    public static void mostrarMenu(){
        System.out.println("====================================================================");
        System.out.println("JUEGO DE LAS DAMAS");
        System.out.println("Elige una opción introduciendo el número correspondiente.");
        System.out.println("====================================================================");
        System.out.println("1. Crear dama por defecto.");
        System.out.println("2. Crear dama eligiendo color.");
        System.out.println("3. Mover.");
        System.out.println("4. Salir.");

    }



}
