package com.daniel.github.repository;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;


public class Repository {

    private String fullName;
    private String description;
    private String cloneUrl;
    private int stars;
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDateTime creationDate;
}
