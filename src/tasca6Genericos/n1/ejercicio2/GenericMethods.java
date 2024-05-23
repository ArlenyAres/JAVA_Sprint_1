package tasca6Genericos.n1.ejercicio2;

public class GenericMethods<T> {

        public <T, U, K> void printer(T t, U u, K k) {
            System.out.println(t);
            System.out.println(u);
            System.out.println(k);

        }

}

