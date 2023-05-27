package guia6.ejercicio3;

public class Numero implements Relaciones {
    private int numero;
    public Numero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
    @Override
    public boolean esMayor(Object b) {
        if (b == null)
            return false;
        if (!(b instanceof Integer))
            return false;
        else
            if (this.numero > (Integer) b)
                return true;
        return false;
    }
    @Override
    public boolean esMenor(Object b) {
        //System.out.println(this.numero);
        //System.out.println(b);
        if (b == null)
            return false;
        if (!(b instanceof Integer)) {
            return false;
        } else {
            if (this.numero < (Integer) b)
                return true;
        }
        return false;
    }
    @Override
    public boolean esIgual(Object b) {
        if (b == null)
            return false;
        if (!(b instanceof Integer))
            return false;
        else
        if (this.numero == (Integer) b)
            return true;
        return false;
    }
}
