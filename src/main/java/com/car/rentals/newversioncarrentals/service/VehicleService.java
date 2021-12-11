package com.car.rentals.newversioncarrentals.service;

import com.car.rentals.newversioncarrentals.dto.VehicleDto;

import java.util.List;

public interface VehicleService {

    VehicleDto addVehicle(VehicleDto vehicleDto);

    List<VehicleDto> getVehicles();
}
