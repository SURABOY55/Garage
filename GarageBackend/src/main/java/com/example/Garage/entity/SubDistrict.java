package com.example.Garage.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "sub_district")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class SubDistrict {

    @Id
    @Column(name = "sub_district_id")
    private Long subDistrictId;

    @Column(name = "zip_code")
    private int zipCode;

    @Column(name = "name_th")
    private String nameTh;

    @Column(name = "name_en")
    private String nameEn;

    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district;

    @Column(name = "created_datetime")
    private Date createdDatetime;

    @Column(name = "updated_datetime")
    private Date updatedDatetime;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_by")
    private String updatedBy;
}
