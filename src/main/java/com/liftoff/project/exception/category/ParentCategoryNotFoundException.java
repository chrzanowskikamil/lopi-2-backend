package com.liftoff.project.exception.category;

import org.springframework.http.HttpStatus;

public class ParentCategoryNotFoundException extends RuntimeException{
    private final HttpStatus status;
    private final String message;

    public ParentCategoryNotFoundException(String message) {
        super(message);
        this.status = HttpStatus.NOT_FOUND;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

}