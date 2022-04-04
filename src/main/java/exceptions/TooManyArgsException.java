package exceptions;

public class TooManyArgsException extends IllegalArgumentException {
    public TooManyArgsException() {
        super();
    }

    public TooManyArgsException(String s) {
        super(s);
    }

    public TooManyArgsException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooManyArgsException(Throwable cause) {
        super(cause);
    }
}
