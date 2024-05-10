package tasca2.n1;

import java.util.ArrayList;

public class Venta {
    private ArrayList<Producto> productos;
    private double totalPrecio;

    public Venta(ArrayList<Producto> productos, double totalPrecio) {
        this.productos = productos;
        this.totalPrecio = totalPrecio;
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



    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
        //totalPrecio += producto.getPrecio();
    }

    public void calcularTotal() throws VentaVaciaException { // Este metodo calcula el precio total de todos los productos en la venta
        try {
            if (productos.isEmpty()) { //Verifica si esta vacia la lsita
                throw new VentaVaciaException();  //creo un nuevo objeto excepcion para coger el error y da un mensaje que si la lista esta vacia no hay venta
            } else {
                for (Producto producto : productos) { // se recurre la lista para sumar los precios
                    double total = producto.getPrecio();
                }
            }
        }catch (VentaVaciaException e ) {
            throw new VentaVaciaException();
        }
    }


}
