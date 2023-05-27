package ejercicio6;

import java.util.Objects;

public class Cliente {
    private String nombre;
    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass () != o.getClass () ) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals ( nombre, cliente.nombre );
    }

    @Override
    public int hashCode() {
        return Objects.hash ( nombre );
    }

}
