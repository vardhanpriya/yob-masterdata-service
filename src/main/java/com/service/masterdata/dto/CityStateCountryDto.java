package com.service.masterdata.dto;

import lombok.Data;

@Data
public class CityStateCountryDto {

    private  Long pincode;
    private DropDownData city;

    private  DropDownData state;

    private DropDownData country;
}
