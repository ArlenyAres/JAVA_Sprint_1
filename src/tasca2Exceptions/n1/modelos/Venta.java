package tasca2Exceptions.n1.modelos;

import tasca2Exceptions.n1.VentaVaciaException;

import java.util.ArrayList;

public class Venta {
    private ArrayList<Producto> productos;
    private double totalPrecio;

    public Venta(){

    }
    public Venta(ArrayList<Producto> productos, double totalPrecio){
        this.productos = productos;
        this.totalPrecio = totalPrecio;
    }



    public void calcularTotal() throws VentaVaciaException {
            if (productos.isEmpty()) {
                throw new VentaVaciaException("Para hacer una venta primero tiene que agregar productos");
            } else {
                for (Producto producto : productos) {
                    totalPrecio += producto.getPrecio();

                }
            }
    }


    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    public double getTotalPrecio() {
        return totalPrecio;
    }
    public void setTotalPrecio(double totalPrecio) {
        this.totalPrecio = totalPrecio;
    }



}
