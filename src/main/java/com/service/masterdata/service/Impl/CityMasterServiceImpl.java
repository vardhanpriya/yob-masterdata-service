package com.service.masterdata.service.Impl;

import com.service.masterdata.dto.CityMasterDto;
import com.service.masterdata.entities.CityMaster;
import com.service.masterdata.repository.CityMasterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityMasterServiceImpl implements CityMasterService{

    @Autowired
    CityMasterRepo cityMasterRepo;
    @Override
    public CityMasterDto fetchCityMasterFromDp(String cityname) {

        CityMasterDto response = new CityMasterDto();
        CityMaster cityMstr = cityMasterRepo.findByCityName(cityname);

        response.setCityCode(cityMstr.getCityCode());
        response.setCountry(cityMstr.getCountry());
        response.setCityName(cityMstr.getCityName());
        response.setStateName(cityMstr.getStateName());
        response.setId(cityMstr.getId());

        return response;
    }

}
