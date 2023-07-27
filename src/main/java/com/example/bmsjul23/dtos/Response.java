package com.example.bmsjul23.dtos;

import lombok.Data;

@Data
public class Response {
    private ResponseStatus status;
    private String message;
}
