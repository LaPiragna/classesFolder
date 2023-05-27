package guia4.ex3;

public class TestFlujo {
    public void main() {
        DiscoFlexible df = new DiscoFlexible();
        Flujo f = df;
        f.escribe(545);
    }

    abstract class Flujo {
        abstract public void escribe(char c);

        public void escribe(String s) {
            for (int i = 0; i < s.length(); i++) {
                System.out.println("Escribe de Flujo ....");
                escribe(s.charAt(i));
            }
        }

        public void escribe(int i) {
            escribe("" + i);
        }
    }

    class Disco extends Flujo {
        public void escribe(char c) {
            System.out.println("Escribe de disco " + c);
        }
    }

    class DiscoFlexible extends Disco {
        public void escribe(String s) {
            System.out.println("Escribe de Disco Flexible...");
            super.escribe(s);
        }
    }

    public abstract class A {

        int i;

        A(int i) {
            this.i = i;
        }

        public abstract void metodo1();
    }

    public class B extends A {

        public B(int i) {
            super(i);
        }

        public void metodo1() {
            System.out.println(i);
        }
    }

    public class Cuestion {
        public Cuestion() {
        }

        public void main() {
        /*
        DiscoFlexible dc = new DiscoFlexible();
        Flujo f = dc;
        f.escribe(123456);
         */
        }
    }
}