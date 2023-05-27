package guia6.ejercicio4;

import java.util.UUID;

public class Libro extends ArticuloBiblioteca implements Prestable{
    private boolean prestado;
    public Libro(UUID codigo, String titulo, String añoPublicacion) {
        super(codigo, titulo, añoPublicacion);
        this.prestado = false;
    }
    public boolean isPrestado() {
        return prestado;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nprestado = " + prestado;
    }

    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }
}
