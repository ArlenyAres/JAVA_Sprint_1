package tasta6Genericos.n1.ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethods {

        private List<Object> lista0bjetos;

        public GenericMethods(Object... objetos) {
            this.lista0bjetos = new ArrayList<>(Arrays.asList(objetos));
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
                dato += objeto + "\n" ;
            }
            return  dato;
        }
    }


