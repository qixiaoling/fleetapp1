package com.Xiaoling.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeTypeController {

    @GetMapping("/employeetypes")
    public String getEmployeeTypes(){
        return "employeeType";
    }
}
