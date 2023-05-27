package guia6.ejercicio6;

import guia6.ejercicio5.ColeccionInterfaz;

public class PruebaPila {
    public PruebaPila() {
    }
    public void rellenar(ColeccionInterfaz coleccionInterfaz) {
        for (int i = 1; i <= 10; i++) {
            coleccionInterfaz.añadir(i);
        }
    }
    public void imprimirYVaciar(ColeccionInterfaz coleccionInterfaz) {
        for (int i = 0; i < 10; i++) {
            System.out.println(coleccionInterfaz.extraer());
        }
    }
}
