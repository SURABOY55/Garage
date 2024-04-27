package com.example.Garage.controller;

import com.example.Garage.entity.District;
import com.example.Garage.entity.SubDistrict;
import com.example.Garage.service.DistrictService;
import com.example.Garage.service.SubDistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("subDistrict")
public class SubDistrictController {

	@Autowired
	private SubDistrictService subDistrictService;

	@GetMapping("/getData")
	public ResponseEntity<Page<SubDistrict>> getData(
			@RequestParam(required = false, defaultValue = "0") int page,
			@RequestParam(required = false, defaultValue = "3") int pageSize) {
		Pageable pageable = PageRequest.of(page, pageSize, Sort.by("sub_district_id").ascending());
		return ResponseEntity.ok(subDistrictService.findAllWithPage(pageable));
	}

	@GetMapping("/getAllSubDistrictByDistrictId")
	public ResponseEntity<List<SubDistrict>> getAllSubDistrictByDistrictId(
			@RequestParam(required = true) long id) {
		return ResponseEntity.ok(subDistrictService.getAllSubDistrictByDistrictId(id));
	}
}
