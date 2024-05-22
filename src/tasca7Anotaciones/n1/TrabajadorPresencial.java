package tasca7Anotaciones.n1;

public class TrabajadorPresencial extends Trabajador {

    public static double gasolina;

    public TrabajadorPresencial(String nombre, String apellido, double precioHora) {
        super(nombre, apellido, precioHora);

    }


    @Override
    public double calcularSueldo(int horas) {
        return super.calcularSueldo(horas)+ gasolina;
    }

    @Deprecated
    public void exampleDeprecate2() {
        System.out.println("El trabajador es deprecated");
    }


}
