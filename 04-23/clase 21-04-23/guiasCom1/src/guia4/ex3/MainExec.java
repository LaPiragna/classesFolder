package guia4.ex3;

public class MainExec {
    public MainExec() {
    }

    abstract class A {

        int i;

        A(int i)
        {
            this.i = i;
        }

        abstract boolean metodo();
    }

    class B extends A {

        B(int i) {
            super(i);
        }

        boolean metodo() {
            System.out.println(i);
            return false;
        }
    }


    public void main() {
        A[] v = new A[10];
        for (int i = 0; i < 10; i++) {
            v[i] = new B(i);
            v[i].metodo();
        }
    }
}
