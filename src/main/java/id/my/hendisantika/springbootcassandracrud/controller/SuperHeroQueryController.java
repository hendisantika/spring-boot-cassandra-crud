package id.my.hendisantika.springbootcassandracrud.controller;

import id.my.hendisantika.springbootcassandracrud.service.SuperHeroQueryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
 * Time: 15:57
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@RestController
@RequestMapping("/super-heroes-query")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
@Tag(name = "Superhero Query controller", description = "Get Superhero APIs using Queries")
public class SuperHeroQueryController {

    private final SuperHeroQueryService superHeroQueryService;
}
