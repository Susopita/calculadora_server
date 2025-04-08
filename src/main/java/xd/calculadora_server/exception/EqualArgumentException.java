package xd.calculadora_server.exception;

public class EqualArgumentException extends RuntimeException {
    public EqualArgumentException(String message) {
        super(message);
    }

    public EqualArgumentException() {
        super("Los argumentos son iguales");
    }
}
