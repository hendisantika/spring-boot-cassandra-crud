package id.my.hendisantika.springbootcassandracrud;

import id.my.hendisantika.springbootcassandracrud.model.SuperHero;
import id.my.hendisantika.springbootcassandracrud.repository.SuperHeroRepository;
import id.my.hendisantika.springbootcassandracrud.util.HelperUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

import java.util.List;

@Slf4j
@SpringBootApplication
@EnableCassandraRepositories
public class SpringBootCassandraCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCassandraCrudApplication.class, args);
    }

//    @Autowired
//    private SuperHeroRepository superHeroRepository;

    @Bean
    CommandLineRunner runner(SuperHeroRepository superHeroRepository) {
        return args -> {
            List<SuperHero> superHeroes = superHeroRepository.findAll();
            if (superHeroes.isEmpty()) {
                log.info("******* Inserting Super heroes to DB *******");
                superHeroRepository.saveAll(HelperUtil.getSuperHeroesData());
            } else {
                log.info("******* Super heroes stored in DB Size :: {}", superHeroes.size());
                log.info("******* Super heroes stored in DB :: {}", superHeroes);
            }
        };
    }
}
