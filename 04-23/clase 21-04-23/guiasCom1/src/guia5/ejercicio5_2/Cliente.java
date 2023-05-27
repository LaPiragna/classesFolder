package guia5.ejercicio5_2;

public abstract class Cliente {
    private String nombre;
    //private String domicilio;
    //private String CUIT;
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() throws NullPointerException{
        return nombre;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (! (obj instanceof Cliente))
            return false;
        else if (this.nombre == ((Cliente) obj).nombre) {
            return true;
        }
        return false;
    }
}
