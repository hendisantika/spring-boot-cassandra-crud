package id.my.hendisantika.springbootcassandracrud.repository;

import id.my.hendisantika.springbootcassandracrud.model.Car;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cassandra-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/14/24
 * Time: 08:51
 * To change this template use File | Settings | File Templates.
 */
public interface CarRepository extends CassandraRepository<Car, UUID> {
    List<Car> findByModel(String model);
}
