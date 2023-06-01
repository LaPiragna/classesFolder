package Serializacion;

import javax.tools.FileObject;
import javax.tools.SimpleJavaFileObject;
import javax.xml.crypto.Data;
import java.io.*;

/**
 * Clase para crear y leer archivos
 */
public class ControaldoraDatosPrimitivos {

    /**
     * funcion que escribe en un archivo
     */
    public static void grabarEnArchivo() {
        File file = new File("file.bin");
        FileOutputStream fileOutputStream = null;
        DataOutputStream dataOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            // works with bytes
            fileOutputStream = new FileOutputStream(file);
            // with primivite data
            dataOutputStream = new DataOutputStream(fileOutputStream);
            /*
            // with objects
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
             */
            for (int i = 0; i < 3; i++) {
                dataOutputStream.writeUTF("gonzalo");
                dataOutputStream.writeBoolean(true);
                dataOutputStream.writeInt(i);
            }
        } catch (FileNotFoundException e) {
            System.out.printf("file does not exist");
        } catch (IOException e) {
            System.out.println("Problem ocurred with the file");
        }
        finally {
            if ( true) {

            }
        }
    }

    /**
     * funcion que lee un archivo
     */
    public static void leerArchivo() {
        File file = new File("file.bin");
        FileInputStream fileInputStream = null;
        DataInputStream dataInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            dataInputStream = new DataInputStream(fileInputStream);
            while (true) {
                String aString = dataInputStream.readUTF();
                boolean aBoolean = dataInputStream.readBoolean();
                int anInt = dataInputStream.readInt();
                System.out.println(aString + " " + aBoolean + " " + anInt + '\n');
            }
        } catch (EOFException e) {
            System.out.println("end of flie");
        } catch (FileNotFoundException e) {
            System.out.println("filenotfound");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
