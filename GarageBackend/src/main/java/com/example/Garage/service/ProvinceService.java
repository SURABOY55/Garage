package com.example.Garage.service;

import com.example.Garage.entity.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public interface ProvinceService {

	public Page<Province> findAllWithPage(Pageable pageable);
	public List<Province> findAllProvince();
	public Province findById(long id);

}
