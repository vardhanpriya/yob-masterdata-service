package com.service.masterdata.service.Impl;

import com.service.masterdata.dto.CityStateCountryDto;
import com.service.masterdata.dto.DropDownData;
import com.service.masterdata.dto.PincodeDetailsDto;
import com.service.masterdata.entities.CityMaster;
import com.service.masterdata.entities.PincodeDetails;
import com.service.masterdata.entities.StateMaster;
import com.service.masterdata.repository.CityMasterRepo;
import com.service.masterdata.repository.PinCodeDetailsRepo;
import com.service.masterdata.repository.StateMasterRepo;
import com.service.masterdata.service.PincodeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PincodeDetailsServiceImpl implements PincodeDetailsService {

    @Autowired
    PinCodeDetailsRepo pinCodeDetailsRepo;

    @Autowired
    StateMasterRepo stateMasterRepo;

    @Autowired
    CityMasterRepo cityMasterRepo;



    @Override
    public PincodeDetailsDto fetchPincodeDetailsFrmDb(Long pincode) {
        PincodeDetailsDto response = new PincodeDetailsDto();
        PincodeDetails pincodeDtls = pinCodeDetailsRepo.findByPincode(pincode);

        if(pincodeDtls != null){

            response.setCity(pincodeDtls.getCity());
            response.setState(pincodeDtls.getState());
            response.setPincode(pincodeDtls.getPincode());

        }

        return  response;
    }

    @Override
    public CityStateCountryDto fetchCityStateCountry(Long pincode) {

        CityStateCountryDto cityStateCountryRes = new CityStateCountryDto();

        PincodeDetails pincodeDtls = pinCodeDetailsRepo.findByPincode(pincode);

        cityStateCountryRes.setPincode(pincodeDtls.getPincode());

        StateMaster stateMasterVar = stateMasterRepo.findByStateName(pincodeDtls.getState());


        DropDownData stateDropDown = new DropDownData();
        stateDropDown.setLabel(stateMasterVar.getStateName());
        stateDropDown.setValue(stateMasterVar.getStateCode());

        cityStateCountryRes.setState(stateDropDown);

        CityMaster cityMastervar = cityMasterRepo.findByCityNameAndStateName(pincodeDtls.getCity(), pincodeDtls.getState());

        DropDownData cityDropDown =new DropDownData();
        cityDropDown.setLabel(cityMastervar.getCityName());
        cityDropDown.setValue(cityMastervar.getCityCode());

        cityStateCountryRes.setCity(cityDropDown);
        return cityStateCountryRes;


    }
}
