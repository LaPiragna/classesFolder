package ClasesGenericas.Tests;

public class Alumno extends Persona{
    private String matricula;

    public Alumno(String dni) {
        super(dni);
        this.matricula = "";
    }

    public Alumno(String dni, String matricula) {
        super(dni);
        this.matricula = matricula;
    }

    public Alumno(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.matricula = "";
    }

    public Alumno(String nombre, String apellido, String dni, String matricula) {
        super(nombre, apellido, dni);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Alumno{" + super.toString() +
                "matricula='" + matricula + '\'' +
                '}';
    }
}
