package guia6.ejercicio2;

import java.util.LinkedList;
import java.util.Random;

public class Matematicas implements Extremos{
    LinkedList<Integer> list;
    public Matematicas(int size) {
        Random random = new Random();
        this.list = new LinkedList<Integer>();
        for (int i = 0; i < size; i++) {
            this.list.add(random.nextInt(100) + 1);
        }
    }
    @Override
    public double inicio() {
        if (!this.list.isEmpty()) {
            return this.list.getFirst();
        }
        return -1;
    }
    @Override
    public double fin() {
        if (!this.list.isEmpty()) {
            return this.list.getLast();
        }
        return -1;
    }
}
