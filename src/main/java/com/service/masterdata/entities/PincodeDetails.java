package com.service.masterdata.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "Pincode_Details")
public class PincodeDetails {

    @Id
    @Column(name = "Pincode")
    private Long pincode;

    @Column(name = "City")
    private String city;

    @Column(name = "State")
    private String state;


}

