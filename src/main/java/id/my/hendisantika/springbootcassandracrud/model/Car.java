package id.my.hendisantika.springbootcassandracrud.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cassandra-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/14/24
 * Time: 08:48
 * To change this template use File | Settings | File Templates.
 */
@Table
@Getter
@Setter
public class Car {
    @PrimaryKey
    private UUID id;

    private String model;

    private String description;

    private String color;
}
