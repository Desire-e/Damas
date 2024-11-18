package org.iesalandalus.programacion.damas;

import org.iesalandalus.programacion.damas.modelo.Color;
import org.iesalandalus.programacion.damas.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

import java.sql.SQLOutput;

public class Consola {
    private Consola(){

    }



    public static void mostrarMenu(){
        System.out.println("============================================================================================");
        System.out.println("JUEGO DE LAS DAMAS");
        System.out.println("============================================================================================");
        System.out.println("1. Crear dama por defecto");
        System.out.println("2. Crear dama eligiendo color");
        System.out.println("3. Mover");
        System.out.println("4. Salir");
    }

    public static int elegirOpcionMenu(){
        int opcion;
        do{
            System.out.println("Elige una opción introduciendo el número correspondiente (1-4).");
            opcion= Entrada.entero();
        } while (opcion<1 || opcion>4);
        return opcion;
    }

    public static Color elegirColor(){
        int opcionColor;
        do{
            System.out.println("============================================================================================");
            System.out.println("1. Blanco");
            System.out.println("2. Negro");
            System.out.println("Elige un color (1-2).");
            opcionColor=Entrada.entero();
        }while(opcionColor<1 || opcionColor>2);

        if(opcionColor == 1){
            return Color.BLANCO;
        } else {
            return Color.NEGRO;
        }
    }

    public static void mostrarMenuDirecciones(){
        System.out.println("============================================================================================");
        System.out.println("1. Suroeste");
        System.out.println("2. Sureste");
        System.out.println("3. Noroeste");
        System.out.println("4. Noreste");
    }

    public static Direccion elegirDireccion(){
        int opcionDireccion;
        do {
            System.out.println("Elige una dirección (1-4).");
            opcionDireccion=Entrada.entero();
        } while(opcionDireccion<1 || opcionDireccion>4);

        if (opcionDireccion == 1){
            return Direccion.SUROESTE;
        }else if (opcionDireccion == 2){
            return Direccion.SURESTE;
        }else if (opcionDireccion == 3){
            return Direccion.NOROESTE;
        }else
            return Direccion.NORESTE;

    }

    public static int elegirPasos(){
        int numeroPasos;
        do{
        System.out.println("============================================================================================");
        System.out.println("Introduce el número de casillas. Deberá ser un número entero positivo mayor o igual que 1.");
        numeroPasos=Entrada.entero();
        } while(numeroPasos < 1);

        return numeroPasos;
    }

    public static void despedirse(){
        System.out.println("============================================================================================");
        System.out.println("¡Hasta pronto!");
        System.out.println("============================================================================================");
    }

}
