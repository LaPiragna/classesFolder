import Exceptions.SaldoInsuficienteException;

public class BankAcc {
    /*Escribe una clase que represente una cuenta bancaria, con un saldo y un número de cuenta.
    La clase debe tener un método para retirar que reciba una cantidad de dinero y
    lance una excepción de tipo SaldoInsuficienteException si el saldo es menor que la cantidad a retirar.
    La excepción SaldoInsuficienteException debe ser una clase personalizada que herede de Exception y tenga un constructor que reciba un mensaje de error.
     */
    private float funds;
    private String accNumber;
    public BankAcc(float funds, String accNumber) {
        this.funds = funds;
        this.accNumber = accNumber;
    }
    public float ex5(float amount) throws SaldoInsuficienteException {
        if (amount > this.funds)
            throw new SaldoInsuficienteException("insuficcient funds");
        else
            this.funds -= amount;
        return this.funds;
    }
}
