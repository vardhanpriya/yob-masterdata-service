package com.service.masterdata.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "CITY_MASTER")
public class CityMaster {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "CITY_NAME")
    private String cityName;

    @Column(name = "CITY_CODE")
    private String cityCode;

    @Column(name = "STATE_NAME")
    private String stateName;

    @Column(name = "COUNTRY")
    private String country;

}


