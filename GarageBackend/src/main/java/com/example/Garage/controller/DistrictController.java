package com.example.Garage.controller;

import com.example.Garage.entity.District;
import com.example.Garage.entity.Province;
import com.example.Garage.service.DistrictService;
import com.example.Garage.service.ProvinceService;
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
@RequestMapping("district")
public class DistrictController {

	@Autowired
	private DistrictService districtService;

	@GetMapping("/getData")
	public ResponseEntity<Page<District>> getData(
			@RequestParam(required = false, defaultValue = "0") int page,
			@RequestParam(required = false, defaultValue = "3") int pageSize) {
		Pageable pageable = PageRequest.of(page, pageSize, Sort.by("district_id").ascending());
		return ResponseEntity.ok(districtService.findAllWithPage(pageable));
	}

	@GetMapping("/getAllDistrictByProvinceId")
	public ResponseEntity<List<District>> getAllDistrictByProvinceId(
			@RequestParam(required = true) long id) {
		return ResponseEntity.ok(districtService.getAllDistrictByProvinceId(id));
	}
}
