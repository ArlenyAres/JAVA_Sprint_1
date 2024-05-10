package tasca2.n1;

public class VentaVaciaException extends Exception {
 public VentaVaciaException() {
     super("Tiene contener productos, la cesta esta vacia");;
 }
}
