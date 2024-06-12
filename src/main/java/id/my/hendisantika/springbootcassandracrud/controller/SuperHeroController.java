package id.my.hendisantika.springbootcassandracrud.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cassandra-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/12/24
 * Time: 15:48
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/super-heroes")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
@Tag(name = "Superhero JPA controller", description = "Superhero CRUD API with documentation annotations")
public class SuperHeroController {

    private final SuperHeroService superHeroService;
}
