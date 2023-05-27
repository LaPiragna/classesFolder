package ClasesGenericas.Tests;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private String apellido;
    private String dni;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Persona(String dni) {
        this.dni = dni;
        this.apellido = "";
        this.nombre = "";
    }

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (!(o instanceof Persona))
            return  false;
        if (((Persona) o).getDni() == this.getDni())
            /*como se trata de dnis técnicamente el equals bastaría utilizarlo
            * con tan solo el numero de los dni.
            * Un posible problema se podría dar en el caso en que un dni esté repetido
            * who knows why
            * */
            if (((Persona) o).getApellido() == this.apellido)
                if (((Persona) o).getNombre() == this.getNombre())
                    return true;
                    /*así que por las dudas queda así xd*/
        return false;
    }

    public int hashCode() {
        int ret = this.nombre.hashCode();
        if (this.apellido != null)
            ret = 31 *  ret + this.apellido.hashCode();
        if (this.dni != null)
            ret = 31 * ret + this.dni.hashCode();
        return ret;
    }

    @Override
    public int compareTo(Persona persona) {
        int ret = 0;
        ret = this.nombre.compareTo(persona.nombre);
        ret = this.apellido.compareTo(persona.apellido);
        ret = this.dni.compareTo(persona.dni);
        return ret;
    }
}
