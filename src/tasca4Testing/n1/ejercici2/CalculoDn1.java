package tasca4Testing.n1.ejercici2;

public class CalculoDn1 {

    public static char calcularLetra(int numDni) {
        char [] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int posicion = numDni % 23;

        return letras[posicion];
    }
}
