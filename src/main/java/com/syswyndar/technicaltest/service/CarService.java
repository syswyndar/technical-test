package com.syswyndar.technicaltest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syswyndar.technicaltest.model.Car;
import com.syswyndar.technicaltest.repo.CarRepository;

@Service
public class CarService {
    
    @Autowired
    CarRepository carRepo;

    @Autowired
    BrandService brandService;
    

    private Car setupCar(String car_name, Long brand_id) {
        Car car = new Car();
        car.setCar_name(car_name);
        car.setBrand_id(brand_id);
        return car;
    }

    public void seedCar() {
        if(!carRepo.findAll().isEmpty()) {
            return;
        }

        List<Car> cars = new ArrayList<Car>();

        cars.add(setupCar("CR-V Hybrid", Long.valueOf(1)));
        cars.add(setupCar("Accord Hybrid", Long.valueOf(1)));
        cars.add(setupCar("All New Alphard HEV", Long.valueOf(2)));
        cars.add(setupCar("All New Veloz", Long.valueOf(2)));
        cars.add(setupCar("BMW X1", Long.valueOf(3)));
        cars.add(setupCar("BMW X3 M", Long.valueOf(3)));
        cars.add(setupCar("GLA 200 AMG Line", Long.valueOf(4)));
        cars.add(setupCar("GLB 200 Progressive Line", Long.valueOf(4)));
        cars.add(setupCar("Ford Ranger", Long.valueOf(5)));
        cars.add(setupCar("Ford Everest", Long.valueOf(5)));

        carRepo.saveAll(cars);

    }

    public Car createCar(Car car) {
        return carRepo.save(car);
    }

    public List<Car> getListCar() {
        return carRepo.findAll();
    }
}
