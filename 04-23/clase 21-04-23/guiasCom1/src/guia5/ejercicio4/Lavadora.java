package guia5.ejercicio4;

public class Lavadora extends Electrodomestico{
    private static final float cargaDefecto = 5F;
    private float carga;
    public Lavadora() {
        this.carga = cargaDefecto;
    }
    public Lavadora(float precioBase, float peso) {
        super(precioBase, peso);
        this.carga = cargaDefecto;
    }
    public Lavadora(float precioBase, String color, char consumoE, float peso, float carga) {
        super(precioBase, color, consumoE, peso);
        this.carga = carga;
    }
    public float getCarga() {
        return carga;
    }
    @Override
    public float calcularPrecio() {
        float retorno = 0;
        retorno = super.calcularPrecio();
        if (this.carga > 30)
            retorno += 30;
        return retorno;
    }
    @Override
    public String toString() {
        return "Lavadora{" + super.toString() +
                "carga=" + carga +
                '}';
    }
}
