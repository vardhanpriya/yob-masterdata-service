package com.service.masterdata.repository;

import com.service.masterdata.entities.StateMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateMasterRepo extends JpaRepository<StateMaster, Long> {

    StateMaster findByStateName(String stateName);
}
