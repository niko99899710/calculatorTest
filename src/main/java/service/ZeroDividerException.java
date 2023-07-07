package service;

public class ZeroDividerException extends Throwable {
    private String detail;

    public ZeroDividerException() {
        detail = "Incorrect answer";
    }

    public ZeroDividerException(String message) {
        super(message);
        detail = message;
    }

    @Override
    public String toString() {
        return "ZeroDividerException: " + detail;
    }
}
