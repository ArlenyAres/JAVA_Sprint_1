package tasca2Exceptions.n1;

import java.util.ArrayList;
import tasca2Exceptions.n1.modelos.Producto;
import tasca2Exceptions.n1.modelos.Venta;

public class Main {


    public static void main(String[] args) {

        Venta venta = new Venta(new ArrayList<>(),0d);

        try{ //cuando no tiene elementos la lista
            venta.calcularTotal();
        }catch ( VentaVaciaException e){
            System.err.println( e.getMessage());
        }

        // agregando 4 elemento a la lista
        for (int i = 1; i < 5; i++) {
            venta.getProductos().add(new Producto("Producto"+i,i));
        }

        // Cuando tiene elementos en la lista
        try{
            venta.calcularTotal();
            System.out.println(venta.getTotalPrecio());
        }catch ( VentaVaciaException e){
            System.err.println( e.getMessage());
        }

        //aqui lanza la exexpcion de la clase hija ArrayIndexOutOfBoundsException
        int [] numeros = { 1,5};
        System.out.println(numeros[-1]);

        //aqui lanza la exexpcion de la clase madre

      //  try {
       //    System.out.println(venta.getProductos().get(-1));
       // } catch (ArrayIndexOutOfBoundsException e) {
       //     System.err.println( e.getMessage());
      //  }


    }


}
