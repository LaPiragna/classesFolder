import MaquinaExpendedora.MaquinaExpendedoraSimple;
import MaquinaExpendedora.Boleto;
import MaquinaExpendedora.Cliente;

public class Main {
    public static void main(String[] args)
    {
        Boleto boletos[] = new Boleto[100];
        Cliente clientes[] = new Cliente[100];
        MaquinaExpendedoraSimple maquinola = new MaquinaExpendedoraSimple ( boletos, clientes, 500,
                100, 100, 10000);
        maquinola.menu ();
    }
}