package id.my.hendisantika.springbootcassandracrud.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cassandra-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/12/24
 * Time: 15:42
 * To change this template use File | Settings | File Templates.
 */
@Data
@Builder
@Table("super_hero")
public class SuperHero implements Serializable {

    @PrimaryKey
    private Long id;

    private String name;

    @Column("super_name")
    private String superName;

    private String profession;

    private int age;

    @Column("super_powers")
    private SuperPowers superPowers;
}
