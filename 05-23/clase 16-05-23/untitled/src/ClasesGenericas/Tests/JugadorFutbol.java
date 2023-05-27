package ClasesGenericas.Tests;

public class JugadorFutbol extends Persona{
    private String dorsal;

    public JugadorFutbol(String dni) {
        super(dni);
        this.dorsal = "";
    }

    public JugadorFutbol(String dni, String dorsal) {
        super(dni);
        this.dorsal = dorsal;
    }

    public JugadorFutbol(String nombre, String apellido, String dni, String dorsal) {
        super(nombre, apellido, dni);
        this.dorsal = dorsal;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "JugadorFutbol{" + super.toString() +
                "dorsal='" + dorsal + '\'' +
                '}';
    }
}
