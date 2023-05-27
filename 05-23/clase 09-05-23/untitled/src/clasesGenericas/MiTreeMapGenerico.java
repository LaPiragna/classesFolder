package clasesGenericas;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MiTreeMapGenerico<K, V> {
    private TreeMap<K, V> treeMap;
    public MiTreeMapGenerico() {
        this.treeMap = new TreeMap<K, V>();
    }
    public V agregarElemento(K key, V value) {
        return treeMap.put(key, value);
    }
    public V eliminarElemento(K key) {
        return treeMap.remove(key);
    }
    public boolean eliminarElemento(K key, V value) {
        return treeMap.remove(key, value);
    }
    public boolean existeElemento(K key, V value) {
        return this.treeMap.containsValue(value);
    }
    public boolean existeClave(K key) {
        return this.treeMap.containsKey(key);
    }
    public boolean estaVacio() {
        return this.treeMap.isEmpty();
    }
    public void mostrarElementos() {
        for (Map.Entry<K, V> entry : this.treeMap.entrySet()) {
            System.out.println("clave: " + entry.getKey());
            System.out.println("valor: " + entry.getValue());
        }
    }

    public void mostrarElementosI() {
        Iterator<Map.Entry<K, V>> iterator = this.treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();
            System.out.println("clave: " + entry.getKey());
            System.out.println("valor: " + entry.getValue());
        }
    }
}
