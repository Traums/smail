package com.sber.mailmain.exceptionhandler.exceptions;

public class DataNotExistException extends RuntimeException {
    public DataNotExistException(String message, Long attributeId) {
        super(message + ": " + attributeId);
    }
}