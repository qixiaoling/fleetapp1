package com.Xiaoling.fleetapp.repository;

import com.Xiaoling.fleetapp.model.VehicleHire;
import com.Xiaoling.fleetapp.model.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Integer> {
}
