package tasta6.n1.ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoGenericMethods<T> {

   private List<T> lista0bjetos;

    public NoGenericMethods(T... objetos) {
        this.lista0bjetos = new ArrayList<>(Arrays.asList(objetos));
    }

    public void agregarObjeto(T objeto) {
       lista0bjetos.add(objeto);
    }

    public T obtenerObjeto(int indice) {
      return lista0bjetos.get(indice);
    }

    @Override
    public String toString() {
        String dato = "";
        for (T objeto : lista0bjetos) {
            dato += objeto.toString() + "\n" ;
        }
        return  dato;
    }
}
