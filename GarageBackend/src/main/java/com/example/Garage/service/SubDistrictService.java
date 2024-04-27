package com.example.Garage.service;

import com.example.Garage.entity.District;
import com.example.Garage.entity.SubDistrict;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SubDistrictService {

	public Page<SubDistrict> findAllWithPage(Pageable pageable);
	public List<SubDistrict> getAllSubDistrictByDistrictId(long districtId);

}
