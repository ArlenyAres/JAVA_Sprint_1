package tasca1.n1.Ex1;


public class Main {
    public static void main(String[] args) {

        Instrumento flauta = new InstrumentoDeViento("Travesera", 900);
        Instrumento guitarra = new InstrumentoDeCuerda("Acustica", 1200);
        Instrumento tambor  = new InstrumentoDePercusion("Cajon", 500);

        System.out.println("Número de instancias creadas: " + Instrumento.contadorInstancias);

        System.out.println(flauta.tocar());
        System.out.println(guitarra.tocar());
        System.out.println(tambor.tocar());
    }
}
