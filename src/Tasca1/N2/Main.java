package Tasca1.N2;

public class Main {
    public static void main(String[] args) {

        Smartphone Smartphone = new Smartphone("NOKIA", "360" );
        Smartphone iphone = new Smartphone("Aple", "Pro" );

        iphone.fotografiar();
        Smartphone.alarma();
        Smartphone.llamar("789654321");
        iphone.alarma();

    }
}
