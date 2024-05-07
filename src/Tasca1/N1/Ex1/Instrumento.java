package Tasca1.N1.Ex1;

public class Instrumento {
    private String nombre;
    private int precio;
    public static int contadorInstancias = 0;

    public Instrumento(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
        contadorInstancias++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String tocar() {
        return "";
    }

    static {
        System.out.println("La clase instrumento ha sido cargada: " + contadorInstancias);
    }


}
