package LinkedHashSet;

import Interfaces.Coleccion;

import java.util.LinkedHashSet;

public class MiLinkedHashSet implements Coleccion {
    private LinkedHashSet linkedHashSet;

    public MiLinkedHashSet() {
        linkedHashSet = new LinkedHashSet<Integer>();
    }

    @Override
    public boolean agregar(int i) {
        boolean retorno = false;
        retorno = linkedHashSet.add(i);
        return retorno;
    }

    @Override
    public boolean eliminar(int i) {
        boolean retorno = false;
        retorno = this.linkedHashSet.remove(i);
        return retorno;
    }

    @Override
    public boolean buscar(int i) {
        boolean retorno = false;
        retorno = this.linkedHashSet.contains(i);
        return retorno;
    }

    @Override
    public void listar() {
        System.out.println(this.linkedHashSet.toString());
    }

    @Override
    public int contar(int i) {
        return this.linkedHashSet.size();
    }
}
