package com.Xiaoling.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMaintenanceController {
    @GetMapping("/vehiclemaintenances")
    public String getVehicleMaintenances(){
        return "vehiclemaintenance";
    }
}
