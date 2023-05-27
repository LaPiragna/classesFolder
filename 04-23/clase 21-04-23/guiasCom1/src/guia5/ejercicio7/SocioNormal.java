package guia5.ejercicio7;

public class SocioNormal  extends Socio{
    public SocioNormal(String dni) {
        super(dni);
    }
    public SocioNormal(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
    }

    @Override
    public String toString() {
        return "SocioNormal{" + super.toString() + '}';
    }
}
