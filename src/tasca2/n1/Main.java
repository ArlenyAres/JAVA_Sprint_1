package tasca2.n1;

import java.util.ArrayList;
import tasca2.n1.Producto;
import tasca2.n1.Venta;
import tasca2.n1.VentaVaciaException;

public class Main {


    public static void main(String[] args) {


        ArrayList<Producto> productos = new ArrayList<>();
        Venta venta = new Venta();

        Producto producto1 = new Producto("aloe Vera", 14);

        productos.add(producto1);
        venta.agregarProducto(producto1);

        try{
            venta.calcularTotal();
        }catch ( VentaVaciaException e){
            System.out.println( e.getMessage());
        }

    }
}
