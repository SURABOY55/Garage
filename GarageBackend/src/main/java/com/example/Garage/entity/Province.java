package com.example.Garage.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "province")
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class Province {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "province_id")
	private Long provinceId;

	@Column(name = "name_th")
	private String nameTh;

	@Column(name = "name_en")
	private String nameEn;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_datetime")
	private Date createdDatetime;

	@Column(name = "updated_by")
	private String updatedBy;

	@Column(name = "updated_datetime")
	private Date updatedDatetime;


}
