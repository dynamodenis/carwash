package com.carwash.carwash.web;

import com.carwash.carwash.model.Car;
import com.carwash.carwash.model.Driver;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/carwash")
public class CarwashController {

    @RequestMapping("/cars")
    public List<Car> getCars(){
        List<Car> cars = new ArrayList<Car>();

        Driver driver1 = new Driver(1,"Denis", "Mbugua", "099999", "Kenya");
        Driver driver2 = new Driver(2,"DOug", "Nje", "099999", "Uganda");

        Car car1 = new Car(1, "Audi", "Black", driver1, "2012");
        Car car2 = new Car(2, "Benz", "White", driver2, "2019");

        cars.add(car1);
        cars.add(car2);

        return cars;
    }

    @RequestMapping("/car/{id}")
    public ResponseEntity<Car> getCar(@PathVariable("id") int id){
        List<Car> cars = new ArrayList<Car>();

        Driver driver1 = new Driver(1,"Denis", "Mbugua", "099999", "Kenya");
        Driver driver2 = new Driver(2,"DOug", "Nje", "099999", "Uganda");

        Car car1 = new Car(1, "Audi", "Black", driver1, "2012");
        Car car2 = new Car(2, "Benz", "White", driver2, "2019");

        cars.add(car1);
        cars.add(car2);

        return ResponseEntity.ok(cars.get(id));
    }

    @RequestMapping("/ford")
    public ModelAndView fordCar(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "Ford Mustang");
        modelAndView.setViewName("ford");

        return modelAndView;
    }
}
