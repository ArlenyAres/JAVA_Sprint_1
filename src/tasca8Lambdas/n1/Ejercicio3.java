package tasca8Lambdas.n1;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {

        List<String> meses = Arrays.asList("Enero", "Febrero", "Marzo", "April", "Mayo", "Junio", "Julio",
                "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre");


        meses.forEach( mes -> System.out.println(mes));


    }
}
