package id.my.hendisantika.springbootcassandracrud.util;

import id.my.hendisantika.springbootcassandracrud.model.SuperHero;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cassandra-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/12/24
 * Time: 15:46
 * To change this template use File | Settings | File Templates.
 */
public class HelperUtil {
    private HelperUtil() {
    }

    public static List<SuperHero> getSuperHeroesData() {
        return superHeroesSupplier.get();
    }
}
