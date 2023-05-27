public class Producto {
    private int categoria; //se puede hacer un Arraylist. Para utilizar el size como límite.
    /*
    * 1 alimentos
    * 2 perfumeria
    * 3 ropa
    * 4 calzado
    * */
    private String nombre;
    private float precio;
    private float impuesto;
    public Producto() {
    }
    public Producto(int categoria, String nombre, float precio) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
        this.impuesto = 0;
    }
    public int getCategoria() {
        return categoria;
    }
    public String getNombre() {
        return nombre;
    }
    public float getPrecio() {
        return precio;
    }
    public float getImpuesto() {
        return impuesto;
    }
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public void aplicarImpuesto() {
        switch (this.categoria) {
            case 1:
                this.impuesto = 0.1F;
                break;
            case 2:
                this.impuesto = 0.15F;
                break;
            case 3:
                this.impuesto = 0.2F;
                break;
            case 4:
                this.impuesto = 0.3F;
                break;
            default:
                this.impuesto = 0;
                break;
        }
    }
    public float precioFinal() {
        return this.precio + (this.precio * this.impuesto);
    }
}
