package Serializacion;

import java.io.*;
import java.util.ArrayList;


/**
 * Clase para leer y escribir archivos con objetos
 */
public class ControladoraObjetos {

    /**
     * escribir archivo con objetos
     */
    public static void grabarArchivo(ArrayList<Profesor> arrayList) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("profesores.dat");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            for (Profesor p : arrayList
            ) {
                objectOutputStream.writeObject(p);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
        finally {
            try {

                if ((fileOutputStream != null) && (objectOutputStream != null)) {
                    fileOutputStream.close();
                    objectOutputStream.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    /**
     * leer archivo con objetos
     */
    public static void leer() {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("profesores.dat");
            objectInputStream = new ObjectInputStream(fileInputStream);
            while (true) {
                Profesor p = (Profesor) objectInputStream.readObject();
                System.out.println(p.toString());
            }
        } catch (EOFException e) {
            System.out.println("fin archivo");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
