package id.my.hendisantika.springbootcassandracrud.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cassandra-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/12/24
 * Time: 15:43
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class SuperHeroQueryRepositoryImpl implements SuperHeroQueryRepository {

    @Autowired
    private CassandraOperations cassandraTemplate;
}
