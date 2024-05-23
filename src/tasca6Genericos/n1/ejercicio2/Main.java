package tasca6Genericos.n1.ejercicio2;

public class Main {
    public static void main(String[] args) {

        Persona person = new Persona("Christopher", "Texidor", 34);

       GenericMethods genericMethods = new GenericMethods();

       genericMethods.<String, Persona, Integer>printer("Marcos", person, 35);


    }

}
