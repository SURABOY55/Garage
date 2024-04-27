package com.example.Garage.controller;

import com.example.Garage.entity.Province;
import com.example.Garage.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("province")
public class ProvinceController {

	@Autowired
	private ProvinceService provinceService;

	@GetMapping("/getData")
	public ResponseEntity<Page<Province>> getData(
			@RequestParam(required = false, defaultValue = "0") int page,
			@RequestParam(required = false, defaultValue = "3") int pageSize) {
		Pageable pageable = PageRequest.of(page, pageSize, Sort.by("province_id").ascending());
		return ResponseEntity.ok(provinceService.findAllWithPage(pageable));
	}

	@GetMapping("/getAllProvince")
	public ResponseEntity<List<Province>> getAllProvince() {
		return ResponseEntity.ok(provinceService.findAllProvince());
	}

	@GetMapping("/getProvinceByProvinceId")
	public ResponseEntity<Province> getProvinceByProvinceId(
			@RequestParam(required = true) long id) {
		return ResponseEntity.ok(provinceService.findById(id));
	}
}
