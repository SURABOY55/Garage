package com.example.Garage.repository;

import com.example.Garage.entity.District;
import com.example.Garage.entity.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistrictRepository extends JpaRepository<District,Long> {

	@Query(value = "SELECT * FROM DISTRICT " ,
			countQuery = "SELECT COUNT(*) FROM DISTRICT " ,
			nativeQuery = true)
	Page<District> findAllWithPage(Pageable pageable);

	@Query(value = "SELECT * from DISTRICT d WHERE d.province_id = :provinceId" , nativeQuery = true)
	List<District> getAllDistrictByProvinceId(Long provinceId);
}