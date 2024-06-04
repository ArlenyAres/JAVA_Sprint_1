package tasca8Lambdas.n1;

@FunctionalInterface
interface Reverser {
    String reverse(String palabra);
}

public class Ejercicio8 {
    public static void main(String[] args) {

        Reverser reverser = palabra -> new StringBuilder(palabra).reverse().toString();

        System.out.println(reverser.reverse("Me quiero ir de vacaciones"));
    }
}
