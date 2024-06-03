package tasca8Lambdas.n1;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("hola", "mundo", "java", "lambdas");
        List<String> filtrados = lista.stream()
                .filter(s -> s.contains("o"))
                .collect(Collectors.toList());
        System.out.println(filtrados);
    }
}


