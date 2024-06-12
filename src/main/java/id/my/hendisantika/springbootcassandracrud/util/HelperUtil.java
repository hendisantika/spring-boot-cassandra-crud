package id.my.hendisantika.springbootcassandracrud.util;

import id.my.hendisantika.springbootcassandracrud.model.SuperHero;
import id.my.hendisantika.springbootcassandracrud.model.SuperPowers;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

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

    private static final Supplier<List<SuperHero>> superHeroesSupplier = () ->
            Arrays.asList(
                    SuperHero.builder().id(1L).name("Bruce").superName("Hulk").profession("Doctor").age(50)
                            .superPowers(SuperPowers.builder().strength("Body").durability("Week").canFly(false).build()).build(),

                    SuperHero.builder().id(2L).name("Tony").superName("Iron Man").profession("Business man").age(45)
                            .superPowers(SuperPowers.builder().strength("Suit").durability("Month").canFly(true).build()).build(),

                    SuperHero.builder().id(3L).name("Peter").superName("Spider Man").profession("Student").age(21)
                            .superPowers(SuperPowers.builder().strength("Spider sense").durability("Lifelong").canFly(true).build()).build()
            );
}
