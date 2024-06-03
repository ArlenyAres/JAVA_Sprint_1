package tasca7Anotaciones.n1;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Trabajador trabajador1 = new Trabajador("Maia","Enriquez", 2);
        TrabajadorPresencial trabajadorPresencial = new TrabajadorPresencial("Carlos","Enriquez", 3);
        TrabajadorOnline trabajadorOnline = new TrabajadorOnline("kiki","Rodriguez", 4);

        TrabajadorPresencial.gasolina = 1.60;

        System.out.println(trabajadorPresencial.calcularSueldo(50));
        System.out.println(trabajador1.calcularSueldo(30));
        System.out.println(trabajadorOnline.calcularSueldo(90));


        //Ejercicico 2

        trabajadorOnline.exampleDeprecate();
        trabajadorPresencial.exampleDeprecate2();
    }
}
