package clasesGenericas;

import java.util.ArrayList;

public class Inventario<E> {
    private ArrayList lista;
    public Inventario() {
        lista = new ArrayList();
    }
    public boolean agregar(E elemento) {
        boolean retorno = false;
        retorno = this.lista.add(elemento);
        return retorno;
    }
    public void mostrarElementos() {
        for (Object elemento : this.lista) {
            System.out.println(elemento);
        }
    }
}
