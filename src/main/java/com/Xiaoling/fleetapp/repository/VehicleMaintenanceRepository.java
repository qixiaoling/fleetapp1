package com.Xiaoling.fleetapp.repository;

import com.Xiaoling.fleetapp.model.VehicleHire;
import com.Xiaoling.fleetapp.model.VehicleMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMaintenanceRepository extends JpaRepository<VehicleMaintenance, Integer> {
}
