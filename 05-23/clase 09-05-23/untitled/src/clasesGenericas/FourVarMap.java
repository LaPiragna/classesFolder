package clasesGenericas;
public class FourVarMap<K, E, S, U> {
    private K variable;
    private E variable2;
    private S variable3;
    private U variable4;
    public FourVarMap(K variable, E variable2, S variable3, U variable4) {
        this.variable = variable;
        this.variable2 = variable2;
        this.variable3 = variable3;
        this.variable4 = variable4;
    }
    public K getVariable() {
        return variable;
    }
    public E getVariable2() {
        return variable2;
    }
    public S getVariable3() {
        return variable3;
    }
    public U getVariable4() {
        return variable4;
    }
    @Override
    public String toString() {
        return "FourVarMap{" +
                "variable=" + variable +
                ", variable2=" + variable2 +
                ", variable3=" + variable3 +
                ", variable4=" + variable4 +
                '}';
    }
}
