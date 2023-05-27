package clasesGenericas;

public class Comparador <E extends Comparable, P extends Comparable>{
    private E uno;
    private P dos;
    public Comparador(E uno, P dos) {
        this.uno = uno;
        this.dos = dos;
    }
    public E getUno() {
        return uno;
    }
    public P getDos() {
        return dos;
    }
    public int comparar() {
        return this.uno.compareTo(this.dos);
    }
}
