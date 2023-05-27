package MaquinaExpendedora;
import java.time.LocalDateTime;
import java.util.Scanner;

public class MaquinaExpendedoraSimple {
    public static Scanner escaner = new Scanner ( System.in );
    private final Boleto[] boletos;
    private final Cliente[] clientes;
    private int saldo;
    private int recaudacion;
    private int precioActual;
    private int topeBoletos;
    private int topeClientes;
    private int cantidadBoletos;
    private int cantidadClientes;
    private final LocalDateTime fecha;

    public MaquinaExpendedoraSimple(Boleto[] boletos, Cliente[] clientes,int topeBoletos, int topeClientes,
                                    int precioActual, int saldo) {
        this.topeBoletos = topeBoletos;
        this.topeClientes = topeClientes;
        this.boletos = new Boleto[topeBoletos];
        this.clientes = new Cliente[topeClientes];
        this.recaudacion = 0;
        this.precioActual = precioActual;
        this.saldo = saldo;
        this.cantidadBoletos = 0;
        this.cantidadClientes = 0;
        this.fecha = LocalDateTime.now ();
    }

    /// - - - Getters
    public int getRecaudacion() {
        return recaudacion;
    }
    public int getprecioActual() {
        return precioActual;
    }
    public int getSaldo() {
        return saldo;
    }
    public int getCantidadBoletos() {return cantidadBoletos;}
    public LocalDateTime getFecha(){return this.fecha;}
    public int getPrecioActual() {return precioActual;}
    public int getTopeBoletos() {return topeBoletos;}

    /// - - - Setters
    public void setTopeBoletos(int topeBoletos) {
        this.topeBoletos = topeBoletos;
    }
    public void setPrecioActual(int precioActual) {
        this.precioActual = precioActual;
    }
    public void setTopeClientes(int topeClientes) {
        this.topeClientes = topeClientes;
    }

