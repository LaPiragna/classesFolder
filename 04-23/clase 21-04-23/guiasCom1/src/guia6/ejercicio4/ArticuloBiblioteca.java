package guia6.ejercicio4;

import java.util.UUID;

public abstract class ArticuloBiblioteca {
    /* código, el título, y el año de publicación */
    private UUID codigo;
    private String titulo;
    private String añoPublicacion;
    public UUID getCodigo() {
        return codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAñoPublicacion() {
        return añoPublicacion;
    }
    public ArticuloBiblioteca(UUID codigo, String titulo, String añoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }

    @Override
    public String toString() {
        return  "codigo = " + codigo +
                ", \ntitulo = '" + titulo + '\'' +
                ", \nañoPublicacion = '" + añoPublicacion + '\'';
    }
}
