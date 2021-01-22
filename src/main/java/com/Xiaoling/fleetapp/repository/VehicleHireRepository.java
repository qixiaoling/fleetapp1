package com.Xiaoling.fleetapp.repository;

import com.Xiaoling.fleetapp.model.Client;
import com.Xiaoling.fleetapp.model.VehicleHire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire, Integer> {
}
