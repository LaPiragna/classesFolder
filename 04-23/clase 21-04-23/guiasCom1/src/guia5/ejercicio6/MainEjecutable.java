package guia5.ejercicio6;

import java.util.Scanner;

public class MainEjecutable {
    public static Scanner scanner = new Scanner(System.in);
    public MainEjecutable() {
    }
    public void main() {
        Flota flota = new Flota("Corea del Sur");
        flota.menu();
    }

}
