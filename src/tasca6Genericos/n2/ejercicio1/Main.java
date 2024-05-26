package tasca6Genericos.n2.ejercicio1;

import tasca6Genericos.n1.ejercicio2.Persona;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Persona person = new Persona("Maia", "Enriquez", 9);

        GenericMethodsNII genericMethodsNII = new GenericMethodsNII();

        genericMethodsNII.printer("Carolina", person, 18);
    }
}
