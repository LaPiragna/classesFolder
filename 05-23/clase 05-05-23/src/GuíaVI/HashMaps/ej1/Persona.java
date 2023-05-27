package GuíaVI.HashMaps.ej1;

import java.util.Objects;

public class Persona {
    private String nombre;
    private String edad;
    private String dni;
    private char sexo;
    private float peso;
    private float altura;

    public Persona() {
        this.nombre = "";
        this.edad = "0";
        this.dni = "";
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, String edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = "";
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, String edad, String dni, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override //leer pdf de equals - READY
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return dni == persona.dni;
    }

    @Override //leer pdf de hashcode - PENDING
    public int hashCode() {
        return Objects.hash(nombre, edad, dni, sexo, peso, altura);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
