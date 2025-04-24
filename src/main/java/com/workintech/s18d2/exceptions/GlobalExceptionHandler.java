package com.workintech.s18d2.exceptions;/*
Interceptor - Hatalarda Araya Girer
*/

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler // Otomatik algılamazsa bunu ekle (PlantErrorException.class)
    public ResponseEntity<PlantResponse> handleException(PlantException theException) {
        PlantResponse errorResponse = new PlantResponse();
        errorResponse.setStatusCode(theException.getHttpStatus().value());
        errorResponse.setMessage(theException.getMessage());
        errorResponse.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(errorResponse, theException.getHttpStatus());
    }

    // Bu Global Hata Yakalama Kısmı, gelen hatayı INTERNAL_SERVER_ERROR olarak ayarlar.
    @ExceptionHandler // Otomatik algılamazsa bunu ekle (Exception.class)
    public ResponseEntity<PlantResponse> handleException(Exception theException) {
        PlantResponse errorResponse = new PlantResponse();

        errorResponse.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorResponse.setMessage(theException.getMessage());
        errorResponse.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
