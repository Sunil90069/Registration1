package com.api1.exception;

public class ReourceNotFound extends RuntimeException {
    public ReourceNotFound (String message){
        super(message);
    }
}
