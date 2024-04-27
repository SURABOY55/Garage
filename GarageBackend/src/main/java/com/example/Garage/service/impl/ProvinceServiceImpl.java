package com.example.Garage.service.impl;

import com.example.Garage.entity.Province;
import com.example.Garage.repository.ProvinceRepository;
import com.example.Garage.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ProvinceServiceImpl implements ProvinceService {

	@Autowired
	private ProvinceRepository provinceRepository;

	@Override
	public Page<Province> findAllWithPage(Pageable pageable) {
		return provinceRepository.findAllWithPage(pageable);
	}

	@Override
	public List<Province> findAllProvince() {
		return  provinceRepository.findAll();
	}

	@Override
	public Province findById(long id) {
		return provinceRepository.getProvinceByProvinceId(id);
	}


}
