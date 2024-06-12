package id.my.hendisantika.springbootcassandracrud.service;

import id.my.hendisantika.springbootcassandracrud.model.SuperHero;
import id.my.hendisantika.springbootcassandracrud.repository.SuperHeroQueryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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
@RequiredArgsConstructor
public class SuperHeroQueryServiceImpl implements SuperHeroQueryService {

    private final SuperHeroQueryRepository superHeroQueryRepository;

    @Override
    public List<SuperHero> save() {
        return superHeroQueryRepository.save();
    }


}
