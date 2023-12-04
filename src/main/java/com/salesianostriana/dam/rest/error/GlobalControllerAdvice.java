package com.salesianostriana.dam.rest.error;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalControllerAdvice extends ResponseEntityExceptionHandler {
/*
    @ExceptionHandler
    public ResponseEntity<?> NotFoundExeption (HttpServletRequest request, Throwable ex) {

    }
*/
}
