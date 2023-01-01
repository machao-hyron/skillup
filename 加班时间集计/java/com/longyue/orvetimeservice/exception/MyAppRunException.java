package com.longyue.orvetimeservice.exception;

/**
 * 通用异常类
 */
public class MyAppRunException extends RuntimeException {

    public MyAppRunException(String message) {
        super(message);
    }

    public MyAppRunException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyAppRunException(Throwable cause) {
        super(cause);
    }

    protected MyAppRunException(String message,
                                Throwable cause,
                                boolean enableSuppression,
                                boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}

