package com.car.rentals.newversioncarrentals.service.impl;

import com.car.rentals.newversioncarrentals.dto.VehicleDto;
import com.car.rentals.newversioncarrentals.entities.VehicleEntity;
import com.car.rentals.newversioncarrentals.exceptions.ErrorMessages;
import com.car.rentals.newversioncarrentals.exceptions.VehicleServiceException;
import com.car.rentals.newversioncarrentals.repositories.VehicleRepository;
import com.car.rentals.newversioncarrentals.service.VehicleService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepository;

    @Override
    public VehicleDto addVehicle(VehicleDto vehicleDto) {

        if(vehicleRepository.findBySerialNumber(vehicleDto.getSerialNumber()) != null) {
            throw new VehicleServiceException(ErrorMessages.VEHICLE_EXISTS.getErrorMessage());
        }

        VehicleEntity vehicleEntity = new ModelMapper().map(vehicleDto, VehicleEntity.class);
        vehicleEntity.setRented(vehicleDto.isRented());
        VehicleEntity storedEntity = vehicleRepository.save(vehicleEntity);

        return new ModelMapper().map(storedEntity, VehicleDto.class);
    }


    @Override
    public List<VehicleDto> getVehicles() {
        List<VehicleEntity> vehicles = vehicleRepository.findAll();

        if (vehicles.isEmpty()) {
            throw new VehicleServiceException(ErrorMessages.EMPTY_DATABASE.getErrorMessage());
        }

        return vehicles.stream()
                .map(vehicleEntity -> new ModelMapper().map(vehicleEntity, VehicleDto.class))
                .collect(Collectors.toList());
    }

}
