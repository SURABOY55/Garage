package com.example.Garage.entity;

import com.example.Garage.model.UserRoleModel;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "user")
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "username")
	private String username;

	@Column(name = "email")
	private String email;

	@Column(name = "full_name")
	private String fullName;

	@Column(name = "password")
	private String password;

	@Enumerated(EnumType.STRING)
	private UserRoleModel appUserRole;
}
