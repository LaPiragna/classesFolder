package guia5.ejercicio7;

public class SocioAusente extends Socio{
    private float valorReinsercion;
    private float cuotaMantenimiento;
    public SocioAusente(String dni, float valorReinsercion, float cuotaMantenimiento) {
        super(dni);
        this.valorReinsercion = valorReinsercion;
        this.cuotaMantenimiento = cuotaMantenimiento;
    }
    public SocioAusente(String nombre, String apellido, String dni, float valorReinsercion, float cuotaMantenimiento) {
        super(nombre, apellido, dni);
        this.valorReinsercion = valorReinsercion;
        this.cuotaMantenimiento = cuotaMantenimiento;
    }
    public float getValorReinsercion() {
        return valorReinsercion;
    }
    public float getCuotaMantenimiento() {
        return cuotaMantenimiento;
    }
    @Override
    public String toString() {
        return "SocioAusente{" +
                "valorReinsercion=" + valorReinsercion +
                ", cuotaMantenimiento=" + cuotaMantenimiento +
                '}';
    }
}
