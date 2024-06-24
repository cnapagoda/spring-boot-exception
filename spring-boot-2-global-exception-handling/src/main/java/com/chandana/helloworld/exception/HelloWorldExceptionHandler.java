package com.chandana.helloworld.exception;

import com.chandana.helloworld.bean.UserException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class HelloWorldExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = { UserException.class, IllegalStateException.class })
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Object handleConflict(UserException ex) {
        UserExceptionResponse response = new UserExceptionResponse(ex);
        return response;
    }
}