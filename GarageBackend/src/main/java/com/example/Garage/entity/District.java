package com.example.Garage.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "district")
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class District {

	@Id
	@Column(name = "district_id")
	private Long districtId;

	@Column(name = "name_th")
	private String nameTh;

	@Column(name = "name_en")
	private String nameEn;

	@ManyToOne
	@JoinColumn(name = "province_id")
	private Province province;

	@Column(name = "created_datetime")
	private Date createdDatetime;

	@Column(name = "updated_datetime")
	private Date updatedDatetime;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "updated_by")
	private String updatedBy;


}
