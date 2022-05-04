package com.firmino.empresadecarga.exception;

public class TransporteNotfoundException extends Exception {

    public TransporteNotfoundException() {
    }

    public TransporteNotfoundException(String message) {
        super(message);
    }

    public TransporteNotfoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransporteNotfoundException(Throwable cause) {
        super(cause);
    }

    public TransporteNotfoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
