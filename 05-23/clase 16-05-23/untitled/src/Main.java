import ClasesGenericas.Almacenamiento;
import ClasesGenericas.Conjunto.Conjunto;
import ClasesGenericas.ListaOrdenada.ListaOrdenada;
import ClasesGenericas.Pila.PilaGenerica;
import ClasesGenericas.Tests.Alumno;
import ClasesGenericas.Tests.JugadorFutbol;
import ClasesGenericas.Tests.Persona;

import java.net.Inet4Address;
import java.util.TreeSet;
import java.util.UUID;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        /*
        exe 1
        Almacenamiento<Integer> almacenamiento = new Almacenamiento<>(3);
        almacenamiento.agregarElemento(2);
        almacenamiento.agregarElemento(3);
        almacenamiento.agregarElemento(4);
        almacenamiento.agregarElemento(5);
        System.out.println(almacenamiento.toString());
         */

        /*
        exe 2
        PilaGenerica<Integer> pilaGenerica = new PilaGenerica<Integer>();
        pilaGenerica.apilar(29);
        pilaGenerica.apilar(8);
        pilaGenerica.apilar(7);
        pilaGenerica.apilar(5);
        pilaGenerica.apilar(21);
        pilaGenerica.apilar(22);
        pilaGenerica.apilar(23);
        pilaGenerica.apilar(20);
        pilaGenerica.apilar(7);
        pilaGenerica.apilar(1);
        pilaGenerica.apilar(2);
        pilaGenerica.apilar(3);
        pilaGenerica.apilar(27);
        try {
            pilaGenerica.desapilar();
            pilaGenerica.desapilar();
            pilaGenerica.desapilar();
            pilaGenerica.desapilar();
            pilaGenerica.desapilar();
            pilaGenerica.desapilar();
            pilaGenerica.desapilar();
            pilaGenerica.desapilar();
            pilaGenerica.desapilar();
            pilaGenerica.desapilar();
            pilaGenerica.desapilar();
            pilaGenerica.desapilar();
            pilaGenerica.desapilar();
            System.out.println(pilaGenerica.top());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Conjunto<Integer, Integer> conjunto = new Conjunto<Integer, Integer>();
        conjunto.agregarElemento(1, 1);
        conjunto.agregarElemento(2, 2);
        System.out.println(conjunto.eliminarElemento(1));
        System.out.println(conjunto.eliminarElemento(2));
        System.out.println(conjunto.existeElemento(2));
        ListaOrdenada<Integer> listaOrdenada = new ListaOrdenada<Integer>();
        ListaOrdenada<String> listaOrdenada1 = new ListaOrdenada<String>();
        listaOrdenada.agregarElemento(1);
        listaOrdenada.agregarElemento(5);
        listaOrdenada.agregarElemento(3);
        listaOrdenada.agregarElemento(10);
        listaOrdenada1.agregarElemento("Vanina Pintos");
        listaOrdenada1.agregarElemento("Ricardo Lopez");
        listaOrdenada1.agregarElemento("Federico Varela");
        listaOrdenada1.agregarElemento("Gonzalo Varela");
        listaOrdenada1.agregarElemento("Gaspar Rodolfo Alagna");

        System.out.println("Lista de enteros:");
        System.out.println(listaOrdenada.toString());

        System.out.println("Lista de nombres:");
        System.out.println(listaOrdenada1.toString());
         */

        /* ||=============== test random de equals, hashcode y compareTo =======||
        Persona persona = new Persona("42963991");
        Persona persona1 = new Persona("43963991");
        Persona persona1_1 = new Persona("43963992");
        Persona persona2 = new Persona("44963991");

        //persona1_1.setNombre("");

        System.out.println(" - - - - - hashCodes - - - - - ");
        System.out.println(persona.hashCode());
        System.out.println(persona1.hashCode());
        System.out.println(persona1_1.hashCode());
        System.out.println(persona2.hashCode());
        System.out.println(" - - - - - - - - - - - - - - - ");

        System.out.println(" - - - - - compare - - - - - ");
        System.out.println("(persona1, persona) -> |" + persona1.compareTo(persona) + '|');
        System.out.println("(persona, persona1) -> |" + persona.compareTo(persona1) + '|');
        System.out.println("(persona1, persona1_1) -> |" + persona1.compareTo(persona1_1) + '|');
        System.out.println(" - - - - - - - - - - - - - - - ");
        //=======================================================================//

        Vector<Persona> vector = new Vector<Persona>();

        Alumno alumno = new Alumno("42963991");
        Alumno alumno1 = new Alumno("42963992");
        JugadorFutbol jugadorFutbol = new JugadorFutbol("42963993");
        Alumno alumno2 = new Alumno("42963994");

        vector.add(alumno1);
        vector.add(alumno);
        vector.add(jugadorFutbol);
        vector.add(alumno2);

        System.out.println(vector);

        
         */

        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(7);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.pollFirst(); //elimina la hoja de menor valor
        System.out.println(treeSet.toString());

    }
}