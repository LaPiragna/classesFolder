package guia5.ejercicio5_2;

public class ClienteMayorista extends Cliente{
    private int descuento;
    public ClienteMayorista(String nombre) {
        super(nombre);
        this.descuento = 10;
    }
    public ClienteMayorista(String nombre, int descuento) {
        super(nombre);
        this.descuento = descuento;
    }
    public int getDescuento() {
        return descuento;
    }
}
