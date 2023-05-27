public enum Equipo { //Clase especial.
    //Basicamente son clases pre-definidas.
    //Se definen los modelos estándar de las futuras instancias
    ELMEJOR("VELEZ", 1), BOKE("Boca", 2),
    ELPEOR("River", 4);
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    private String nombreClub;
    private int puesto;

    private Equipo(String nombreClub, int puesto) {
        this.nombreClub = nombreClub;
        this.puesto = puesto;
    }
    public String getNombreClub() {
        return nombreClub;
    }
    public int getPuesto() {
        return puesto;
    }
}
