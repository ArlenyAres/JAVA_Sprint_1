package tasca8Lambdas.n1;


@FunctionalInterface
interface PiCalculator {
    double getPiValue();
}

public class Ejercicio5 {
    public static void main(String[] args) {

        PiCalculator piCalc = () -> 3.1415;

        System.out.println(piCalc.getPiValue());
    }
}
