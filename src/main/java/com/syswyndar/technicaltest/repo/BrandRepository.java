package com.syswyndar.technicaltest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.syswyndar.technicaltest.model.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {

}
