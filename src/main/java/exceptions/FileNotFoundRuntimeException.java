package exceptions;

public class FileNotFoundRuntimeException extends RuntimeException {
    public FileNotFoundRuntimeException(String message) {
        super(message);
    }
}
