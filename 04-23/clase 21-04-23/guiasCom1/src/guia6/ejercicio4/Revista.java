package guia6.ejercicio4;

import java.util.UUID;

public class Revista extends ArticuloBiblioteca{
    private int numero;
    public Revista(UUID codigo, String titulo, String añoPublicacion, int numero) {
        super(codigo, titulo, añoPublicacion);
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\n numero = " + numero;
    }
}
