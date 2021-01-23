package com.Xiaoling.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMakeController {
    @GetMapping("/vehiclemakes")
    public String getVehicleMakes(){
        return "vehicleMake";
    }
}
