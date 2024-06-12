package id.my.hendisantika.springbootcassandracrud.service;

import id.my.hendisantika.springbootcassandracrud.repository.SuperHeroQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cassandra-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/12/24
 * Time: 15:52
 * To change this template use File | Settings | File Templates.
 */
@Service
public class SuperHeroQueryServiceImpl implements SuperHeroQueryService {

    @Autowired
    private SuperHeroQueryRepository superHeroQueryRepository;

}
