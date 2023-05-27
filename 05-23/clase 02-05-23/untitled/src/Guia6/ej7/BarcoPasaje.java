package Guia6.ej7;

public class BarcoPasaje implements Auxilio{
    private int cantidadCamas;

    public BarcoPasaje() {
    }

    public BarcoPasaje(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    public int getCantidadCamas() {
        return cantidadCamas;
    }

    @Override
    public String toString() {
        return "BarcoPasaje{" +
                "cantidadCamas=" + cantidadCamas +
                '}';
    }

    @Override
    public void mensajeSocorro() {
        System.out.println ("Mensaje de socorro activado");
    }

    @Override
    public void alarma() {
        System.out.println ("Alarma activada");
    }
}
