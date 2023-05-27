package guia4.ex2;

public abstract class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private int añoIngreso;

    public Empleado() {
    }

    public Empleado(String dni, String nombre, String apellido, int añoIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.añoIngreso = añoIngreso;
    }

    public String getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Empleado))
            return false;
        if (this.dni == ((Empleado) obj).dni)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", añoIngreso=" + añoIngreso +
                '}';
    }
}
