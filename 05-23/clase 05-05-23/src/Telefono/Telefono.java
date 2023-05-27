package Telefono;

public class Telefono {
    private short codigoDeArea;
    private short prefijo;
    private short numero;

    public Telefono() {
    }

    public Telefono(short codigoDeArea, short prefijo, short numero) {
        this.codigoDeArea = codigoDeArea;
        this.prefijo = prefijo;
        this.numero = numero;
    }

    public short getCodigoDeArea() {
        return codigoDeArea;
    }

    public short getPrefijo() {
        return prefijo;
    }

    public short getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Telefono))
            return false;
        return (this.numero == ((Telefono) obj).numero &&
                this.prefijo == ((Telefono) obj).prefijo &&
                this.codigoDeArea == ((Telefono) obj).codigoDeArea);
    }

    public int hashCode() {
        int result = Short.hashCode(codigoDeArea);
        result = 2 * result + Short.hashCode(prefijo);
        result = 2 * result + Short.hashCode(numero);
        return result;
    }

    public int compareTo(Telefono telefono) {
        int result = Short.compare(codigoDeArea, telefono.codigoDeArea);
        if (result == 0) {
            result = Short.compare(prefijo, telefono.prefijo);
            if (result == 0) {
                result = Short.compare(numero, telefono.numero);
            }
        }
        return result;
    }
}
