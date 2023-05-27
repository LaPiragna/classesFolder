package guia5.ejercicio5_2;

import java.util.UUID;

public class Renglon {
    private static final int cantidadDefecto = 1;
    private Articulo articulo;
    private UUID uuidArticulo;
    private int cantidadArticulo;
    private float precioUnidad;
    private float precioTotalRenglon;
    public Renglon(Articulo articulo) {
        this.articulo = articulo;
        this.uuidArticulo = UUID.randomUUID();
        this.cantidadArticulo = cantidadDefecto;
        this.precioUnidad = articulo.getPrecio();
        this.precioTotalRenglon = this.precioUnidad * this.cantidadArticulo;
    }
    public Renglon(Articulo articulo, int cantidadArticulo) {
        this.articulo = articulo;
        this.uuidArticulo = UUID.randomUUID();
        this.cantidadArticulo = cantidadArticulo;
        this.precioUnidad = articulo.getPrecio();
        this.precioTotalRenglon = this.precioUnidad * this.cantidadArticulo;
    }
    public Articulo getArticulo() {
        return articulo;
    }
    public UUID getUuidArticulo() {
        return uuidArticulo;
    }
    public int getCantidadArticulo() {
        return cantidadArticulo;
    }
    public float getPrecioUnidad() {
        return precioUnidad;
    }
    public float getPrecioTotalRenglon() {
        return precioTotalRenglon;
    }
    @Override
    public String toString() {
        /*En cada renglon:
         *                    - cantidad
         *                    - item
         *                    - precio unitario
         *                    - precio total*/
        return "Renglon{" +
                ", cantidadArticulo=" + cantidadArticulo +
                ", \nitem=" + articulo +
                ", \nprecioUnidad=" + precioUnidad +
                ", \nprecioTotalRenglon=" + precioTotalRenglon +
                '}';
    }
}
