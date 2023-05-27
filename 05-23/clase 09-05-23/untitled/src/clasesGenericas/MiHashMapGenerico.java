package clasesGenericas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

public class MiHashMapGenerico<K, E> {
    private HashMap<K, E> hashMap;
    public MiHashMapGenerico() {
        hashMap = new HashMap<K, E>();
    }
    public E agregarElemento(K key, E value) {
        return hashMap.put(key, value);
    }
    public E eliminarElemento(K key) {
        return hashMap.remove(key);
    }
    public boolean eliminarElemento(K key, E value) {
        return hashMap.remove(key, value);
    }
    public boolean existeElemento(K key, E value) {
        return this.hashMap.containsValue(value);
    }
    public boolean existeClave(K key) {
        return this.hashMap.containsKey(key);
    }
    public boolean estaVacio() {
        return this.hashMap.isEmpty();
    }
    public void vaciar() {this.hashMap.clear();}
    public void muestraElementos() {
        for (Map.Entry<K, E> entrada : this.hashMap.entrySet()) {
            System.out.println(entrada.getKey());
            System.out.println(entrada.getValue());
        }
    }
    public void muestraElementosIterator() {
        Iterator<Map.Entry<K, E>> iterator = this.hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, E> entrada = iterator.next();
            System.out.println(entrada.getKey());
            System.out.println(entrada.getValue());
        }
    }
}