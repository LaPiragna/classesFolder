package guia5.ejercicio5_1;

import java.util.ArrayList;

public class AplicacionEjecutable {
    public void main() {
        ArrayList<Serie> arrayList = new ArrayList<Serie>(5);
        ArrayList<Videojuego> arrayList1 = new ArrayList<Videojuego>(5);

        Serie serie = new Serie();
        Serie serie1 = new Serie("Señor de los anillos", "J. R. R. Tolkien");
        Serie serie2 = new Serie("Star Wars", 5, "Aventura, ficcion", "George Lucas");
        Serie serie3 = new Serie("Black Mirror", "Charlie Brooker");
        Serie serie4 = new Serie("Blacklist", "Jon Bokenkamp");
        Videojuego videojuego = new Videojuego("Star Wars Battlefront II", 60F);
        Videojuego videojuego1 = new Videojuego("Warframe", 10000);
        Videojuego videojuego2 = new Videojuego("Skyrim", 20000);
        Videojuego videojuego3 = new Videojuego("Bully", 100);
        Videojuego videojuego4 = new Videojuego("Call Of Dutty Modern Warfare II", 100);

        arrayList.add(serie);
        arrayList.add(serie1);
        arrayList.add(serie2);
        arrayList.add(serie3);
        arrayList.add(serie4);

        arrayList1.add(videojuego);
        arrayList1.add(videojuego1);
        arrayList1.add(videojuego2);
        arrayList1.add(videojuego3);
        arrayList1.add(videojuego4);

        arrayList1.get(1).entregar();
        arrayList.get(1).entregar();
        arrayList1.get(3).entregar();
        arrayList1.get(4).entregar();
        arrayList.get(4).entregar();

        System.out.println("cantidad de series prestadas -> " + cantidadSeriesPrestadas(arrayList));
        System.out.println("cantidad de juegos prestados -> " + cantidadJuegosPrestados(arrayList1));
        System.out.println("se han devuelto en su totalidad...");

        System.out.println("serie con mas temporadas -> " + serieConMasTemporadas(arrayList));
        System.out.println("juego con mayor cantidad de horas -> " + juegoConMasHorasEstimadas(arrayList1));
    }
    public int cantidadSeriesPrestadas(ArrayList<Serie> arrayList) {
        int retorno = 0;
        for (Serie serie : arrayList) {
            if (serie.isEntregado()) {
                serie.devolver();
                retorno += 1;
            }
        }
        return retorno;
    }
    public int cantidadJuegosPrestados(ArrayList<Videojuego> arrayList) {
        int retorno = 0;
        for (Videojuego v : arrayList) {
            if (v.isEntregado()) {
                v.devolver();
                retorno += 1;
            }
        }
        return retorno;
    }
    private String juegoConMasHorasEstimadas(ArrayList<Videojuego> arrayList) {
        Videojuego videojuego = null;
        float aux = 0;
        for (Videojuego v : arrayList) {
            if (v.getHorasEstimadas() > aux) {
                aux = v.getHorasEstimadas();
                videojuego = v;
            }
        }
        return videojuego.toString();
    }
    private String serieConMasTemporadas(ArrayList<Serie> arrayList) {
        Serie serie = null;
        int aux = 0;
        for (Serie serie1 : arrayList) {
            if (serie1.getNumeroTemporadas() > aux) {
                aux = serie1.getNumeroTemporadas();
                serie = serie1;
            }
        }
        return serie.toString();
    }
}
