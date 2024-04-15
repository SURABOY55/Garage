package com.example.Garage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {

	@GetMapping(value = "/{id}")
	public @ResponseBody String getBook(@PathVariable int id) {
		return "findBookById(id)";
	}

}
