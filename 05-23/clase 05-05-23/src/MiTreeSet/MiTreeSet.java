package MiTreeSet;

import Interfaces.Coleccion;

import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class MiTreeSet implements Coleccion {
    private TreeSet<Integer> treeSet;

    public MiTreeSet() {
        this.treeSet = new TreeSet<Integer>();
    }

    @Override
    public boolean agregar(int i) {
        boolean retorno = false;
        retorno = this.treeSet.add(i);
        return retorno;
    }

    @Override
    public boolean eliminar(int i) {
        boolean retorno = false;
        if (this.treeSet.contains(i)) {
            this.treeSet.remove(i);
            retorno = true;
        }
        return retorno;
    }

    @Override
    public boolean buscar(int i) {
        boolean retorno = false;
        if (this.treeSet.contains(i)) {
            retorno = true;
        }
        return retorno;
    }

    @Override
    public void listar() {
        System.out.println(this.treeSet.toString());
    }

    @Override
    public int contar(int i) {
        return treeSet.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MiTreeSet miTreeSet = (MiTreeSet) o;
        return Objects.equals(treeSet, miTreeSet.treeSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(treeSet);
    }
}
