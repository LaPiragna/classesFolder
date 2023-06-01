import Documentacion.Documentacion;
import Serializacion.ControladoraObjetos;
import Serializacion.Profesor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Serializacion.ControaldoraDatosPrimitivos.grabarEnArchivo();
        Serializacion.ControaldoraDatosPrimitivos.leerArchivo();
         */

        /*
        ArrayList<Profesor> arrayList = new ArrayList<>();

        arrayList.add(new Profesor("gonzalo", 1));
        arrayList.add(new Profesor("gonzalo", 2));
        arrayList.add(new Profesor("gonzalo", 3));

        ControladoraObjetos.grabarArchivo(arrayList);
        ControladoraObjetos.leer();
         */

        Documentacion documentacion = new Documentacion();
        documentacion.returnString();
    }
}