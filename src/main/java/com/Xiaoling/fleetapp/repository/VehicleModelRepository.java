package com.Xiaoling.fleetapp.repository;

import com.Xiaoling.fleetapp.model.VehicleHire;
import com.Xiaoling.fleetapp.model.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {
}
