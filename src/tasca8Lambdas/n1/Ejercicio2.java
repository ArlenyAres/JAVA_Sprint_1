package tasca8Lambdas.n1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {

        List<String> lista = Arrays.asList("Hey", "Caramelo", "Mar", "Flores", "Romero", "Venezuela", "Juliana");

        List<String> listaFiltrada = (List<String>) lista.stream().filter(s -> s.contains("o") && s.length() > 5)
                .collect( Collectors.toList());
        System.out.println(listaFiltrada);
    }


}
