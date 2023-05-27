package Exceptions;

public class MyIllegalArgumentException extends IllegalArgumentException {
    private String message;
    public MyIllegalArgumentException(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}
