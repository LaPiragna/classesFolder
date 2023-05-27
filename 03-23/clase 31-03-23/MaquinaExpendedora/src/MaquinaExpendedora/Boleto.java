package MaquinaExpendedora;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Boleto {
    private int precioEmitido;
    private static LocalDateTime fechaEmision;
    private static DateTimeFormatter formateador;
    private String fechaConvertida;

    public Boleto(int precioEmitido, LocalDateTime fechaEmision) {
        this.precioEmitido = precioEmitido;
        this.fechaEmision = fechaEmision;
        this.formateador = DateTimeFormatter.ofPattern ( "yyyy MM dd" );
        this.fechaConvertida = fechaEmision.format ( formateador );
    }
}
