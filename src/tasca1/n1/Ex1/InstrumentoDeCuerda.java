package tasca1.n1.Ex1;

public class InstrumentoDeCuerda extends Instrumento {

    public InstrumentoDeCuerda(String nombre, int precio) {
        super(nombre, precio);
    }

    @Override
    public String tocar() {
        return "Está sonando un instrumento de Cuerda";
    }
}