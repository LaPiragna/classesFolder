package guia5.ejercicio7;

import java.util.HashMap;
import java.util.Scanner;

public class SistemaClub {
    public static Scanner scanner = new Scanner(System.in);
    private HashMap<String, Socio> socioHashMap;
    public SistemaClub() {
        this.socioHashMap = new HashMap<String, Socio>();
    }
    public void main() {
        menu();
    }
    public Socio genSocio() {
        scanner.nextLine();
        System.out.println("ingresa el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("ingresa el apellido:");
        String apellido = scanner.nextLine();
        System.out.println("ingresa el dni:");
        String dni = scanner.nextLine();
        SocioNormal socioNormal = new SocioNormal(nombre, apellido, dni);
        return socioNormal;
    }
    public Socio agregarSocio() {
        SocioNormal socio = (SocioNormal) genSocio();
        return this.socioHashMap.put(socio.getDni(), socio);
    }
    public void printMenu() {
        System.out.println("1 -> Agregar socio");
        System.out.println("2 -> Buscar socio");
        System.out.println("3 -> ");
    }
    public void printMenuSocio() {
        System.out.println("1 -> ver cuotas");
        System.out.println("2 -> pagar cuota/s");
    }

    public void printInfoSocio(Socio socio) {
        System.out.println(socio.getNombre() + ' ' + socio.getApellido() + " - " + socio.getDni());
    }
    public void menuSocio(Socio socio) {
        int eleccionMenuSocio = 0;
        String salirMenuSocioString = "";
        char salirMenuSoscio = '0';
        while (salirMenuSoscio == '0') {
            printInfoSocio(socio);
            printMenuSocio();
            eleccionMenuSocio = scanner.nextInt();
            switch (eleccionMenuSocio)
            {
                case 1: //ver cuotas
                    socio.verCuotas();
                    break;
                case 2: //pagar cuotas
                    int eleccion = scanner.nextInt();
                    while (eleccion < 0 || eleccion > 12) {
                        System.out.println("ingresar un numero valido:");
                        eleccion = scanner.nextInt();
                    }
                    socio.pagarCuota(eleccion);
                    break;
            }
            System.out.println("Ingresa 0 para volver");
            System.out.println("Ingresa 1 para salir");
            scanner.nextLine();
            salirMenuSocioString = scanner.nextLine();
            salirMenuSoscio = salirMenuSocioString.charAt(0);
        }
    }
    public void menu() {
        int eleccion = 0;
        String salirString = "";
        char salir = '0';
        while (salir == '0') {
            printMenu();
            eleccion = scanner.nextInt();
            switch (eleccion) {
                case 1://agregar socio
                    agregarSocio();
                    break;
                case 2: //buscar socio
                    System.out.println("Ingresar dni: ");
                    scanner.nextLine();
                    String dni = scanner.nextLine();
                    boolean existe = this.socioHashMap.containsKey(dni);
                    if (existe) {
                        Socio socio = this.socioHashMap.get(dni);
                        menuSocio(socio);
                    } else {
                        System.out.println("Sin coincidencias");
                    }
                    break;
            }
            System.out.println("Ingresa 0 para volver");
            System.out.println("Ingresa 1 para salir");
            salirString = scanner.nextLine();
            salir = salirString.charAt(0);
        }
        printMenu();
    }
}
