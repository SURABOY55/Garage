package com.example.Garage.service;

import com.example.Garage.entity.District;
import com.example.Garage.entity.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DistrictService {

	public Page<District> findAllWithPage(Pageable pageable);
	public List<District> getAllDistrictByProvinceId(long provinceId);

}
