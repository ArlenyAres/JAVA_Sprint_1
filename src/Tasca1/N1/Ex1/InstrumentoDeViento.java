package Tasca1.N1.Ex1;

public class InstrumentoDeViento extends Instrumento {

    public InstrumentoDeViento(String nombre, int precio) {
        super(nombre, precio);
    }

    @Override
    public String tocar() {
        return "Está sonando un instrumento de Viento";
    }
}

