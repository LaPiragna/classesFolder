package Exceptions;

public class DivisionByCero extends ArithmeticException{
    private String message;
    public DivisionByCero() {
        this.message = "divisor '0'";
    }
    @Override
    public String getMessage() {
        return message;
    }
}
