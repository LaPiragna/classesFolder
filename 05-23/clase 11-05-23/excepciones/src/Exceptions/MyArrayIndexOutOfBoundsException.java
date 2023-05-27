package Exceptions;

public class MyArrayIndexOutOfBoundsException extends ArrayIndexOutOfBoundsException{
    private String message = "invalid index entered";
    public MyArrayIndexOutOfBoundsException() {
    }
    @Override
    public String getMessage() {
        return message;
    }
}
