package guia5.ejercicio5_2;

import java.util.ArrayList;
import java.util.Calendar;

public class Factura {
    Calendar calendar;
    Cliente cliente;
    private ArrayList<Renglon> renglons;
    private int numeroFactura;
    public Factura(Cliente cliente) {
        this.cliente = cliente;
        this.renglons = new ArrayList<Renglon>();
        this.numeroFactura = -1;
        this.calendar = Calendar.getInstance();
    }
    public Calendar getCalendar() {
        return calendar;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public int getNumeroFactura() {
        return numeroFactura;
    }
    public boolean agregarRenglon(Renglon renglon) {
        return this.renglons.add(renglon);
    }
    public void asignarNumero(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }
    @Override
    public String toString() {
        /*
        * numero factura
        * fecha
        * nombre y domicilio cliente
        * cuit cliente
        * todos los renglones de la factura
        *   En cada renglon:
        *                    - cantidad
        *                    - item
        *                    - precio unitario
        *                    - precio total
        * total sin descuento
        * total con descuento
        * */
        String s = "nro factura: " + this.numeroFactura + "\n" +
                "fecha: " + this.calendar.getTime() + "\n" +
                this.cliente.getNombre() + "\n" + //cuit + domicilio
                this.renglons.toString() + "\n" +
                this.totalFactura();
        return s;
    }
    public float totalFactura() {
        float retorno = 0;
        for (Renglon r : this.renglons) {
            retorno += r.getPrecioTotalRenglon();
        }
        if (this.cliente instanceof ClienteMayorista) {
            retorno = retorno - (retorno * ((ClienteMayorista) this.cliente).getDescuento()/100);
        }
        return retorno;
    }
}
