package tasca2Exceptions.n1;

import java.util.ArrayList;
import tasca2Exceptions.n1.modelos.Producto;
import tasca2Exceptions.n1.modelos.Venta;

public class Main {


    public static void main(String[] args) {

        Venta venta = new Venta(new ArrayList<>(),0d);

        try{
            venta.calcularTotal();
        }catch ( VentaVaciaException e){
            System.err.println( e.getMessage());
        }


        for (int i = 1; i < 5; i++) {
            venta.getProductos().add(new Producto("Producto"+i,i));
        }


        try{
            venta.calcularTotal();
            System.out.println(venta.getTotalPrecio());
        }catch ( VentaVaciaException e){
            System.err.println( e.getMessage());
        }


        int [] numeros = { 1,5};
        System.out.println(numeros[-1]);


    }


}
