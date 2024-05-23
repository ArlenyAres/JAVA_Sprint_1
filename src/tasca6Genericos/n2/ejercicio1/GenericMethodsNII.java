package tasca6Genericos.n2.ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethodsNII<T> {

    private List<Object> lista0bjetos;

    public GenericMethodsNII(T generic, Object... objetos) {
        this.lista0bjetos = new ArrayList<>();
        lista0bjetos.add(generic);
        lista0bjetos.addAll(Arrays.asList(objetos));
    }

    public GenericMethodsNII(T generic, List<?> objetos) {
        this.lista0bjetos = new ArrayList<>();
        lista0bjetos.add(generic);
        lista0bjetos.addAll(Arrays.asList(objetos));
    }

    public void agregarObjeto(Object objeto) {
        lista0bjetos.add(objeto);
    }

    public Object obtenerObjeto(int indice) {
        return lista0bjetos.get(indice);
    }

    @Override
    public String toString() {
        String dato = "";
        for (Object objeto : lista0bjetos) {
            dato += objeto + "\n";
        }
        return dato;
    }
}


