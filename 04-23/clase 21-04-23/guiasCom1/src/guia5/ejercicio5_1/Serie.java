package guia5.ejercicio5_1;

public class Serie implements ProductoAcciones{
    /*Sus atributos son titulo, numero de temporadas, entregado, genero y creador.*/
    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;
    public Serie() {
        this.titulo = "";
        this.numeroTemporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = "";
    }
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = creador;
    }
    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.entregado = false;
        this.genero = genero;
        this.creador = creador;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }
    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getCreador() {
        return creador;
    }
    public void setCreador(String creador) {
        this.creador = creador;
    }
    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
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
        if (o instanceof Serie) {
            if (this.numeroTemporadas < ((Serie) o).numeroTemporadas)
                return -1;
            else if (this.numeroTemporadas > ((Serie) o).numeroTemporadas)
                return 1;
            return 0;
        }
        return -11111;
    }
}
