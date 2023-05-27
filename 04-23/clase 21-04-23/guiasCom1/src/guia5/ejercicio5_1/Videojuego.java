package guia5.ejercicio5_1;

public class Videojuego implements ProductoAcciones{
    /*Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
     */
    private String titulo;
    private float horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compañia;
    public Videojuego() {
        this.titulo = "";
        this.horasEstimadas = 10;
        this.entregado = false;
        this.genero = "";
        this.compañia = "";
    }
    public Videojuego(String titulo, float horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = "";
        this.compañia = "";
    }
    public Videojuego(String titulo, float horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = genero;
        this.compañia = compañia;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public float getHorasEstimadas() {
        return horasEstimadas;
    }
    public void setHorasEstimadas(float horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getCompañia() {
        return compañia;
    }
    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }
    @Override
    public void entregar() {
        this.entregado = true;
    }
    @Override
    public void devolver() {
        this.entregado = false;
    }
    @Override
    public boolean isEntregado() {
        return this.entregado;
    }
    @Override
    public int compareTo(Object o) {
        int retorno = 0;
        if (o instanceof Videojuego) {
            if (this.horasEstimadas < ((Videojuego) o).horasEstimadas)
                retorno = -1;
            else if (this.horasEstimadas > ((Videojuego) o).horasEstimadas)
                retorno = 1;
        }
        return retorno;
    }
    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compañia='" + compañia + '\'' +
                '}';
    }
}
