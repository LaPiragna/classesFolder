package guia5.ejercicio7;

import java.time.chrono.MinguoChronology;
import java.util.UUID;

public abstract class Socio {
    private String nombre;
    private String apellido;
    private String dni;
    private Cuota[] cuotas;
    public Socio(String dni) {
        this.nombre = "";
        this.apellido = "";
        this.dni = dni;
        this.cuotas = new Cuota[12];
    }
    public Socio(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuotas = new Cuota[12];
        for (int i = 0; i < 12; i++) {
            this.cuotas[i] = new Cuota(UUID.randomUUID(), i);
        }
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getDni() {
        return dni;
    }
    @Override
    public String toString() {
        return "Socio{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Socio)) {
            return false;
        } else {
            if (((Socio) obj).dni == this.dni)
                return true;
        }
        return false;
    }
    public void verCuotas() {
        int i = 0;
        for (Cuota cuota : this.cuotas) {
            System.out.println(i + ":");
            System.out.println(this.cuotas[i].toString());
            System.out.println();
            i++;
        }
    }
    public void pagarCuota(int indice) {
        this.cuotas[indice].pagar();
    }
}
