package ejercicio6;

import guia5.ejercicio6.Vehiculo;

public class Utilitario extends Vehiculo {
    String tipoCarga;
    public Utilitario() {
    }
    public Utilitario(String patente, String marca, String modelo, String periodo, String estado, float km,
                      float precioAlquilerDiario, String tipoCarga) {
        super ( patente, marca, modelo, periodo, estado, km, precioAlquilerDiario);
        this.tipoCarga = tipoCarga;
    }
    public String getTipoCarga() {
        return tipoCarga;
    }

    @Override
    public String toString() {
        return super.toString () + "Utilitario" +
                "tipoCarga='" + tipoCarga;
    }
}
