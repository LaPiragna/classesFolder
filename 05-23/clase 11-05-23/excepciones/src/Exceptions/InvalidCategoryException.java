package Exceptions;

public class InvalidCategoryException extends Exception{
    private String message;
    public InvalidCategoryException(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}
