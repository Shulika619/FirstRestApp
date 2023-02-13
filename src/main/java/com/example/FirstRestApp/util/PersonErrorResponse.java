package com.example.FirstRestApp.util;

import lombok.Data;

@Data
public class PersonErrorResponse {
    private String message; // сообщение об ошибке
    private long timestamp; // точное время

    public PersonErrorResponse(String message, long timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }
}
