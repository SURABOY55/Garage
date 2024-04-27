package com.example.Garage.repository;

import com.example.Garage.entity.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends JpaRepository<Province,Long> {

	@Query(value = "SELECT * FROM PROVINCE " ,
			countQuery = "SELECT COUNT(*) FROM PROVINCE " ,
			nativeQuery = true)
	Page<Province> findAllWithPage(Pageable pageable);

	@Query(value = "SELECT * from PROVINCE p WHERE p.province_id = :provinceId" , nativeQuery = true)
	Province getProvinceByProvinceId(Long provinceId);

}