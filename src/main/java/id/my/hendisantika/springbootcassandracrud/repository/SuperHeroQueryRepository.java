package id.my.hendisantika.springbootcassandracrud.repository;

import id.my.hendisantika.springbootcassandracrud.model.SuperHero;

import java.util.List;

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
public interface SuperHeroQueryRepository {

    List<SuperHero> save();

    List<SuperHero> getAll();

    List<SuperHero> getSuperHeroByName(String name);

    SuperHero getOneSuperHeroByName(String name);

    List<SuperHero> getSuperHeroByNameLike(String name);

    SuperHero getSingleSuperHeroBySuperName(String superName);

    List<SuperHero> getSuperHeroByAgeGreaterThan(int age);

    List<SuperHero> getSuperHeroWhoCanFly(boolean canFly);
}
