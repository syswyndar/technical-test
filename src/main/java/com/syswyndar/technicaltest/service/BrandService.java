package com.syswyndar.technicaltest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.syswyndar.technicaltest.model.Brand;
import com.syswyndar.technicaltest.repo.BrandRepository;

@Service
public class BrandService {

    @Autowired
    BrandRepository repo;

    private Brand setupBrand(String brand_name) {
        Brand brand = new Brand();
        brand.setBrand_name(brand_name);
        return brand;
    }

    public void seedBrand() {
        if (!repo.findAll().isEmpty()) {
            return;
        }

        List<Brand> brands = new ArrayList<Brand>();
        brands.add(setupBrand("Honda"));
        brands.add(setupBrand("Toyota"));
        brands.add(setupBrand("BMW"));
        brands.add(setupBrand("Mercedez Benz"));
        brands.add(setupBrand("Ford"));

        repo.saveAll(brands);
    }

    public Brand getBrandById(Long brand_id) {
        return repo.findById(brand_id).orElse(null);
    }

    public Brand createBrand(Brand brand) {
        return repo.save(brand);
    }

    public List<Brand> getListBrand() {
        return repo.findAll();
    }

    public Brand getBrandByBody(Brand brand) {
        Example<Brand> role = Example.of(brand);
        Optional<Brand> resp = repo.findOne(role);

        if (resp.isPresent()) {
            return resp.get();
        }

        return null;
    }

}
