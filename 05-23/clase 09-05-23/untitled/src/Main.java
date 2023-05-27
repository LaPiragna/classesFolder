import clasesGenericas.MiClaseGenerica;
import clasesGenericas.MiHashMapGenerico;
import clasesGenericas.MiLinkedHashMapGenerico;
import clasesGenericas.MiTreeMapGenerico;

import javax.management.remote.rmi.RMIJRMPServerImpl;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MiTreeMapGenerico miTreeMapGenerico = new MiTreeMapGenerico<String, Integer>();
        MiHashMapGenerico miHashMapGenerico = new MiHashMapGenerico<UUID, Integer>();
        MiLinkedHashMapGenerico miLinkedHashMapGenerico = new MiLinkedHashMapGenerico<UUID, Integer>();
        MiClaseGenerica miClaseGenerica = new MiClaseGenerica(new TreeMap());

        /*
        miHashMapGenerico.agregarElemento(UUID.randomUUID(), 1);
        miHashMapGenerico.agregarElemento(UUID.randomUUID(), 2);
        miHashMapGenerico.agregarElemento(UUID.randomUUID(), 3);
        //miHashMapGenerico.muestraElementos();
        //miHashMapGenerico.muestraElementosIterator();
         */

        /*
        miLinkedHashMapGenerico.agregarElemento(UUID.randomUUID(), 4);
        miLinkedHashMapGenerico.agregarElemento(UUID.randomUUID(), 5);
        miLinkedHashMapGenerico.agregarElemento(UUID.randomUUID(), 6);
        miLinkedHashMapGenerico.agregarElemento(UUID.randomUUID(), 7);
        //miLinkedHashMapGenerico.muestraElementos();
        //miLinkedHashMapGenerico.muestraElementosIterator();
         */

        /*
        Random random = new Random();
        miTreeMapGenerico.agregarElemento(generarDni(), random.nextInt(100));
        miTreeMapGenerico.agregarElemento(generarDni(), random.nextInt(100));
        miTreeMapGenerico.agregarElemento(generarDni(), random.nextInt(100));
        miTreeMapGenerico.agregarElemento(generarDni(), random.nextInt(100));
        miTreeMapGenerico.agregarElemento(generarDni(), random.nextInt(100));
        miTreeMapGenerico.agregarElemento(generarDni(), random.nextInt(100));
        miTreeMapGenerico.mostrarElementosI();

         */


        miClaseGenerica.agregarElemento(generarDni(), 2);
        miClaseGenerica.agregarElemento(generarDni(), 1);
        miClaseGenerica.agregarElemento(generarDni(), 3);
        miClaseGenerica.agregarElemento(generarDni(), 20);
        miClaseGenerica.agregarElemento(generarDni(), 21);
        miClaseGenerica.agregarElemento(generarDni(), 2);
        miClaseGenerica.agregarElemento(generarDni(), 1);
        miClaseGenerica.agregarElemento(generarDni(), 3);
        miClaseGenerica.agregarElemento(generarDni(), 20);
        miClaseGenerica.agregarElemento(generarDni(), 21);
        miClaseGenerica.agregarElemento(generarDni(), 2);
        miClaseGenerica.agregarElemento(generarDni(), 1);
        miClaseGenerica.agregarElemento(generarDni(), 3);
        miClaseGenerica.agregarElemento(generarDni(), 20);
        miClaseGenerica.agregarElemento(generarDni(), 21);
        miClaseGenerica.agregarElemento(generarDni(), 2);
        miClaseGenerica.agregarElemento(generarDni(), 1);
        miClaseGenerica.agregarElemento(generarDni(), 3);
        miClaseGenerica.agregarElemento(generarDni(), 20);
        miClaseGenerica.agregarElemento(generarDni(), 21);
        miClaseGenerica.muestraElementos();
    }

    public static String generarDni() {
        // Crear un objeto Random
        Random rand = new Random();

        // Generar tres números enteros entre 0 y 999
        int n1 = rand.nextInt(100) + 1;
        int n2 = rand.nextInt(1000);
        int n3 = rand.nextInt(1000);

        // Asegurarse de que el primer número no sea cero
        while (n1 == 0) {
            n1 = rand.nextInt(1000);
        }

        // Formatear los números con ceros a la izquierda si es necesario
        String s1 = String.format("%3d", n1);
        s1 = s1.trim();
        String s2 = String.format("%3d", n2);
        s2 = s2.trim();
        String s3 = String.format("%3d", n3);
        s3 = s3.trim();

        // Concatenar los números con puntos
        String dni = s1 + "." + s2 + "." + s3;

        // Devolver el dni generado
        return dni;
    }
}

