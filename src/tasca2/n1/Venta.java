package tasca2.n1;

import java.util.ArrayList;

public class Venta {
    private ArrayList<Producto> productos;
    private double precio;

    public Venta(ArrayList<Producto> productos, double precio) {
        this.productos = productos;
        this.precio = precio;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void calcularTotal() {
        try {
            if (productos.isEmpty()) {

            }
        }
    }


}
