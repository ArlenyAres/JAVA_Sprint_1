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



    public void calcularTotal() throws VentaVaciaException { // Este metodo calcula el precio total de todos los productos en la venta
            if (productos.isEmpty()) { //Verifica si esta vacia la lsita
                throw new VentaVaciaException("Para hacer una venta primero tiene que agregar productos");  //creo un nuevo objeto excepcion para coger el error y da un mensaje que si la lista esta vacia no hay venta
            } else {
                for (Producto producto : productos) { // se recurre la lista para sumar los precios
                    totalPrecio += producto.getPrecio();
                    // totalPrecio= totalPrecio + producto.getPrecio();
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
