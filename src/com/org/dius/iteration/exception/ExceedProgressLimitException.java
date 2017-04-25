package com.org.dius.iteration.exception;

public class ExceedProgressLimitException extends Exception{
	public ExceedProgressLimitException(){
        super();
    }

    public ExceedProgressLimitException(String message){
        super(message);
    }
    
    public ExceedProgressLimitException(final String message, final Throwable exception) {
        super(message, exception);
    }
}
