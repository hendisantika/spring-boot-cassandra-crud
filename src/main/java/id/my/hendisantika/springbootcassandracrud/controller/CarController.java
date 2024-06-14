package id.my.hendisantika.springbootcassandracrud.controller;

import id.my.hendisantika.springbootcassandracrud.model.Car;
import id.my.hendisantika.springbootcassandracrud.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cassandra-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/14/24
 * Time: 08:53
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
public class CarController {

    private final CarService carservice;

    @GetMapping()
    public ResponseEntity<List<Car>> getAllCars() {
        return new ResponseEntity<>(carservice.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable("id") String id) {
        return new ResponseEntity<>(carservice.findById(UUID.fromString(id)), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        return new ResponseEntity<>(carservice.saveCar(car), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Car> updateCar(@PathVariable("id") String id, @RequestBody Car car) {
        if (carservice.existById(UUID.fromString(id))) {
            return new ResponseEntity<>(carservice.saveCar(car), HttpStatus.ACCEPTED);
        }

        throw new IllegalArgumentException("Car with id " + id + "not found");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCar(@PathVariable("id") String id) {
        carservice.deleteCar(UUID.fromString(id));

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
