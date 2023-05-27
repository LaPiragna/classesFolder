package guia6.ejercicio4;

import java.util.UUID;

public class ExeBiblioteca {
    public ExeBiblioteca() {
    }

    public void main() {
        Biblioteca biblioteca = new Biblioteca();
        ArticuloBiblioteca articuloBiblioteca = new Libro(UUID.randomUUID(), "Curso básico de psicoanálisis", "1992");
        biblioteca.agregarArticulo(articuloBiblioteca);
        biblioteca.prestarArticulo(0);
        biblioteca.verArticulos();
    }
}
