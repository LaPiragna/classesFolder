package guia5.ejercicio5_1;

public interface ProductoAcciones extends Comparable{
    void entregar();
    void devolver();
    boolean isEntregado();
    @Override
    default int compareTo(Object o) {
        return 0;
    }
}
