package id.my.hendisantika.springbootcassandracrud.repository;

import id.my.hendisantika.springbootcassandracrud.model.SuperHero;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cassandra-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/12/24
 * Time: 15:45
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface SuperHeroRepository extends CassandraRepository<SuperHero, Long> {
}
