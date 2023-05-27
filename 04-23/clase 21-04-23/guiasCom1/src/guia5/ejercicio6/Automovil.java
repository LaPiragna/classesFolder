package ejercicio6;

import guia5.ejercicio6.Vehiculo;

public class Automovil extends Vehiculo {
    public Automovil() {
    }
    public Automovil(String patente, String marca, String modelo, String periodo, String estado, float km, float precioAlquilerDiario) {
        super ( patente, marca, modelo, periodo, estado, km, precioAlquilerDiario);
    }
}
