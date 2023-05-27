package guia6.ejercicio5;

import java.util.ArrayList;

public class Pila<E> implements ColeccionInterfaz {
    int contador;
    ArrayList <Integer> pila;
    public Pila() {
        this.pila = new ArrayList<Integer>();
        this.contador = 0;
    }
    public int getContador() {
        return contador;
    }
    @Override
    public boolean estaVacia() {
        boolean retorno = false;
        if (this.contador == 0) {
            retorno = true;
        }
        return retorno;
    }
    @Override
    public boolean añadir(Object o) {
        if (o == null)
            return false;
        if (!(o instanceof Integer)) {
            return false;
        } else {
            this.pila.add((Integer) o);
            contador++;
        }
        return false;
    }
    @Override
    public Integer extraer() {
        int retorno;
        retorno = this.pila.remove(this.contador - 1);
        this.contador--;
        return retorno;
    }
    @Override
    public Integer primero() {
        return this.pila.get(contador);
    }
    @Override
    public String toString() {
        return "Pila{" +
                "contador=" + contador +
                ", pila=" + pila +
                '}';
    }
}
