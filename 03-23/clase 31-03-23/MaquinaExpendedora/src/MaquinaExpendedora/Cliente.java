package MaquinaExpendedora;

public class Cliente {
    private String nombre;
    private String dni;
    private String tipoCliente;

    public Cliente(String nombre, String dni, String tipoCliente) {
        this.nombre = nombre;
        this.dni = dni;
        this.tipoCliente = tipoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }
}
