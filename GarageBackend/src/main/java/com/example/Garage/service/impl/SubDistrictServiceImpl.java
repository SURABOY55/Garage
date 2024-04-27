package com.example.Garage.service.impl;

import com.example.Garage.entity.District;
import com.example.Garage.entity.SubDistrict;
import com.example.Garage.repository.DistrictRepository;
import com.example.Garage.repository.SubDistrictRepository;
import com.example.Garage.service.DistrictService;
import com.example.Garage.service.SubDistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubDistrictServiceImpl implements SubDistrictService {

    @Autowired
    private SubDistrictRepository subDistrictRepository;

    @Override
    public Page<SubDistrict> findAllWithPage(Pageable pageable) {
        return subDistrictRepository.findAllWithPage(pageable);
    }

    @Override
    public List<SubDistrict> getAllSubDistrictByDistrictId(long districtId) {
        return subDistrictRepository.getAllSubDistrictByDistrictId(districtId);
    }


}
