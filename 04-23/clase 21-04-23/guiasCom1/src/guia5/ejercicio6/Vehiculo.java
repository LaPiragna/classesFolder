package guia5.ejercicio6;

import java.util.ArrayList;
import java.util.Date;

public abstract class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    private String periodo; //año de fabricacion
    private String estado; //disponible, alquilado, en reparación, en verificación técnicna.
    private float km;
    private float precioAlquilerDiario;
    private ArrayList<Date> historialFechas;
    private ArrayList<ejercicio6.Cliente> historialClientes;
    public Vehiculo() {
    }
    public Vehiculo(String patente, String marca, String modelo, String periodo, String estado, float km, float precioAlquilerDiario) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.periodo = periodo;
        this.estado = estado;
        this.km = km;
        this.precioAlquilerDiario = precioAlquilerDiario;
        this.historialFechas = new ArrayList<Date> ();
        this.historialClientes = new ArrayList<ejercicio6.Cliente> ();
    }
    public String getPatente() {
        return patente;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getPeriodo() {
        return periodo;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public float getKm() {
        return km;
    }
    public void setKm(float km) {
        this.km = km;
    }
    public float getPrecioAlquilerDiario() {
        return precioAlquilerDiario;
    }
    public void setPrecioAlquilerDiario(float precioAlquilerDiario) {
        this.precioAlquilerDiario = precioAlquilerDiario;
    }
    public ArrayList<Date> getHistorialFechas() {
        return historialFechas;
    }
    public void setHistorialFechas(ArrayList<Date> historial) {
        this.historialFechas = historial;
    }
    public ArrayList<ejercicio6.Cliente> getHistorialClientes() {
        return historialClientes;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    @Override
    public String toString() {
        return   marca + "\n" +
                "modelo=" + modelo + ",\n" +
                "periodo=" + periodo + ",\n" +
                "km=" + km + ",\n" +
                "estado=" + estado + ",\n" +
                "precioAlquilerDiario=" + precioAlquilerDiario + ",\n" +
                "historial de fechas=" + historialFechas + ",\n" +
                "historial de clientes= " + historialClientes + ",\n" +
                "patente=" + patente + ".\n" ;
    }
    public String toStringShort() {
        return   marca + " " + modelo + '.';
    }
}
