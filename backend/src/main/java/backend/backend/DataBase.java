package backend.backend;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import backend.backend.entity.Users;
import backend.backend.ropository.UsersRepository;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Configuration
public class DataBase {
    private static final Logger log = LoggerFactory.getLogger(DataBase.class);

    @Bean
    CommandLineRunner initDatabase(UsersRepository repository){
        return (args) -> {
            log.info("Preloading " + repository.save(new Users("Name")));
            log.info("Preloading " + repository.save(new Users("Neab")));
        };
    }
}
