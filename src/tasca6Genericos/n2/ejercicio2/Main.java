package tasca6Genericos.n2.ejercicio2;

import tasca6Genericos.n1.ejercicio2.Persona;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona( "Ana", "Vargas", 55);
        Persona p2 = new Persona( "Daniela", "Vargas", 35);

        GenericMethodsNIII genericMethodsNIII = new GenericMethodsNIII();

        genericMethodsNIII.printer( p1, p2, "Feliz", "Semana", 2024);
    }
}
