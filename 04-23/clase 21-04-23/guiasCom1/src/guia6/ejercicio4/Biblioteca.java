package guia6.ejercicio4;

import java.util.Vector;

public class Biblioteca {
    private Vector<ArticuloBiblioteca> articulosBiblioteca;
    public Biblioteca() {
        this.articulosBiblioteca = new Vector<ArticuloBiblioteca>(1, 1);
    }
    public void agregarArticulo(ArticuloBiblioteca articuloBiblioteca) {
        this.articulosBiblioteca.add(articuloBiblioteca);
    }
    public void verArticulos() {
        int i = 0;
        for (ArticuloBiblioteca a : this.articulosBiblioteca) {
            if (a instanceof Libro) {
                System.out.println( i + "\n" + a.toString());
            } else if (a instanceof Revista) {
                System.out.println( i + "\n" + a.toString());
            }
            i++;
        }
    }
    public void prestarArticulo(int indice) {
        if (indice < this.articulosBiblioteca.size()) {
            if (this.articulosBiblioteca.get(indice) instanceof  Libro) {
                Libro libro = (Libro) this.articulosBiblioteca.get(indice);
                libro.prestar();
            }
        }
    }
}
