package tasca3Collections.n2.ejercici2;

import java.util.Objects;

public class Restaurante {
    private String nombre;
    private int puntuacion;

    public Restaurante() {

    }

    public Restaurante(String nombre, int puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return
                "nombre: " + nombre +
                ", puntuacion: " + puntuacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurante that = (Restaurante) o;
        return puntuacion == that.puntuacion && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, puntuacion);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPuntuacion() {
        return puntuacion;
    }
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

}
