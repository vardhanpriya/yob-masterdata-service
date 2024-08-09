package com.service.masterdata.repository;

import com.service.masterdata.entities.CityMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityMasterRepo extends JpaRepository<CityMaster,Long> {
        CityMaster findByCityName(String cityName);

        CityMaster findByCityNameAndStateName(String cityName, String stateName);
}
