package com.example.Garage.controller;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("province")
public class ProvinceController {

	@GetMapping("/getData")
	public ResponseEntity<Page<GetDataTopicResponseModel>> getDataTopic(
			@RequestParam(required = false, defaultValue = "0") int page,
			@RequestParam(required = false, defaultValue = "3") int pageSize) {

		Pageable pageable = PageRequest.of(page, pageSize, Sort.by("id").ascending());

		return ResponseEntity.ok(topicService.findAll(pageable));
	}
}
