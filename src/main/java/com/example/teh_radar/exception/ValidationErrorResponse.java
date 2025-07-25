package com.example.teh_radar.exception;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

//Структура ответа клиенту при ошибках валидации
@Getter
@Setter
public class ValidationErrorResponse {

    private int status;
    private String message;
    private List<Violation> violations = new ArrayList<>();

    public ValidationErrorResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public void addViolation(String fieldName, String errorMessage) {
        violations.add(new Violation(fieldName, errorMessage));
    }

    public static class Violation {

        private String fieldName;
        private String errorMessage;
        public Violation(String fieldName, String errorMessage) {}

    }
}
