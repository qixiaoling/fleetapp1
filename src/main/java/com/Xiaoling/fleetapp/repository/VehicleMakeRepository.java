package com.Xiaoling.fleetapp.repository;

import com.Xiaoling.fleetapp.model.VehicleHire;
import com.Xiaoling.fleetapp.model.VehicleMake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMakeRepository extends JpaRepository<VehicleMake, Integer> {
}
