package id.my.hendisantika.springbootcassandracrud.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

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
@UserDefinedType("super_powers")
public class SuperPowers implements Serializable {

    private String strength;

    private String durability;

    private boolean canFly;
}
