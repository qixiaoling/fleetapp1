package com.Xiaoling.fleetapp.service;

import com.Xiaoling.fleetapp.model.Country;
import com.Xiaoling.fleetapp.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getCountries(){
        return countryRepository.findAll();
    }

    public void save(Country country){
        countryRepository.save(country);
    }
}
