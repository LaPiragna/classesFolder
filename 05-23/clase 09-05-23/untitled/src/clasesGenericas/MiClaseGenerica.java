package clasesGenericas;
import java.util.Iterator;
import java.util.Map;
public class MiClaseGenerica<E extends Map<K, V>, K, V> {
    private E coleccion;
    public MiClaseGenerica(E coleccion) {
        this.coleccion = coleccion;
    }
    public V agregarElemento(K key, V value) {
        return coleccion.put(key, value);
    }
    public V eliminarElemento(K key) {
        return coleccion.remove(key);
    }
    public boolean eliminarElemento(K key, V value) {
        return coleccion.remove(key, value);
    }
    public boolean existeElemento(K key, V value) {
        return this.coleccion.containsValue(value);
    }
    public boolean existeClave(K key) {
        return this.coleccion.containsKey(key);
    }
    public boolean estaVacio() {
        return this.coleccion.isEmpty();
    }
    public void vaciar() {this.coleccion.clear();}
    public void muestraElementos() {
        for (Map.Entry<K, V> entrada : this.coleccion.entrySet()) {
            System.out.println("clave: " + entrada.getKey());
            System.out.println("valor: " + entrada.getValue());
        }
    }
    public void muestraElementosIterator() {
        Iterator<Map.Entry<K, V>> iterator = this.coleccion.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entrada = iterator.next();
            System.out.println(entrada.getKey());
            System.out.println(entrada.getValue());
        }
    }
}
