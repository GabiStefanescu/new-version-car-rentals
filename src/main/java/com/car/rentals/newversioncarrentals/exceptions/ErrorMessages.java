package com.car.rentals.newversioncarrentals.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorMessages {

    VEHICLE_NOT_FOUND("Vehicle not found in database. Please try again."),
    VEHICLE_EXISTS("This vehicle already exists. Add another."),
    EMPTY_DATABASE("Database is empty."),
    MISSING_REQUIRED_FIELDS("Missing required fields.");

    private String errorMessage;
}
