package guia6.ejercicio5;

public interface ColeccionInterfaz<E> {
    boolean estaVacia();
    E extraer();
    E primero();
    boolean añadir(E e);
}
