package tasca4Testing.n1.ejercici1;

import java.util.ArrayList;
import java.util.List;

public class Meses {

    private List<String> listaMeses;


    public Meses() {
        this.listaMeses = new ArrayList<>();
        this.listaMeses.add("Enero");
        this.listaMeses.add("Febrero");
        this.listaMeses.add("Marzo");
        this.listaMeses.add("Abril");
        this.listaMeses.add("Mayo");
        this.listaMeses.add("Junio");
        this.listaMeses.add("Julio");
        this.listaMeses.add("Agosto");
        this.listaMeses.add("Septiembre");
        this.listaMeses.add("Octubre");
        this.listaMeses.add("Noviembre");
        this.listaMeses.add("Diciembre");

    }

    public List<String> obtenerMeses() {
        return listaMeses;
    }
}
