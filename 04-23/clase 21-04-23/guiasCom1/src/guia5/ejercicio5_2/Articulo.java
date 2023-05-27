package guia5.ejercicio5_2;

public class Articulo {
    String nombre;
    private float precio;
    public Articulo(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
