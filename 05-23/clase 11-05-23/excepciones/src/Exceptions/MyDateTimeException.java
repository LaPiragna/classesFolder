package Exceptions;
import java.time.DateTimeException;
public class MyDateTimeException extends DateTimeException {
    private String message;
    public MyDateTimeException(String message) {
        super(message);
    }
    @Override
    public String getMessage() {
        return message;
    }
}
