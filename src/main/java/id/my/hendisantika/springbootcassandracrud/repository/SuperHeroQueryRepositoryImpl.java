package id.my.hendisantika.springbootcassandracrud.repository;

import id.my.hendisantika.springbootcassandracrud.model.SuperHero;
import id.my.hendisantika.springbootcassandracrud.util.HelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.query.Criteria;
import org.springframework.data.cassandra.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<SuperHero> save() {
        List<SuperHero> superHeroes = cassandraTemplate.select(Query.empty(), SuperHero.class);
        if (superHeroes.isEmpty())
            cassandraTemplate.insert(HelperUtil.getSuperHeroesData());

        return cassandraTemplate.select(Query.empty(), SuperHero.class);
    }

    @Override
    public List<SuperHero> getAll() {
        return cassandraTemplate.select(Query.empty(), SuperHero.class);
    }

    @Override
    public List<SuperHero> getSuperHeroByName(String name) {
        return cassandraTemplate.select(Query.query(Criteria.where("name").is(name)).withAllowFiltering(), SuperHero.class);
    }

    @Override
    public SuperHero getOneSuperHeroByName(String name) {
        return cassandraTemplate.selectOne(Query.query(Criteria.where("name").is(name)).withAllowFiltering(), SuperHero.class);
    }

    @Override
    public List<SuperHero> getSuperHeroByNameLike(String name) {
        return cassandraTemplate.select(Query.query(Criteria.where("name").like(name)).withAllowFiltering(), SuperHero.class);
    }

    @Override
    public SuperHero getSingleSuperHeroBySuperName(String superName) {
        return cassandraTemplate.selectOne(Query.query(Criteria.where("super_name").is(superName)).withAllowFiltering(), SuperHero.class);
    }

    @Override
    public List<SuperHero> getSuperHeroByAgeGreaterThan(int age) {
        return cassandraTemplate.select(Query.query(Criteria.where("age").gt(age)).withAllowFiltering(), SuperHero.class);
    }

    @Override
    public List<SuperHero> getSuperHeroWhoCanFly(boolean canFly) {
        List<SuperHero> superHeroList = cassandraTemplate.select(Query.empty(), SuperHero.class);
        return superHeroList.stream().filter(superHero -> superHero.getSuperPowers().isCanFly() == canFly).collect(Collectors.toList());
    }
}
