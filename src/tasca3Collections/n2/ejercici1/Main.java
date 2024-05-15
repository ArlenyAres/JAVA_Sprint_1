package tasca3Collections.n2.ejercici1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Restaurante> restaurantes = new HashSet<>();

        restaurantes.add(new Restaurante("Pepe", 1500));
        restaurantes.add(new Restaurante("Catalina", 1500));
        restaurantes.add(new Restaurante("Pepe", 1500));
        restaurantes.add(new Restaurante("LEKA", 1500));
        restaurantes.add(new Restaurante("Pepe", 1900));
        restaurantes.add(new Restaurante("Pepe", 100));


        for (Restaurante restaurante : restaurantes) {
            System.out.println(restaurante.toString());
        }
    }
}
