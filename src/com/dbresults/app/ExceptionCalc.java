package com.dbresults.app;

public class ExceptionCalc extends Exception {
    public ExceptionCalc(String message) {
        super(message);
    }

    public static class AhmadException extends Exception {
        public AhmadException(String message) {
            super(message);
        }
    }
}
