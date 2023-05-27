package guia4.ex2;

public class EAsalariado extends Empleado{
    private float salarioBase;
    public EAsalariado() {
    }

    public EAsalariado(String dni, String nombre, String apellido, int añoIngreso, float salarioBase) {
        super(dni, nombre, apellido, añoIngreso);
        this.salarioBase = salarioBase;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "EAsalariado{" + super.toString() +
                "salarioBase=" + salarioBase +
                '}';
    }
}
