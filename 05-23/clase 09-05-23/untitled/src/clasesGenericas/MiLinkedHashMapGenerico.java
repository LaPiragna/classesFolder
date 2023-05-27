package clasesGenericas;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MiLinkedHashMapGenerico<K, E> {
    private LinkedHashMap<K, E> linkedHashMap;
    public MiLinkedHashMapGenerico() {
        this.linkedHashMap = new LinkedHashMap<K, E>();
    }
    public E agregarElemento(K key, E value) {
        return linkedHashMap.put(key, value);
    }
    public E eliminarElemento(K key) {
        return linkedHashMap.remove(key);
    }
    public boolean eliminarElemento(K key, E value) {
        return linkedHashMap.remove(key, value);
    }
    public boolean existeElemento(K key, E value) {
        return this.linkedHashMap.containsValue(value);
    }
    public boolean existeClave(K key) {
        return this.linkedHashMap.containsKey(key);
    }
    public boolean estaVacio() {
        return this.linkedHashMap.isEmpty();
    }
    public void vaciar() {this.linkedHashMap.clear();}
    public void muestraElementos() {
        for (Map.Entry<K, E> entrada : this.linkedHashMap.entrySet()) {
            System.out.println(entrada.getKey());
            System.out.println(entrada.getValue());
        }
    }
    public void muestraElementosIterator() {
        Iterator<Map.Entry<K, E>> iterator = this.linkedHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, E> entrada = iterator.next();
            System.out.println(entrada.getKey());
            System.out.println(entrada.getValue());
        }
    }
}
