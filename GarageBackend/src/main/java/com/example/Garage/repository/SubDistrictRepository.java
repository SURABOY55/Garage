package com.example.Garage.repository;

import com.example.Garage.entity.District;
import com.example.Garage.entity.SubDistrict;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubDistrictRepository extends JpaRepository<SubDistrict,Long> {

	@Query(value = "SELECT * FROM SUB_DISTRICT " ,
			countQuery = "SELECT COUNT(*) FROM SUB_DISTRICT " ,
			nativeQuery = true)
	Page<SubDistrict> findAllWithPage(Pageable pageable);

	@Query(value = "SELECT * from SUB_DISTRICT d WHERE d.district_id = :districtId" , nativeQuery = true)
	List<SubDistrict> getAllSubDistrictByDistrictId(Long districtId);
}