package tasta6.n1;

import java.util.ArrayList;
import java.util.Arrays;

public class NoGenericMethods<T> {

   private T [] arrayObjetos;

    public NoGenericMethods(T[] arrayObjetos) {
        this.arrayObjetos = arrayObjetos;
    }

    public NoGenericMethods(T objeto1, T objeto2, T objeto3) {
        this.arrayObjetos = new T[3];
        this.arrayObjetos[0] = objeto1;
        this.arrayObjetos[1] = objeto2;
        this.arrayObjetos[2] = objeto3;
    }

    public void agregarObjeto(T objeto) {
        T[] nuevoArray = Arrays.copyOf(arrayObjetos, arrayObjetos.length + 1);
        nuevoArray[arrayObjetos.length] = objeto;
        arrayObjetos = nuevoArray;
    }

    public T obtenerObjeto(int indice) {
        if (indice >= 0 && indice < arrayObjetos.length) {
            return arrayObjetos[indice];
        } else {
            throw new IndexOutOfBoundsException("indice fuera de rango");
        }
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "arrayObjetos=" + Arrays.toString(arrayObjetos) +
                '}';
    }
}
