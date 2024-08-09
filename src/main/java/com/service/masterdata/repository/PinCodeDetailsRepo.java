package com.service.masterdata.repository;

import com.service.masterdata.dto.PincodeDetailsDto;
import com.service.masterdata.entities.PincodeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PinCodeDetailsRepo extends JpaRepository<PincodeDetails,Long> {

    PincodeDetails findByPincode(Long pincode);


}
