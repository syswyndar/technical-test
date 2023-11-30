package com.syswyndar.technicaltest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.syswyndar.technicaltest.service.BrandService;
import com.syswyndar.technicaltest.service.CarService;

import jakarta.annotation.PostConstruct;

@Configuration
public class SeederConfig {
    @Autowired
    BrandService brandService;

    @Autowired
    CarService carService;

    @PostConstruct
    public void seedBrand() {
        brandService.seedBrand();
        carService.seedCar();
    }
}
