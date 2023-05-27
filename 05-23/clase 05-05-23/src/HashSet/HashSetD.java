package HashSet;

import Interfaces.Coleccion;

import java.util.HashSet;

public class HashSetD implements Coleccion {
    private HashSet hashSet;

    public HashSetD() {
        hashSet = new HashSet<Integer>();
    }

    @Override
    public boolean agregar(int i) {
        boolean retorno = false;
        retorno = this.hashSet.add(2);
        return retorno;
    }

    @Override
    public boolean eliminar(int i) {
        boolean retorno = false;
        this.hashSet.remove(i);
        return retorno;
    }

    @Override
    public boolean buscar(int i) {
        boolean retorno = false;
        retorno = this.hashSet.contains(i);
        return retorno;
    }

    @Override
    public void listar() {
        System.out.println(this.hashSet);
    }

    @Override
    public int contar(int i) {
        return this.hashSet.size();
    }
}
