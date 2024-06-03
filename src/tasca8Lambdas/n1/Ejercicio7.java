package tasca8Lambdas.n1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ejercicio7 {
    public static void main(String[] args) {

        List<Object> elementos = Arrays.asList("manzana", 3, "Chocolate", "kiwi", 42, "cinco", "uva",
                "mango", 7 , "Ejercicicios");

        List<String> sortedStrings = elementos.stream()
                .filter(elemento -> elemento instanceof String)
                .map(elemento -> (String) elemento)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toList();

        System.out.println("Cadenas de mas larga a mas corta: " + sortedStrings);
    }
}
