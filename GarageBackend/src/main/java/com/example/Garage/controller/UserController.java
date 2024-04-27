package com.example.Garage.controller;

import com.example.Garage.entity.User;
import com.example.Garage.model.request.UserDataRequestModel;
import com.example.Garage.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@Valid @RequestBody UserDataRequestModel request) {
		User user = new User();
		BeanUtils.copyProperties(request, user);
		return ResponseEntity.ok(userService.registerNewUser(user));
	}



}
