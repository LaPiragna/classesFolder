package guia5.ejercicio3;
import java.util.Random;
import java.util.UUID;

public class Password {
    private int longitud;
    private String contraseña;
    public Password() {
        this.longitud = 8;
        this.contraseña = "";
    }
    public Password(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarPassword(longitud); //random pass de la longitud indicada...
    }
    public int getLongitud() {
        return longitud;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public boolean esFuerte() {
        int contadorNumeros = 0, contadorMay = 0, contadorMin = 0;
        Character aux;
        boolean retorno = false;

        for (int i = 0; i < this.contraseña.length();i++ ) {
            aux = this.contraseña.charAt(i);
            if (aux >= 48 && aux <= 57)
                contadorNumeros++;
            else if (aux >= 65 && aux <= 90)
                contadorMay++;
            else if (aux >= 97 && aux <= 122)
                contadorMin++;
        }

        if (contadorMay > 2 && contadorNumeros > 5 && contadorMin > 1)
            retorno = true;

        return retorno;
    }
    public String generarPassword(int longitud) {
        String retorno;
        StringBuilder stringBuilder = new StringBuilder();
        UUID id = UUID.randomUUID();
        Random random = new Random();
        char[] aux = new char[longitud];
        aux = id.toString().substring(0,longitud).toCharArray();

        for (char c : aux) {
            double r = random.nextDouble();
            if (r > 0.5) {
                c = Character.toUpperCase(c);
            }
            stringBuilder.append(c);
        }

        retorno = stringBuilder.toString();

        return retorno;
    }

    @Override
    public String toString() {
        return "Password{" +
                "longitud=" + longitud +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
}
