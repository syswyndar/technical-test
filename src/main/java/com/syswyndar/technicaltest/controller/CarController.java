package com.syswyndar.technicaltest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syswyndar.technicaltest.model.Brand;
import com.syswyndar.technicaltest.model.Car;
import com.syswyndar.technicaltest.model.interfaces.CarListResponse;
import com.syswyndar.technicaltest.model.interfaces.SaveCarReq;
import com.syswyndar.technicaltest.service.BrandService;
import com.syswyndar.technicaltest.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    BrandService brandService;

    @Autowired
    CarService carService;

    @GetMapping("")
    public ResponseEntity<?> getCar() {
        try {
            CarListResponse resp = new CarListResponse<Car>();

            List<Car> cars = carService.getListCar();

            resp.setCode("0");
            resp.setMessage("Success");
            resp.setData(cars);
            return ResponseEntity.ok(resp);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Internal Server Error");
        }
    }

    

}
