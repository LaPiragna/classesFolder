package guia6.ejercicio3;

public class ExeEx3 {
    public ExeEx3() {
    }

    public void main() {
        Numero numero = new Numero(0);
        Numero numero1 = new Numero(1);
        Numero numero2 = new Numero(2);
        Numero numero3 = new Numero(3);
        Numero numero4 = new Numero(4);
        System.out.println(numero1.esMenor(numero4.getNumero()));
        //System.out.println(numero1.esMenor("a"));
        System.out.println(numero4.esIgual(4));
        System.out.println(numero4.esIgual(numero4.getNumero()));
        System.out.println(numero4.esIgual(4));
        System.out.println(numero4.esMayor(numero1.getNumero()));
    }
}
