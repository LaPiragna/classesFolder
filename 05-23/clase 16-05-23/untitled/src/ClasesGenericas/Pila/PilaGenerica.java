package ClasesGenericas.Pila;
import java.util.LinkedList;
public class PilaGenerica<E> {
    LinkedList<E> list;
    public PilaGenerica() {
        this.list = new LinkedList<E>();
    }
    public void apilar(E e) {
        boolean aux = list.add(e);
    }
    public E desapilar() throws EmptyPila{
        E ret = this.list.getLast();
        this.list.removeLast();
        if (this.list.size() == 0) {
            throw new EmptyPila();
        }
        return ret;
    }
    public boolean isEmpty() {
        boolean ret = false;
        if (this.list.size() == 0)
            ret = true;
        return ret;
    }
    public E top() throws EmptyPila{
        if (this.list.size() == 0)
            throw new EmptyPila();
        else return this.list.getLast();
    }
}
