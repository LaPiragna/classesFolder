package guia6.ejercicio6;

import guia6.ejercicio5.Pila;

public class Ejercicio6Main {
    public Ejercicio6Main() {
    }
    public void main() {
        Pila pila = new Pila<Integer>();
        PruebaPila pila1 = new PruebaPila();
        pila1.rellenar(pila);
        pila1.imprimirYVaciar(pila);
    }
}
