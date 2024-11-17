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

    //Devuelve int
    public static String elegirOpcionMenu(){
        int opcion;
        do{
            System.out.println("Elige una opción introduciendo el número correspondiente.");
            opcion= Entrada.entero();
        } while (opcion<1 || opcion>4);

        if(opcion == 1){
            return "1. Crear dama por defecto.";
        } else if (opcion == 2){
            return "2. Crear dama eligiendo color.";
        } else if (opcion == 3){
            return "3. Mover.";
        } else
            return "4. Salir.";
    }

    //Devuelve Color
    public static String elegirColor(){
        int opcionColor;
        do{
            System.out.println("====================================================================");
            System.out.println("Elige un color:");
            System.out.println("1. Blanco");
            System.out.println("2. Negro");
            opcionColor=Entrada.entero();
        }while(opcionColor<1 || opcionColor>2);

        if(opcionColor == 1){
            return "1. Dama blanca.";
        } else {
            return "2. Dama negra.";
        }
    }

    public static void mostrarMenuDirecciones(){
        System.out.println("====================================================================");
        System.out.println("1. Suroeste");
        System.out.println("2. Sureste");
        System.out.println("3. Noroeste");
        System.out.println("4. Noreste");
    }

    //Devuelve Direccion
    public static String elegirDireccion(){
        int opcionDireccion;
        do {
            System.out.println("Elige una dirección:");
            opcionDireccion=Entrada.entero();
        } while(opcionDireccion<1 || opcionDireccion>4);

        if (opcionDireccion == 1){
            return "1. Suroeste.";
        }else if (opcionDireccion == 2){
            return "2. Sureste.";
        }else if (opcionDireccion == 3){
            return "3. Noroeste.";
        }else
            return "4. Noreste";
    }

    //Devuelve int
    public static int elegirPasos(){
        int numeroPasos;
        do{
        System.out.println("Introduzca el número de casillas. Deberá ser un número entero positivo mayor o igual que 1.");
        numeroPasos=Entrada.entero();
        } while(numeroPasos < 1);

        System.out.println("Número de pasos dados:");
        return numeroPasos;
    }

    public static void despedirse(){
        System.out.println("¡Hasta pronto!");
    }

    /*
    |* Crea el método mostrarMenu que mostrará el menú con las opciones de nuestra aplicación:
      crear dama por defecto, crear dama eligiendo el color, mover y salir. Realiza un commit.

    |* Crea el método elegirOpcionMenu que mostrará un mensaje para que elijamos una opción del
      menú anteriormente creado y nos pedirá que introduzcamos por teclado la opción hasta que
      ésta sea valida. Devolverá la opción elegida. Realiza un commit.

    |* Crea el método elegirOpcion que nos pedirá que elijamos un color mientras éste no sea
      válido y dependiendo de la opción elegida devolverá un color u otro. Realiza un commit.

    |* Crea el método mostrarMenuDirecciones que mostrará por consola un menú con las diferentes
    direcciones que podemos elegir. Realiza un commit.

    |* Crea el método elegirDireccion que mostrará un mensaje indicando que elijamos una dirección
    del menú anteriormente creado y nos pedirá que introduzcamos por teclado la opción hasta que
    ésta sea valida. Devolverá la dirección elegida. Realiza un commit.

    |* Crea el método elegirPasos que nos pedirá que introduzcamos por teclado el número de casillas,
    el cual deberá ser un número entero positivo mayor o igual que 1.

    |* Crea el método despedirse que mostrará un mensaje de despedida al salir de nuestra aplicación.

     */




}
