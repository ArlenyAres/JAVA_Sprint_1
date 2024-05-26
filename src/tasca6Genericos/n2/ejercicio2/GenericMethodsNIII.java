package tasca6Genericos.n2.ejercicio2;

public class GenericMethodsNIII<T> {


        public <U> void printer(U... args) {
           for (U arg : args) {
               System.out.println(arg);
           }

        }

    }



