package tasca7Anotaciones.n1;

public class TrabajadorOnline extends Trabajador {

    private final double tarifaInternet = 20;


    public TrabajadorOnline(String nombre, String apellido, double precioHora) {
        super(nombre, apellido, precioHora);
    }


    @Override
    public double calcularSueldo(int horas) {
        return super.calcularSueldo(horas) + tarifaInternet;
    }

    //Ejercicio 2
    @Deprecated
    public void exampleDeprecate() {
        System.out.println("El trabajador es deprecated");
    }
}
