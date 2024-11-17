package org.iesalandalus.programacion.damas;

import javax.naming.OperationNotSupportedException;
import org.iesalandalus.programacion.damas.modelo.Color;
import org.iesalandalus.programacion.damas.modelo.Direccion;
import org.iesalandalus.programacion.damas.modelo.Dama;

public class MainApp {
	/*
	    * MÉTODOS PRIVADOS MENOS MAIN
	|* Crea el atributo de clase dama. Realiza un commit.
    //* Crea el método ejecutarOpcion que dependiendo de la opción pasada como parámetro, actuará en consecuencia.
      Realiza un commit.
    |* Crea el método crearDamaDefecto que asignará al atributo de clase dama una nueva instancia de una dama
      creada con el constructor por defecto. Realiza un commit.
    * Crea el método crearDamaColor que asignará al atributo de clase dama una nueva instancia de una dama
      creado con el constructor al que le pasamos el color. Realiza un commit.
    * Crea el método mover que mostrará un menú con las posibles direcciones. Nos preguntará por la dirección a
      mover. Si la dama es especial, nos también preguntará el número de casillas que queremos mover. Moverá la
      dama a la nueva posición, si es posible. Realiza un commit.
    * Crea el método mostrarDama que nos mostrará la información de la dama (color y posición) si ésta está
      creado. De lo contrario nos informará de ello.
    * Crea el método main que será el método principal de nuestra aplicación y deberá iterar mostrando el menú
      principal, pidiendo la opción y ejecutándola mientras no elijamos salir, en cuyo caso mostrará un mensaje
      de despedida y nuestra aplicación finalizará.

    * Realiza un commit y realiza el push a tu repositorio remoto en GitHub.
    */

    private static Dama dama;
    private void ejecutarOpcion(int opcion){
        Consola.mostrarMenu();
        opcion = Consola.elegirOpcionMenu();


    }

    private void crearDamaDefecto(){
        this.dama = new Dama();
    }

    private void crearDamaColor(){
        this.dama = new Dama(Consola.elegirColor());
    }


}
