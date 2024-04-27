package com.example.Garage.service.impl;

import com.example.Garage.entity.District;
import com.example.Garage.repository.DistrictRepository;
import com.example.Garage.service.DistrictService;
import com.example.Garage.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {

    @Autowired
    private DistrictRepository districtRepository;

    @Override
    public Page<District> findAllWithPage(Pageable pageable) {
        return districtRepository.findAllWithPage(pageable);
    }

    @Override
    public List<District> getAllDistrictByProvinceId(long provinceId) {
        return districtRepository.getAllDistrictByProvinceId(provinceId);
    }


}
