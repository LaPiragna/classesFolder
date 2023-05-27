package guia5.ejercicio4;

public class Television extends Electrodomestico{
    private static final float pulgadasDefecto = 20F;
    private static final boolean sintonizadorTDTDefecto = false;
    private float pulgadas;
    private boolean sintonizacionTDT;
    public Television() {
        this.pulgadas = pulgadasDefecto;
        this.sintonizacionTDT = sintonizadorTDTDefecto;
    }
    public Television(float precioBase, float peso) {
        super(precioBase, peso);
        this.pulgadas = pulgadasDefecto;
        this.sintonizacionTDT = sintonizadorTDTDefecto;
    }
    public Television(float precioBase, String color, char consumoE, float peso, float pulgadas, boolean sintonizacionTDT) {
        super(precioBase, color, consumoE, peso);
        this.pulgadas = pulgadas;
        this.sintonizacionTDT = sintonizacionTDT;
    }
    public float getPulgadas() {
        return pulgadas;
    }
    public boolean isSintonizacionTDT() {
        return sintonizacionTDT;
    }
    @Override
    public float calcularPrecio() {
        float retorno = 0;
        retorno = super.calcularPrecio();
        if (pulgadas > 40)
            retorno += retorno * 0.3;
        if (sintonizacionTDT)
            retorno += 50F;
        return retorno;
    }
    @Override
    public String toString() {
        return "Television{" + super.toString() +
                "pulgadas=" + pulgadas +
                ", sintonizacionTDT=" + sintonizacionTDT +
                '}';
    }
}
