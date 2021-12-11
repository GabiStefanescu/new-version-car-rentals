package com.car.rentals.newversioncarrentals.repositories;

import com.car.rentals.newversioncarrentals.entities.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleEntity, Long> {

    VehicleEntity findBySerialNumber(int serialNumber);
}
