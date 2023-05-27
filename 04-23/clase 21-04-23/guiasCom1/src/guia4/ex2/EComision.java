package guia4.ex2;

public class EComision extends Empleado{
    private int cCaptados;
    private float precioXCliente;

    public EComision() {
    }

    public EComision(String dni, String nombre, String apellido, int añoIngreso, int cCaptados, float precioXCliente) {
        super(dni, nombre, apellido, añoIngreso);
        this.cCaptados = cCaptados;
        this.precioXCliente = precioXCliente;
    }

    public int getcCaptados() {
        return cCaptados;
    }

    public void setcCaptados(int cCaptados) {
        this.cCaptados = cCaptados;
    }

    public float getPrecioXCliente() {
        return precioXCliente;
    }

    public void setPrecioXCliente(float precioXCliente) {
        this.precioXCliente = precioXCliente;
    }

    @Override
    public String toString() {
        return "EComision{" + super.toString() +
                "cCaptados=" + cCaptados +
                ", precioXCliente=" + precioXCliente +
                '}';
    }
}
