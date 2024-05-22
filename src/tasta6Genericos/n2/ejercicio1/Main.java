package tasta6Genericos.n2.ejercicio1;

import tasta6Genericos.n1.ejercicio2.Persona;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Persona person = new Persona("Christopher", "Texidor", 34);

        // Ejercicio 1
        GenericMethodsNII<Integer> genericMethods = new GenericMethodsNII<Integer>(12356, "Arbol", 12345, person);

        System.out.println(genericMethods.toString());

        // Ejercicio 2
        GenericMethodsNII<String> genericMethods2 = new GenericMethodsNII<String>("Casa",
                Arrays.asList("Arbol", 12345, person));

        System.out.println(genericMethods2.toString());
    }

}
