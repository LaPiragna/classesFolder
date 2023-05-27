package ClasesGenericas;

import java.util.ArrayList;

public class Almacenamiento<E> {
    private ArrayList<E> arrayList;
    private int tope;

    public Almacenamiento(int tope) {
        this.tope = tope;
        this.arrayList = new ArrayList<E>();
    }

    public int getTope() {
        return tope;
    }

    public boolean agregarElemento(E e) {
        boolean ret = false;
        if (this.arrayList.size() >= this.tope) {
        } else {
            ret = this.arrayList.add(e);
        }
        return ret;
    }

    public boolean eliminarElemento(E e) {
        boolean ret = false;
        if (this.tope > 0) {
            ret = this.arrayList.remove(e);
        }
        return ret;
    }

    public boolean buscarElemento(E e) {
        return this.arrayList.contains(e);
    }

    @Override
    public String toString() {
        return "Almacenamiento{" +
                "arrayList=" + arrayList +
                ", tope=" + tope +
                '}';
    }
}
