package tasca3Collections.n2.ejercici2;


import java.util.Comparator;

public class RestauranteComparator implements Comparator<Restaurante> {

        @Override
        public int compare(Restaurante r1, Restaurante r2) {

            int nombreComparison = r1.getNombre().compareTo(r2.getNombre());
            if (nombreComparison != 0) {
                return nombreComparison;
            }


            return Integer.compare(r2.getPuntuacion(), r1.getPuntuacion());
        }
    }

