package com.Xiaoling.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobTitleController {
    @GetMapping("/jobtitles")
    public String getJobTitles(){
        return "jobTitle";
    }
}
