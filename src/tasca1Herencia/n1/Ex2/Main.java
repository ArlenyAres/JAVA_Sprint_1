package tasca1Herencia.n1.Ex2;

public class Main {
    public static void main(String[] args) {

        //Creamos el Objesto de la clase Coche
        Coche vehiculo1 = new Coche("Volvo","deportivo", 200);
        // Creo un Objeto con otra marca para demostar que no se cambia por consola
        Coche vehiculo2 = new Coche("BMW","KIKIriKI", 250);

        // Imprimo los vehiculos para demostar que o se cambia la marca
        System.out.println(vehiculo1.getMarca());
        System.out.println(vehiculo1.getModelo());
        System.out.println(vehiculo2.getMarca());
        System.out.println(vehiculo2.getModelo());


        //metodo no estatico
        vehiculo1.acelerar();
        vehiculo2.acelerar();

        // metodo estatico =
        Coche.frenar();


    }
}
