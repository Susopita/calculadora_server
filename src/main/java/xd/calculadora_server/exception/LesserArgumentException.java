package xd.calculadora_server.exception;

public class LesserArgumentException extends RuntimeException {
    public LesserArgumentException(String message) {
        super(message);
    }

    public LesserArgumentException() {
        super("El primer argumento es menor que el segundo");
    }
}
