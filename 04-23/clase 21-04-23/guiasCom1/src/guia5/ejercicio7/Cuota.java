package guia5.ejercicio7;

import java.util.Calendar;
import java.util.UUID;

public class Cuota {
    public static final float montoCuota = 10000;
    private UUID id;
    private float monto;
    private Calendar fecha;
    private boolean pagada;
    private boolean interes; //5% x mes de atraso
    public Cuota(UUID id, int mes) {
        this.id = id;
        this.fecha = Calendar.getInstance();
        this.fecha.set(Calendar.MONTH, mes);
        this.pagada = false;
        this.interes = false;
        this.monto = montoCuota;
    }
    public UUID getId() {
        return id;
    }
    public float getMonto() {
        return monto;
    }
    public Calendar getFecha() {
        return fecha;
    }
    public boolean isPagada() {
        return pagada;
    }
    public boolean getInteres() {
        return interes;
    }
    @Override
    public String toString() {
        return  "monto=" + calcularPrecio() +
                ", \nid=" + id +
                ", \nfecha=" + fecha.getTime() +
                ", \npagada=" + pagada +
                ", \ninteres=" + interes;
    }
    public void pagar() {
        this.pagada = true;
    }
    public float calcularPrecio() {
        float precio = montoCuota;
        if (!pagada) {
            Calendar now = Calendar.getInstance();
            int months = now.get(Calendar.MONTH) - fecha.get(Calendar.MONTH);
            precio *= Math.pow(1.05, months);
        }
        return precio;
    }
}
