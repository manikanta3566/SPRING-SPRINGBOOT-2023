package com.practice.todo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handleResourceNotFoundException(ResourceNotFoundException ex){
        ExceptionResponse exceptionResponse=new ExceptionResponse();
        exceptionResponse.setMessage(ex.getMessage());
        exceptionResponse.setStatusCode(String.valueOf(HttpStatus.NOT_FOUND.value()));
        exceptionResponse.setHttpStatus(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(exceptionResponse,HttpStatus.NOT_FOUND);

    }
}
