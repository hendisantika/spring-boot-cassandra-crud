package id.my.hendisantika.springbootcassandracrud.service;

import id.my.hendisantika.springbootcassandracrud.model.Car;
import id.my.hendisantika.springbootcassandracrud.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cassandra-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/14/24
 * Time: 08:52
 * To change this template use File | Settings | File Templates.
 */
@AllArgsConstructor
@Service
public class CarService {

    private final CarRepository carRepository;

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Car findById(UUID uuid) {
        return carRepository.findById(uuid).orElseThrow(NoSuchElementException::new);
    }

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    public void deleteCar(UUID uuid) {
        carRepository.deleteById(uuid);
    }

    public Car updateCar(Car car) {
        return carRepository.save(car);
    }

    public boolean existById(UUID uuid) {
        return carRepository.existsById(uuid);
    }
}
