package Exceptions;

public class MyNumberFormatException extends NumberFormatException{
    private String message = "String needed as imput parameter";
    public MyNumberFormatException() {
    }
    @Override
    public String getMessage() {
        return message;
    }
}
