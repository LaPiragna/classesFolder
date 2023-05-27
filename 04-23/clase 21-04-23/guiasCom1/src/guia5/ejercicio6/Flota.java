package guia5.ejercicio6;

import ejercicio6.Automovil;
import ejercicio6.Cliente;
import ejercicio6.Utilitario;

import java.util.*;

public class Flota {
    public static Scanner scanner = new Scanner(System.in);
    private String direccion;
    private Date fecha;
    private ArrayList<Vehiculo> vehiculos;
    public Flota(String direccion) {
        this.direccion = direccion;
        this.fecha = new Date ();
        this.vehiculos = new ArrayList<Vehiculo> ();
    }
    public void agregarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add ( vehiculo );
    }
    public boolean alquilarVehiculo() {
        /*habria que verificar si el coche está realmente disponible verificando su estado.
        Será únicamente posible en el caso de que el mismo sea "Disponible"
         */
        Vehiculo vehiculo = seleccionarVehiculo();
        boolean retorno = false;
        if (vehiculo.getEstado() == "disponible") {
            System.out.println("Ingresar nombre del cliente: ");
            String nombreCLiente = scanner.nextLine();
            Cliente cliente = new Cliente(nombreCLiente);
            vehiculo.getHistorialFechas ().add ( fecha );
            modificarEstadoVehiculo(vehiculo, "Alquilado");
            vehiculo.getHistorialClientes ().add ( cliente );
            retorno = true;
        }
        return retorno;
    }
    public boolean devolverVehiculo() {
        boolean retorno = false;
        Vehiculo vehiculo = seleccionarVehiculo();
        if (vehiculo.getEstado() == "alquilado") {
            System.out.println("Kilómetros recorridos --> ");
            float km = scanner.nextFloat();
            vehiculo.setEstado ( "en verificacion tecnica" );
            vehiculo.setKm (vehiculo.getKm() + km);
            retorno = true;
        }
        return retorno;
    }
    public void modificarEstadoVehiculo(Vehiculo vehiculo, String estado) {
        vehiculo.setEstado ( estado );
    }
    public void modificarPAlquilerVehiculo(Vehiculo vehiculo, float precioAlquiler) {
        vehiculo.setPrecioAlquilerDiario ( precioAlquiler );
    }
    public void modificarPatenteVehiculo(Vehiculo vehiculo, String patente) {
        vehiculo.setPatente( patente );
    }
    public void modificarMarcaVehiculo(Vehiculo vehiculo, String marca) {
        vehiculo.setMarca ( marca );
    }
    public void modificarModeloVehiculo(Vehiculo vehiculo, String modelo) {
        vehiculo.setModelo ( modelo );
    }
    public void modificarPeriodo(Vehiculo vehiculo, String periodo) {
        vehiculo.setPeriodo ( periodo );
    }
    public void modificarVehiculo() {
        modificar();
    }
    public void modificar() {
        Vehiculo vehiculo = seleccionarVehiculo();
        if (vehiculo != null) {
            int rta;
            String estado;
            String patente;
            String marca;
            String modelo;
            String añoFabricacion;
            float precio;
            System.out.println ( "1 para modificar el estado:" );
            System.out.println ( "2 para modificar el precio del alquiler diario:" );
            System.out.println ( "3 para modificar la patente:" );
            System.out.println ( "4 para modificar la marca:" );
            System.out.println ( "5 para modificar el modelo:" );
            System.out.println ( "6 para modificar el año de fabricacion del vehiculo:" );
            rta = scanner.nextInt ();
            scanner.nextLine ();
            if ( rta == 1 ) {
                estado = scanner.nextLine ();
                this.modificarEstadoVehiculo ( vehiculo, estado );
            }
            else if ( rta == 2) {
                precio = scanner.nextFloat ();
                this.modificarPAlquilerVehiculo ( vehiculo, precio );
            }
            else if ( rta == 3) {
                patente = scanner.nextLine ();
                this.modificarPatenteVehiculo ( vehiculo, patente );
            }
            else if ( rta == 4) {
                marca = scanner.nextLine ();
                this.modificarMarcaVehiculo ( vehiculo, marca );
            }
            else if ( rta == 5) {
                modelo = scanner.nextLine ();
                this.modificarModeloVehiculo ( vehiculo, modelo );
            }
            else if ( rta == 6) {
                añoFabricacion = scanner.nextLine ();
                this.modificarPeriodo ( vehiculo, añoFabricacion );
            }
        }
    }
    public void resultadosVerificacion() {
        Vehiculo vehiculo = seleccionarVehiculo();
        if ( vehiculo.getEstado () == "en verificacion tecnica" ) {
            if ( vehiculo.getKm () > 100000 ) {
                modificarEstadoVehiculo ( vehiculo, "en reparacion" );
                System.out.println ("El vehiculo se encuentra en reparacion");
            } else {
                this.modificarEstadoVehiculo ( vehiculo, "disponible" );
                System.out.println ("El vehiculo se encuentra disponible");
            }
        } else {
            System.out.println ("no estaba en verificacion tecnica.");
        }
    }
    public void mostrarInfoVehiculo() {
        Vehiculo vehiculo = seleccionarVehiculo();
        System.out.println(vehiculo.toString());
    }
    public void mostrarInfoVehiculo(Vehiculo vehiculo) {
        System.out.println(vehiculo.toString());
    }
    public void mostrarInfoVehiculoShort(Vehiculo vehiculo) {
        System.out.println(vehiculo.toStringShort());
    }
    public void mostrarVehiculos() {
        int i = 0;
        for (Vehiculo v : this.vehiculos) {
            System.out.printf(i + " -> ");
            if (v instanceof Automovil) {
                mostrarInfoVehiculo(v);
            } else if (v instanceof Utilitario) {
                mostrarInfoVehiculo(v);
            }
            i++;
        }
    }
    public void mostrarVehiculoShort() {
        int i = 0;
        for (Vehiculo v : this.vehiculos) {
            System.out.printf(i + " -> ");
            if (v instanceof Automovil) {
                mostrarInfoVehiculoShort(v);
            } else if (v instanceof Utilitario) {
                mostrarInfoVehiculoShort(v);
            }
            i++;
        }
    }
    public void menu() {

        Vehiculo vehiculo = new Automovil("AAA-007", "Audi", "A5", "2023", "disponible", 0, 20000);
        Vehiculo vehiculo1 = new Utilitario("AAA-000", "Peugeot", "Partner", "2020", "disponible", 200000, 7000, "panificados");

        Utilitario utilitario = new Utilitario("AAA-001", "Renault", "Master", "2022", "disponible", 100000, 20000, "muebles");
        Utilitario utilitario1 = new Utilitario("AAA-002", "Fiat", "Fiorino", "2020", "en reparacion", 300000, 8000, "lacteos/fiambres");
        Utilitario utilitario2 = new Utilitario("AAA-003", "Fiat", "Cubo", "2023", "disponible", 0, 10000, "papel higienico");

        Automovil automovil = new Automovil("AAA-004", "Peugeot", "308", "2023", "disponible", 0, 10000);
        Automovil automovil1 = new Automovil("AAA-005", "Peugeot", "3008", "2023", "disponible", 0, 10000);
        Automovil automovil2 = new Automovil("AAA-006", "Peugeot", "208", "2023", "disponible", 0, 10000);

        agregarVehiculo(vehiculo);
        agregarVehiculo(vehiculo1);
        agregarVehiculo(utilitario);
        agregarVehiculo(utilitario1);
        agregarVehiculo(utilitario2);
        agregarVehiculo(automovil);
        agregarVehiculo(automovil1);
        agregarVehiculo(automovil2);
        /*
        * Sería recomendable agregar funciones de agregar vehículos
        * */
        Cliente cliente = new Cliente("Alfon");

        String exitS = null;
        char exit = '1';
        while (exit == '1') {

            printMenu();
            int eleccion = 0;
            eleccion = scanner.nextInt();

            while (eleccion < 1 || eleccion > 7) {
                System.out.println("Ingreso invalido. Reintentar... ->: ");
                eleccion = scanner.nextInt();
            }

            switch (eleccion) {
                case 1:
                    modificar();
                    break;
                case 2:
                    alquilarVehiculo();
                    break;
                case 3:
                    devolverVehiculo();
                    break;
                case 4:
                    resultadosVerificacion();
                    break;
                case 5:
                    //mostrar estado de cada vehiculo.
                    break;
                case 6:
                    verHistorialVehiculo();
                    break;
                case 7:
                    mostrarInfoVehiculo();
                    break;
            }

            System.out.println("ingresa 1 volver al menu");
            System.out.println("ingresa cualquier otra tecla para salir");
            scanner.nextLine();
            exitS = scanner.nextLine();
            exit = exitS.charAt(0);
        }
    }
    public Vehiculo seleccionarVehiculo() {
        mostrarVehiculoShort();
        Vehiculo vehiculo = null;
        System.out.println("Seleccionar vehiculo: ");
        int eleccion = scanner.nextInt();
        while (eleccion < 0 || eleccion > this.vehiculos.size()) {
            System.out.println("ingresar un dato válido");
            eleccion = scanner.nextInt();
        }
        vehiculo = this.vehiculos.get(eleccion);
        return vehiculo;
    }
    public void verHistorialVehiculo() {
        Vehiculo vehiculo = seleccionarVehiculo();
    }
    public void printMenu() {
        System.out.println("1) Dar de alta y modificar vehículos");
        System.out.println("2) Alquilar vehículos");
        System.out.println("3) Devolver vehículos");
        System.out.println("4) Establecer el resultado de la revisión técnica de un vehículo");
        System.out.println("5)                      Listar el estado de la flota de vehículos                        /-/-/-/-/ Desarrollar.");
        System.out.println("6) Mostrar el historial de alquileres de un vehículo seleccionado de la flota");
        System.out.println("7) Mostrar info detallada de un vehiculo");
    }
}
