import netscape.javascript.JSException;
import netscape.javascript.JSObject;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Equipo miEquipo = Equipo.BOKE;
        Enums.WeekDay lunes = Enums.WeekDay.LUNES;
        System.out.println(lunes.getNombre());
    }
}