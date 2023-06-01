package Serializacion;

import java.io.Serializable;



/**
 * Clase modelo de los profesores
 */
public class Profesor implements Serializable {

    /**
     */
    private String nombre;

    /**
     */
    private int legajo;

    /**
     */
    private transient double sueldo; //transient: no se guarda en archivo, evita la serlializacion

    /**
     */
    public Profesor(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    /**
     */
    @Override
    public String toString() {
        return "Serializacion.Profesor{" +
                "nombre='" + nombre + '\'' +
                ", legajo=" + legajo +
                ", sueldo=" + sueldo +
                '}';
    }
}
