import Arraylist.ArrayL;
import HashSet.HashSetD;
import LinkedHashSet.MiLinkedHashSet;
import MiTreeSet.MiTreeSet;
import Telefono.Telefono;

import java.util.Collection;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        ArrayL arrayL = new ArrayL();
        HashSetD hashSetD = new HashSetD();
        MiLinkedHashSet miLinkedHashSet = new MiLinkedHashSet();
        MiTreeSet miTreeSet = new MiTreeSet();
        //Falta lo que serían las funciones propias de cada clase.

        short codigoDeArea = 223;
        short prefijo = 54;
        short numero = (short) 4468141;

        Telefono telefono = new Telefono(codigoDeArea, prefijo, numero);
        Telefono telefono1 = new Telefono((short) 223, (short) 54, (short) 4468141);

        System.out.println(telefono.compareTo(telefono1));

    }
}