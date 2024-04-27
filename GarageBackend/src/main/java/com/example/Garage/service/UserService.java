package com.example.Garage.service;

import com.example.Garage.entity.District;
import com.example.Garage.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {

	User registerNewUser(User user);

	List<User> findAll();

}
