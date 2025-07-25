package com.example.teh_radar.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//Глобальный обработчик исключений для REST-контроллеров
@RestControllerAdvice
public class GlobalExceptionHandler {

    //Обработка ошибок, не прошедшие валидацию @Valid
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ValidationErrorResponse handleValidationErrors(MethodArgumentNotValidException ex) {
        ValidationErrorResponse response = new ValidationErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                "Ошибка валидации входящих данных"
        );

        for (FieldError fieldError : ex.getBindingResult().getFieldErrors()) {
            response.addViolation(fieldError.getField(), fieldError.getDefaultMessage());
        }

        return response;
    }

}
