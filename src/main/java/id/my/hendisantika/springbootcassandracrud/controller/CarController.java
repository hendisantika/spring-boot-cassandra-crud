package id.my.hendisantika.springbootcassandracrud.controller;

import id.my.hendisantika.springbootcassandracrud.model.Car;
import id.my.hendisantika.springbootcassandracrud.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
