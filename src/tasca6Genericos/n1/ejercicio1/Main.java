package tasca6Genericos.n1.ejercicio1;

public class Main {
    public static void main(String[] args) {

        NoGenericMethods order1 = new NoGenericMethods("Gabriela", "Jamon", "piscis");
        NoGenericMethods order2 = new NoGenericMethods("picsis", "Gabriela", "Jamon");

        System.out.println(order1.toString());
        System.out.println(order2.toString());

    }
}