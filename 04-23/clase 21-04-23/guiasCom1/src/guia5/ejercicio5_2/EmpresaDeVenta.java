package guia5.ejercicio5_2;

public class EmpresaDeVenta {
    private Factura[] facturas;
    private int cantidadFacturas;
    private Cliente[] clientes;
    private int cantidadClientes;
    public EmpresaDeVenta() {
        this.facturas = new Factura[10];
        this.cantidadFacturas = 0;
        this.clientes = new Cliente[10];
        this.cantidadClientes = 0;
    }
    public void main() {
        Cliente cliente = new ClienteMinorista("Daireaux");
        Cliente cliente1 = new ClienteMayorista("Mugaburu", 20);
        agregarCliente(cliente);
        agregarCliente(cliente1);

        Articulo articulo = new Articulo("Caja de leche", 2280F);
        Articulo articulo1 = new Articulo("Caja de vasitos vainilla", 2800F);
        Articulo articulo2 = new Articulo("Caja de vasitos frutiila", 2800F);
        Articulo articulo3 = new Articulo("Caja de yogur colchon frutilla", 3000F);
        Articulo articulo4 = new Articulo("Caja de yogur colchon durazno", 3000F);
        Articulo articulo5 = new Articulo("Caja de yogurt sachet frutilla", 2640F);

        Renglon renglon = new Renglon(articulo, 12);
        Renglon renglon1 = new Renglon(articulo1, 4);
        Renglon renglon2 = new Renglon(articulo2, 4);
        Renglon renglon3 = new Renglon(articulo3, 6);
        Renglon renglon4 = new Renglon(articulo4, 6);
        Renglon renglon5 = new Renglon(articulo5, 8);

        agregarFactura(this.clientes[0]);
        agregarFactura(this.clientes[1]);

        this.facturas[0].agregarRenglon(renglon);
        this.facturas[0].agregarRenglon(renglon1);
        this.facturas[0].agregarRenglon(renglon2);
        this.facturas[0].agregarRenglon(renglon3);

        this.facturas[1].agregarRenglon(renglon);
        this.facturas[1].agregarRenglon(renglon1);
        this.facturas[1].agregarRenglon(renglon2);
        this.facturas[1].agregarRenglon(renglon3);

        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - Facturas");
        verFacturas();
    }
    public boolean existeFactura(int numero) {
        boolean retorno = false;
        int i = 0;
        while (i < this.cantidadFacturas && retorno == false) {
            if (this.facturas[i].getNumeroFactura() == numero)
                retorno = true;
            i++;
        }
        return retorno;
    }
    public boolean agregarFactura(Cliente cliente) throws NullPointerException{
        boolean retorno = false;
        if (this.cantidadFacturas < this.facturas.length) {
            retorno = true;
            Factura factura = new Factura(cliente);
            factura.asignarNumero(this.cantidadFacturas);
            this.facturas[this.cantidadFacturas] = factura;
            this.cantidadFacturas++;
        }
            //momento indicado para utilizar excepciones
        if (cliente == null)
            throw new NullPointerException();
        return retorno;
    }
    public boolean existeCliente(Cliente cliente) {
        boolean retorno = false;
        int i = 0;
        while (i < this.cantidadClientes && retorno == false) {
            if (this.clientes[i].equals(cliente))
                retorno = true;
            i++;
        }
        return retorno;
    }
    public boolean agregarCliente(Cliente cliente) {
        boolean retorno = false;
        if (!existeCliente(cliente)) {
            if (this.cantidadClientes < this.clientes.length) {
                retorno = true;
                this.clientes[this.cantidadClientes] = cliente;
                this.cantidadClientes++;
            }
        }
        return retorno;
    }
    public void verFacturas(){
        for (int i = 0; i < this.cantidadFacturas; i++) {
            System.out.println(facturas[i].toString());
            System.out.println(" - - - - - - - - - - - - ");
        }
    }
}
