package com.chandana.helloworld.bean;


public class UserException extends RuntimeException {

    private String code;
    private String message;

    public UserException(String code, String message){
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return this.getCode() + " : " + this.getMessage();
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
