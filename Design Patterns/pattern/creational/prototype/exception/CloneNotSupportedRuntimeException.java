package pl.vm.javaguild.designpatterns.pattern.creational.prototype.exception;

public class CloneNotSupportedRuntimeException extends RuntimeException{

    public CloneNotSupportedRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
