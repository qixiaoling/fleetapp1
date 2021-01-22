package com.Xiaoling.fleetapp.repository;

import com.Xiaoling.fleetapp.model.Client;
import com.Xiaoling.fleetapp.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
