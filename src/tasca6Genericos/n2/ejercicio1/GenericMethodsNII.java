package tasca6Genericos.n2.ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethodsNII<T> {

    public <T, U> void printer(T t, U u, int k) {
        System.out.println(t);
        System.out.println(u);
        System.out.println(k);

    }

}


