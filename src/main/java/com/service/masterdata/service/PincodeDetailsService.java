package com.service.masterdata.service;

import com.service.masterdata.dto.CityStateCountryDto;
import com.service.masterdata.dto.PincodeDetailsDto;
import com.service.masterdata.entities.PincodeDetails;

public interface PincodeDetailsService {

  PincodeDetailsDto fetchPincodeDetailsFrmDb(Long pincode);

  CityStateCountryDto fetchCityStateCountry(Long pincode);


}
