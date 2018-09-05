package com.chandana.helloworld.exception;

import com.chandana.helloworld.bean.UserException;

public class UserExceptionResponse {

    private String errorCode;
    private String errorMessage;

    public UserExceptionResponse(UserException ex) {
        this.errorCode = ex.getCode();
        this.errorMessage = ex.getMessage();
    }
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
