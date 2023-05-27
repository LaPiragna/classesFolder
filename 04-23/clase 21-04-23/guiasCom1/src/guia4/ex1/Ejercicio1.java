package guia4.ex1;

public class Ejercicio1 {
        private abstract class A {
            public abstract void dinamica();

            public void estatica() {
                System.out.println("Método estático de la clase A");
            }
        }
        private class B extends A {
            public void dinamica() {
                System.out.println("Método dinámico de clase B");
            }
        }
        private class C extends A {
            public void dinamica() {
                System.out.println("Método dinámico de clase C");
            }
        }
    public void main(String arguments) {
        A a;
        B b = new B();
        C c = new C();

        System.out.print("Métodos llamados con objeto b desde");
        System.out.println("referencia de la clase A");
        a = b;
        a.dinamica();
        a.estatica();

        System.out.print("Métodos llamados con objeto c desde");
        System.out.println(" referencia de la clase A");
        a = c;
        a.dinamica();
        a.estatica();
    }
}
