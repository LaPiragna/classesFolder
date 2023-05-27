package ClasesGenericas.Conjunto;
import java.util.HashMap;
public class Conjunto<K,E> {
    private HashMap<K, E> hashMap;
    public Conjunto() {
        hashMap = new HashMap<K, E>();
    }
    public K agregarElemento(K key, E e) {
        return (K) this.hashMap.put(key, e);
    }
    public E eliminarElemento(K key) {
        return this.hashMap.remove(key);
    }
    public boolean existeElemento(E e) {
        return this.hashMap.containsValue(e);
    }
}
