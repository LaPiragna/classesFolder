package Guia6.ej7;

public class Portavion implements InformacionTripulacion, Auxilio {
    private int cantidadAviones;
    private int cantidadTripulantes;

    public Portavion() {
    }

    public Portavion(int cantidadAviones, int cantidadTripulantes) {
        this.cantidadAviones = cantidadAviones;
        this.cantidadTripulantes = cantidadTripulantes;
    }

    @Override
    public void mensajeSocorro() {
        System.out.println ("Mensaje socorro activado");
    }

    @Override
    public void alarma() {
        System.out.println ("Alarma activada");
    }

    @Override
    public void cantidadTripulantes() {
        System.out.println ( this.cantidadTripulantes );
    }
}