    /// - - - Metodos
    public Boleto imprimirBoleto(int precioActual, LocalDateTime fecha)
    {
        //METODO QUE LLAMA AL CONSTRUCTOR DE LA CLASE 'BOLETO' PARA CREAR UNA INSTANCIA Y RETORNARLA.
        Boleto boleto = new Boleto (precioActual, fecha);
        return boleto;
    }
    public void imprimirMenuIngreso() {
        //METODO QUE MUESTRA LAS OPCIONES AL INICIO DEL SISTEMA
        System.out.println ("           Bienvenido!");
        System.out.println ("Ingresar");
        System.out.println ("1) Si es cliente");
        System.out.println ("2) Si es operario de estación");
    }
    public String imprimirMenuUsuario() {
        //METODO QUE MUESTRA LAS OPCIONES DEL MENU DEL USUARIOs
        String eleccion;
        System.out.println ("1) para comprar un boleto");
        System.out.println ("0 para cerrar la sesion");
        eleccion = escaner.nextLine (); //opcion elegida
        return eleccion;
    }
    public String imprimirMenuTecnico() {
        //METODO QUE MUESTRA LAS OPCIONES DEL MENU DEL TECNICO
        String eleccion;
        System.out.println ("1) para ver la recaudacion");
        System.out.println ("2) para ver el saldo actual");
        System.out.println ("3) para ver el precio actual");
        System.out.println ("4) para ver la cantidad de boletos impresos");
        System.out.println ("5) para ver informacion de los boletos impresos");
        System.out.println ("6) para juntar lo recaudado por la maquina");
        System.out.println ("7) para ver informacion de los clientes que han comprado");
        System.out.println ("8) para modificar el precio del boleto");
        System.out.println ("9) para modificar el tope de boletos");
        System.out.println ("0 para cerrar la sesion");
        eleccion = escaner.nextLine (); //opcion elegida
        return eleccion;
    }
    public char imprimirMenuSalida() {
        String sesionActual;
        char sesionActualChar;
        System.out.println ("1) para iniciar una nueva sesion");
        System.out.println ("0) para salir del sistema");
        sesionActual = escaner.nextLine ();
        sesionActualChar = sesionActual.charAt ( 0 );
        return sesionActualChar;
    }
    public String devolvertipoUsuario(char entrada)
    {
        //FUNCION QUE RETORNA EN UNA VARIABLE DE TIPO STRING SI EL USUARIO ES CLIENTE O TECNICO
        String retorno = "";
        if ( entrada == '1' ) {
            retorno = "tecnico";
        } else if ( entrada == '2' ) {
            retorno  = "usuario";
        }
        return retorno;
    }
    public boolean verificarTopeUsuarios(int cantidadClientes)
    {
        boolean retorno = true;
        if ( cantidadClientes == this.topeClientes )
            retorno = false;
        return retorno;
    }
    public void actualizacionMaquina(Boleto boleto) {
        this.boletos[this.cantidadBoletos] = boleto;
        this.cantidadBoletos++;
        this.saldo = this.saldo - this.precioActual;
        this.recaudacion = this.recaudacion + this.precioActual;
    }
    public void menu()
    {
        String usuario; //
        String identidad; // NOMBRE Y APELLIDO
        String tipoUsuario; // CLIENTE O TECNICO
        String dni; // DNI
        String eleccion; // OPCION ELEGIDA DENTRO DEL MENU DE USUARIO
        char sesionActualChar; // FUTURO 'CHAR.AT(0)'
        char usuarioChar; // FUTURO 'CHAR.AT(0)'
        boolean salir;
        boolean sesion = true;

        while ( sesion ) {

            imprimirMenuIngreso ();

            // INDICACION DEL TIPO DE USUARIO
            usuario = escaner.nextLine ();
            usuarioChar = usuario.charAt ( 0 );

            //INFORMACION DE IDENTIDAD
            System.out.println ("nombre y apellido: ");
            identidad = escaner.nextLine ();
            System.out.println ("dni: ");
            dni = escaner.nextLine (); //dni

            // TIPO DE USUARIO EN STRING
            tipoUsuario = devolvertipoUsuario(usuarioChar);

            // CONSTRUCTOR DEL USUARIO VERIFICANDO CANTIDAD DE CLIENTES INGRESADOS PREVIAMENTE AL SISTEMA
            if ( verificarTopeUsuarios ( this.cantidadClientes ) ) {
                Cliente cliente = new Cliente ( identidad, dni, tipoUsuario );
                clientes[cantidadClientes] = cliente;
                cantidadClientes++; //---  -  -  - /\   -  --  -  MENUS  -  --  -   /\ -  -  -  ---//
                salir = false;
                while ( !salir ) {
                    // - - - MENU cliente - - - //
                    if ( usuarioChar == '1' ) {
                        eleccion = imprimirMenuUsuario ();
                        switch (eleccion.charAt ( 0 )) {
                            case '0' -> { //SALIDA DEL MENU
                                System.out.println ( "Cerrando sesion..." );
                                salir = true;
                            }
                        /*
                        IMPRESION DEL BOLETO, ACTUALIZACION DE LOS DATOS CON RESPECTO A
                        - CANTIDAD DE BOLETOS IMPRESOS
                        - SALDO RESTANTE
                        - RECAUDACION OBTENIDA
                        (verificando siempre que sea posible realizar la accion...)
                          */
                            case '1' -> { //ES POSIBLE LA COMPRA
                                if ( (this.saldo - this.precioActual) >= 0 && (this.cantidadBoletos < this.topeBoletos) ) {
                                    System.out.println ( "En segundos se habra generado su boleto..." );
                                    Boleto boleto = new Boleto ( this.precioActual, this.fecha );
                                    actualizacionMaquina ( boleto ); //ACTUALIZACION DE SALDO, RECAUDACION Y CANTIDA DE BOLETOS IMPRESOS
                                } else { //NO ES POSIBLE LA COMPRA
                                    if ( this.cantidadBoletos == this.topeBoletos ) { //TOPE DE BOLETOS GENERADOS
                                        System.out.println ( "La maquina ha alcanzado el tope de generacion de boletos diario" );
                                    } else if ( this.saldo < this.precioActual ) { //INSUFICIENTE SALDO DE LA TERMINAL
                                        System.out.println ( "La maquina se ha quedado sin saldo. Llame al tecnico encargado" );
                                    }
                                }
                                salir = true;
                            }
                            default -> //OPCION INVALIDA
                                    System.out.println ( "Opción inválida." );
                        }
                    }
                    // - - - MENU TECNICO - - - //
                    else if ( usuarioChar == '2' ) {
                        eleccion = imprimirMenuTecnico (); //OPCION ELEGIDA
                        switch (eleccion.charAt ( 0 )) {
                            case '0' -> { //SALIDA DEL MENU
                                System.out.println ( "Cerrando sesion..." );
                                salir = true;
                            }
                            case '1' -> { //VER RECAUDACION DE LA MAQUINA
                                System.out.println ( "recaudacion: " + getRecaudacion () );
                            }
                            case '2' -> { //VER SALDO RESTANTE DE LA MAQUINA
                                System.out.println ( "saldo restante: " + getSaldo () );
                            }
                            case '3' -> { //VER PRECIO ACTUAL DE LA MAQUINA
                                System.out.println ( "precio actual del boleto: " + getPrecioActual () );
                            }
                            case '4' -> { //VER CANTIDAD DE BOLETOS IMPRESOS
                                System.out.println ( "cantidad de boletos impresos hasta el momento: " + getCantidadBoletos () );
                            }
                            case '5' -> { //VER INFO DE BOLETOS IMPRESOS
                                System.out.println ("//VER INFO DE BOLETOS IMPRESOS");
                            }
                            case '6' -> { //JUNTAR LA RECAUDACION
                                System.out.println ("//JUNTAR LA RECAUDACION");
                                this.recaudacion = 0;
                            }
                            case '7' -> { //VER INFO DE LOS CLIENTES QUE COMPRARON
                                System.out.println ("//VER INFO DE LOS CLIENTES");
                            }
                            case '8' -> { //MODIFICAR PRECIO DE COMPRA DEL BOLETO
                                System.out.println ("//MODIFICAR EL PRECIO DEL BOLETO");
                                System.out.println ("Establecer nuevo precio del boleto: ");
                                setPrecioActual ( escaner.nextInt () );
                            }
                            case '9' -> { //MODIFICAR EL TOPE DE BOLETOS
                                System.out.println ("//MODIFICAR EL TOPE DE BOLETOS");
                                System.out.println ("Establecer nuevo tope de boletos:");
                                setTopeBoletos ( escaner.nextInt ()  );
                            }
                            default -> //OPCION INVALIDA
                                    System.out.println ( "Opcion invalida." );
                        }
                    }
                    else {
                        salir = true;
                    }
                }
            } else {
                System.out.println ("La cantidad de usuarios ingresados ha alcanzado el tope. Dirigase a otra estacion.");
            }
            sesionActualChar = imprimirMenuSalida ();
            if ( sesionActualChar == '0' ) {
                System.out.println ("Saliendo del sistema...");
                sesion = false;
            } else if ( sesionActualChar == '1' ) {
                System.out.println ( "Iniciando nueva sesion..." );
            } else {
                System.out.println ("Dato invalido >_<");
                System.out.println ("Iniciando nueva sesion... :&");
            }
        }
    }
}
