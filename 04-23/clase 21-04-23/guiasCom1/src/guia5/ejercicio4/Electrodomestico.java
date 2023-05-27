package guia5.ejercicio4;

public class Electrodomestico {
    /*
    * Por defecto, el color sera blanco, el consumo energético sera F,
    * el precioBase es de 100 € y el peso de 5 kg. Usa constantes para ello.
     * */
    private static final String colorDefecto = "blanco";
    private static final char consumoDefecto = 'F';
    private static final float precioDefecto = 100F;
    private static final float pesoDefecto = 5; // en kg
    /*
    * precio base, color, consumo energético (letras entre A y F) y peso
    * */
    private float precioBase;
    private String color;
    private char consumoE;
    private float peso;
    public Electrodomestico() {
        this.precioBase = precioDefecto;
        this.color = colorDefecto;
        this.peso = pesoDefecto;
        this.consumoE = consumoDefecto;
    }
    public Electrodomestico(float precioBase, float peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = colorDefecto;
        this.consumoE = consumoDefecto;
    }
    public String comprobarColor(String color) {
        /*
        * colores disponibles:
        * - blanco
        * - negro
        * - azul
        * - rojo
        * - gris
        *
        * Si el color ingresado no coincide, retorna "blanco"
        * */
        if (color.toLowerCase() == "gris")
            color = "gris";
        else if (color.toLowerCase() == "negro")
            color = "negro";
        else if (color.toLowerCase() == "rojo")
            color = "rojo";
        else if (color.toLowerCase() == "azul")
            color = "azul";
        else
            color = "blanco";
        return color;
    }
    public char comprobarConsumo(char consumo) {
        /*
         * consumos:
         * - A
         * - B
         * - C
         * - D
         * - E
         * - F
         * Si el consumo ingresado no coincide, retorna 'F'
         * */
        if (consumo == 'A' || consumo == 'a')
            consumo = 'A';
        else if (consumo == 'B' || consumo == 'b')
            consumo = 'B';
        else if (consumo == 'C' || consumo == 'c')
            consumo = 'C';
        else if (consumo == 'D' || consumo == 'd')
            consumo = 'D';
        else if (consumo == 'E' || consumo == 'e')
            consumo = 'E';
        else
            consumo = 'F';
        return consumo;
    }
    public Electrodomestico(float precioBase, String color, char consumoE, float peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoE = comprobarConsumo(consumoE);
        this.peso = peso;
    }
    public float calcularPrecioXConsumo() {
        float precioConsumo = 0;
        if (this.consumoE == 'A')
            precioConsumo = 100F;
        else if (this.consumoE == 'B')
            precioConsumo = 80F;
        else if (this.consumoE == 'C')
            precioConsumo = 60F;
        else if (this.consumoE == 'D')
            precioConsumo = 50F;
        else if (this.consumoE == 'E')
            precioConsumo = 30F;
        else if (this.consumoE == 'F')
            precioConsumo = 10F;
        return precioConsumo;
    }
    public float calcularPrecioXPeso() {
        float precioPeso = 0;
        if (peso >= 0 && peso <= 19)
            precioPeso = 10;
        else if (peso >= 20 && peso <= 49)
            precioPeso = 50;
        else if (peso >= 50 && peso <= 79)
            precioPeso = 80;
        else if (peso >= 80)
            precioPeso = 100;
        return precioPeso;
    }
    public float calcularPrecio() {
        float retorno = 0, precioConsumo = 0, precioPeso = 0;
        precioConsumo = calcularPrecioXConsumo();
        precioPeso = calcularPrecioXPeso();
        retorno = this.precioBase + precioConsumo + precioPeso;
        return retorno;
    }
    public float getPrecioBase() {
        return precioBase;
    }
    public String getColor() {
        return color;
    }
    public char getConsumoE() {
        return consumoE;
    }
    public float getPeso() {
        return peso;
    }
    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoE=" + consumoE +
                ", peso=" + peso +
                '}';
    }
}
