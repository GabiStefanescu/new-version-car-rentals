package com.car.rentals.newversioncarrentals.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "vehicles")
public class VehicleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "serial_number", nullable = false, length = 6)
    private int serialNumber;

    @Column(nullable = false, length = 15)
    private String model;

    @Column(name = "rented_status", length = 5)
    private boolean isRented;

    @Column(name = "price_per_day", nullable = false, length = 5)
    private double price;

    @Column(name = "rented_date", length = 20)
    private LocalDateTime rentedDate;

    @Column(name = "return_date", length = 20)
    private LocalDateTime returnDate;

}
