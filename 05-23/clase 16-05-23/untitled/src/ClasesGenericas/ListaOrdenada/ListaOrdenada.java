package ClasesGenericas.ListaOrdenada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListaOrdenada<E extends Comparable<E>> {
    /*Crear una clase genérica llamada "ListaOrdenada" que pueda almacenar elementos en orden ascendente o descendente.
     Debe tener métodos para agregar y eliminar elementos,
     y para obtener el elemento en una posición específica.
      Haz pruebas de tu clase con diferentes tipos de elementos y diferentes órdenes de clasificació
     */
    private ArrayList<E> arrayList;
    public ListaOrdenada() {
        this.arrayList = new ArrayList<E>();
    }

    public boolean agregarElemento(E e) {
        boolean ret = false;
        ret = this.arrayList.add(e);
        Collections.sort(this.arrayList);
        return ret;
    }
    public boolean removeElement(E e) {
        return this.arrayList.remove(e);
    }
    public E getElementOnIndex(int index) {
        return this.arrayList.get(index);
    }
    @Override
    public String toString() {
        return "ListaOrdenada{" +
                "arrayList=" + arrayList +
                '}';
    }
}
