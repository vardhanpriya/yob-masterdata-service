package com.service.masterdata.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "STATE_MASTER")
public class StateMaster {

    @Id
    @Column(name="ID")
    private Long id;
    @Column(name = "STATE_NAME")
    private String stateName;

    @Column(name = "STATE_CODE")
    private String stateCode;

    @Column(name = "COUNTRY")
    private String country;


}

