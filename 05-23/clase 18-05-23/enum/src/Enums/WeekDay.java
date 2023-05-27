package Enums;

public enum WeekDay {

    LUNES("lunes"), MARTES("martes"), MIERCOLES("miercoles"), JUEVES("jueves"),
    VIERNES("viernes"), SABADO("sabado"), DOMINGO("domingo");

    private String nombre;

    WeekDay(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
