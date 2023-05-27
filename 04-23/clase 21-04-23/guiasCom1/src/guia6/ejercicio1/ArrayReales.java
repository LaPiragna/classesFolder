package guia6.ejercicio1;
import java.util.ArrayList;

public class ArrayReales implements Estadisticas {
    private ArrayList<Integer> arrayList;
    public ArrayReales() {
        this.arrayList = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++) {
            this.arrayList.add(i);
        }
    }
    @Override
    public double minimo() {
        int minimo = 0;
        if (!(this.arrayList.isEmpty())) {
            minimo = this.arrayList.get(0);
            for (Integer i : this.arrayList) {
                if (minimo > i)
                    minimo = i;
            }
            return minimo;
        } else {
            //throw emptyException
        }
        return minimo;
    }
    @Override
    public double maximo() {
        int maximo = 0;
        if (!(this.arrayList.isEmpty())) {
            maximo = this.arrayList.get(0);
            for (Integer i : this.arrayList) {
                if (maximo < i)
                    maximo = i;
            }
            return maximo;
        } else {
            //throw emptyException
        }
        return maximo;
    }
    @Override
    public double sumatorio() {
        int sumatorio = 0;
        for (Integer i : this.arrayList) {
            sumatorio += i;
        }
        return sumatorio;
    }
}
