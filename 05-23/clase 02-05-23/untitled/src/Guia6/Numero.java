package Guia6;

import Guia6.ej3.Relaciones;

public class Numero implements Relaciones {
    private Integer entero;

    public Numero() {
    }

    public Numero(Integer entero) {
        this.entero = entero;
    }

    @Override
    public String toString() {
        return "Numero{" +
                "entero=" + entero +
                '}';
    }

    @Override
    public boolean esMayor(Object b) {
        boolean retorno = false;
        if ( b != null) {
            if ( b instanceof Numero ) {
                if ( ((Numero) b).entero > this.entero ) {
                    retorno = true;
                }
            }
        }
        return retorno;
    }

    @Override
    public boolean esMenor(Object b) {
        boolean retorno = false;
        if ( b != null) {
            if ( b instanceof Numero ) {
                if ( ((Numero) b).entero < this.entero ) {
                    retorno = true;
                }
            }
        }
        return retorno;
    }

    @Override
    public boolean esIgual(Object b) {
        boolean retorno = false;
        if ( b != null) {
            if ( b instanceof Numero ) {
                if ( ((Numero) b).entero == this.entero ) {
                    retorno = true;
                }
            }
        }
        return retorno;
    }
}
