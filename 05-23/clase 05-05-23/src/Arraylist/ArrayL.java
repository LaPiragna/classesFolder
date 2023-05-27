package Arraylist;

import Interfaces.Coleccion;

import java.util.ArrayList;

public class ArrayL implements Coleccion {
    private ArrayList<Integer> arrayList;

    public ArrayL() {
        this.arrayList = new ArrayList<Integer>();
    }

    @Override
    public boolean agregar(int i) {
        boolean retorno = false;
        int tamañoInicial = this.arrayList.size();
        this.arrayList.add(i);
        if (this.arrayList.size() > tamañoInicial)
            retorno = true;
        return retorno;
    }

    @Override
    public boolean eliminar(int i) {
        boolean retorno = false;
        while (this.arrayList.contains(i)) {
            this.arrayList.remove((Integer) i);
            retorno = true;
        }
        return retorno;
    }

    @Override
    public boolean buscar(int i) {
        boolean retorno = false;
        retorno = this.arrayList.contains(i);
        return retorno;
    }

    @Override
    public void listar() {
        System.out.println(this.arrayList.toString());
    }

    @Override
    public int contar(int i) {
        int retorno = 0;
        if (i < this.arrayList.size()) {
            retorno = 1 + contar(i+1);
        }
        return retorno;
    }

    public void funcion1() {
    }
}
