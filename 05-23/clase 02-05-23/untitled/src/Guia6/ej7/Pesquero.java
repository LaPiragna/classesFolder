package Guia6.ej7;

public class Pesquero implements InformacionTripulacion, Auxilio{
    private String nombre;
    private int cantidadPescadores;
    private int potencia;

    public Pesquero() {
    }

    public Pesquero(String nombre, int cantidadPescadores, int potencia) {
        this.nombre = nombre;
        this.cantidadPescadores = cantidadPescadores;
        this.potencia = potencia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public void mensajeSocorro() {
        System.out.println ("Mensaje de socorro activado");
    }

    @Override
    public void alarma() {
        System.out.println ("Alarma activada");
    }

    @Override
    public void cantidadTripulantes() {
        System.out.println ( this.cantidadPescadores );
    }
}
