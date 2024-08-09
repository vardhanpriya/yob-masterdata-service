package com.service.masterdata.controller;

import com.service.masterdata.dto.CityStateCountryDto;
import com.service.masterdata.dto.PincodeDetailsDto;
import com.service.masterdata.service.PincodeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PincodeDetailsController {

    @Autowired
    PincodeDetailsService pincodeDetailsService;


    @GetMapping(path = "/pincodedetails")
    ResponseEntity<?> getPincodeDetails(@RequestParam("pincode") Long pincode) {
        PincodeDetailsDto response = pincodeDetailsService.fetchPincodeDetailsFrmDb(pincode);
        return ResponseEntity.status(200).body(response);
    }

    @GetMapping(path = "/city-country-state")
    ResponseEntity<?> getPincodeDetailsCSC(@RequestParam("pincode") Long pincode) {
        CityStateCountryDto response = pincodeDetailsService.fetchCityStateCountry(pincode);
        return ResponseEntity.status(200).body(response);
    }
}