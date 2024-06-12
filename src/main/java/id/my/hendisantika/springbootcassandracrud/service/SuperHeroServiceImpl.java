package id.my.hendisantika.springbootcassandracrud.service;

import id.my.hendisantika.springbootcassandracrud.model.SuperHero;
import id.my.hendisantika.springbootcassandracrud.repository.SuperHeroRepository;
import id.my.hendisantika.springbootcassandracrud.util.HelperUtil;
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
 * Time: 15:54
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class SuperHeroServiceImpl implements SuperHeroService {

    private final SuperHeroRepository repository;

    @Override
    public List<SuperHero> save() {
        List<SuperHero> superHeroes = repository.findAll();
        if (superHeroes.isEmpty())
            repository.saveAll(HelperUtil.getSuperHeroesData());

        return repository.findAll();
    }

    @Override
    public List<SuperHero> findAll() {
        return repository.findAll();
    }

    @Override
    public SuperHero findById(Long id) {
        return repository.findById(id).orElse(SuperHero.builder().build());
    }

    @Override
    public SuperHero save(SuperHero superHero) {
        return repository.save(superHero);
    }

    @Override
    public SuperHero update(SuperHero superHero) {
        return repository.save(superHero);
    }

    @Override
    public void delete(Long id) {
        repository.findById(id).ifPresent(superHero -> repository.delete(superHero));
    }
}
