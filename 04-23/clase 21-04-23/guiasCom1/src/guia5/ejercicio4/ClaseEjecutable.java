package guia5.ejercicio4;
public class ClaseEjecutable {
    private Electrodomestico[] electrodomesticos;
    private int cantidadElectrodomesticos;
    public ClaseEjecutable() {
        this.electrodomesticos = new Electrodomestico[10];
        this.cantidadElectrodomesticos = 0;
    }
    public boolean agregarElectrodomestico(Electrodomestico electrodomestico) {
        boolean retorno = false;
        if (this.cantidadElectrodomesticos < 10) {
            this.electrodomesticos[cantidadElectrodomesticos] = electrodomestico;
            this.cantidadElectrodomesticos++;
            retorno = true;
        }
        return retorno;
    }
    public float precioFinal() {
        float totalElectrodomesticos = 0, totalLavadoras = 0, totalTVs = 0;
        for (Electrodomestico e : this.electrodomesticos) {
            if (e instanceof Television) {
                //System.out.println("Precio base: " + e.getPrecioBase());
                totalTVs += e.calcularPrecio();
                //System.out.println("Precio agregado: " + ((e.calcularPrecio()) - e.getPrecioBase()));
                //System.out.println("Precio final -> " + e.calcularPrecio());
            }
            else if (e instanceof Lavadora) {
                //System.out.println("Precio base: " + e.getPrecioBase());
                totalLavadoras += e.calcularPrecio();
                //System.out.println("Precio agregado: " + ((e.calcularPrecio()) - e.getPrecioBase()));
                //System.out.println("Precio final -> " + e.calcularPrecio());
            }
            else if (e instanceof Electrodomestico) {
                //System.out.println("Precio base: " + e.getPrecioBase());
                totalElectrodomesticos += e.calcularPrecio();
                //System.out.println("Precio agregado: " + ((e.calcularPrecio()) - e.getPrecioBase()));
                //System.out.println("Precio final -> " + e.calcularPrecio());
            }
        }
        System.out.println("Precio total en electrodomésticos -> " + totalElectrodomesticos);
        System.out.println("Precio total en televisores -> " + totalTVs);
        System.out.println("Precio total en lavadoras -> " + totalLavadoras);
        return totalElectrodomesticos + totalTVs + totalLavadoras;
    }
}