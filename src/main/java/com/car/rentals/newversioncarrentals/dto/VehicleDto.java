package com.car.rentals.newversioncarrentals.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class VehicleDto {

    private Long id;
    private int serialNumber;
    private String model;
    private boolean isRented;
    private double price;
    private LocalDateTime rentedDate;
    private LocalDateTime returnDate;
}
