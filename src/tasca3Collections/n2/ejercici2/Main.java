package tasca3Collections.n2.ejercici2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        TreeSet<Restaurante> restaurantes = new TreeSet<>(new RestauranteComparator());

        restaurantes.add(new Restaurante("ABAC", 15));
        restaurantes.add(new Restaurante("Pepe", 18));
        restaurantes.add(new Restaurante("Pepe", 19));
        restaurantes.add(new Restaurante("LEKA", 15));
        restaurantes.add(new Restaurante("GreenLEKA", 49));
        restaurantes.add(new Restaurante("Bodegueta", 10));
        restaurantes.add(new Restaurante("Pepe", 19));

        List<Restaurante> restauranteList = new ArrayList<>(restaurantes);

        for (Restaurante restaurante : restauranteList) {
            System.out.println(restaurante.toString());
        }


    }
}
