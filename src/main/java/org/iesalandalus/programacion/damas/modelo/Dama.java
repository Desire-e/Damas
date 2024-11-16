package org.iesalandalus.programacion.damas.modelo;

public class Dama {
    private Color color;
    private Posicion posicion;
    private boolean esDamaEspecial;




    //Constructor por defecto
    public Dama(){
        setColor(Color.BLANCO);
        //Setter llama al método que crea posición aleatoria inicial, y se asigna como parámetro el resultado
        setPosicion(crearPosicionInicial());
        this.esDamaEspecial = false;
    }

    //Constructor copia
        // Según lo que reciba este constructor, será    Color color = Color.BLANCO o Color.NEGRO;
        //Quizás habrá que crear un menú para elegir color, donde este pase el parámetro que significará
        // un color u otro, que será pasado a este constructor.
    public Dama (Color color){
        setColor(color);
        setPosicion(crearPosicionInicial());
        this.esDamaEspecial = false;
    }




    //getter y setter de variable tipo Color
    public Color getColor(){
        return color;
    }
    private void setColor(Color color) {
        if (color == null){
            throw new IllegalArgumentException("El color es nulo.");
        }
        this.color = color;
    }

    //getter y setter de variable tipo Posicion
    public Posicion getPosicion(){
        return posicion; /* return new Posicion(posicion); */
    }
    public void setPosicion(Posicion posicion){
        if (posicion == null){
            throw new IllegalArgumentException("La posición es nula.");
        }
        this.posicion = posicion; /* this.posicion = new Posicion(posicion); */
    }




    // Método para generar posición inicial

    private Posicion crearPosicionInicial() {
        // Definir las filas iniciales dependiendo del color de la dama (de 1 a 8)
        int filaInicial;
        if (color == Color.BLANCO) {
            filaInicial = (int)(Math.random()*3)+1;  // Fila de 1 a 3
        } else {
            filaInicial = (int)(Math.random()*3)+6;  // Fila de 6 a 8
        }

        // Generar una columna dependiendo de la fila (de 'a' a 'h')
        char columnaInicial = 'a';

        if (filaInicial == 1 || filaInicial == 3 || filaInicial == 7) {
            //Enumeración de opción aleatoria, entre 0 y 3 (cada valor de opción representa una columna)
            int opcion = (int) (Math.random() * 4);
            switch (opcion) {
                case 0 -> columnaInicial = 'a';
                case 1 -> columnaInicial = 'c';
                case 2 -> columnaInicial = 'e';
                case 3 -> columnaInicial = 'g';
            }
        } else if (filaInicial == 2 || filaInicial == 8 || filaInicial == 6) {
            int opcion = (int) (Math.random() * 4);
            switch (opcion) {
                case 0 -> columnaInicial = 'b';
                case 1 -> columnaInicial = 'd';
                case 2 -> columnaInicial = 'f';
                case 3 -> columnaInicial = 'h';
            }
        }

        Posicion posicionInicial = new Posicion(filaInicial, columnaInicial);
        return posicionInicial;
        /*  return new Posicion(filaInicial, columnaInicial);  */
    }




    /* Crea el método mover que acepte como parámetros una Direccion y el número de pasos que se moverá.
    Deberás tener en cuenta las siguientes restricciones: Realiza un commit.
        * La dirección no puede ser nula o de lo contrario debe lanzar una excepción adecuada
          (NullPointerException o IllegalArgumentException) con el mensaje adecuado.
            * Si la dama todavía no se ha convertido en dama especial, solamente podrá moverse en un dirección
              que le permita avanzar en el tablero y nunca retroceder. Noreste o Noroeste (si es una dama blanca)
              y Sureste o Suroeste (si es una dama negra).
        * El número de casillas que se mueve la dama deberá ser un número entero positivo, >=que 1.
            * Si la dama todavía no se ha convertido en dama especial, el numero de casillas que se mueve será 1.
        * Si la dama llega al extremo del tablero (fila 8 si es blanca o fila 1 si es negra) se convertirá
          en dama especial modificando el atributo esDamaEspecial y poniéndolo al verdadero.
        * Si no puede realizar dicho movimiento, debido a que la dama se sale del tablero o que no está
          permitido porque todavía no es una dama especial, se debe lanzar una excepción del tipo
          OperationNotSupportedException con un mensaje adecuado y no modificarán los atributos de la dama. Si
          el movimiento es válido, se modificará la posición actual de la dama.*/
    public void mover(){


    }



/*
    //Probar métodos
    @Override
    public String toString() {
        return "Dama{" +
                "color=" + color +
                ", posicion=" + posicion +
                '}';
    }

    public static void main(String[] args) {
        Dama dama = new Dama();
        System.out.println("La posición y color de la dama es:" + dama);
    }
*/




}
