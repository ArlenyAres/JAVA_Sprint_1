package tasca3Collections.n2.ejercici2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        HashSet<Restaurante> restaurantes = new HashSet<>();

        restaurantes.add(new Restaurante("ABAC", 15));
        restaurantes.add(new Restaurante("Pepe", 18));
        restaurantes.add(new Restaurante("Pepe", 19));
        restaurantes.add(new Restaurante("LEKA", 15));
        restaurantes.add(new Restaurante("GreenLEKA", 49));
        restaurantes.add(new Restaurante("Bodegueta", 10));
        restaurantes.add(new Restaurante("Pepe", 19));

        List<Restaurante> restauranteList = new ArrayList<>(restaurantes);


        RestauranteComparator comparator = new RestauranteComparator();

        Collections.sort(restauranteList, comparator);

        for (Restaurante restaurante : restauranteList) {
            System.out.println(restaurante.toString());
        }


    }
}
