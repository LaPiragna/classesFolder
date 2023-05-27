package guia5.ejercicio1;

public class Persona {
    private String nombre;
    private String dni;
    private float altura;
    private float peso;
    private int edad;
    private char sexo;
    private static final int mcBaja = -1;
    private static final int mcPromedio = 0;
    private static final int mcAlta = 1;

    public Persona() {
        this.nombre = "";
        this.dni = "";
        this.edad = 0;
        this.sexo = 'H';
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, char sexo, String dni, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }
    public int calcularIMC() {
        int retorno = 0;
        float masaCorporal = peso / (altura * altura);
        if (masaCorporal < 20) {
            retorno = mcBaja;
        } else if (masaCorporal > 20 && masaCorporal < 25) {
            retorno = mcPromedio;
        } else {
            retorno = mcAlta;
        }
        return retorno;
    }
}
