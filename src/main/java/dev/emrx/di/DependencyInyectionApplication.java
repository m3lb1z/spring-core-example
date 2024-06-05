package dev.emrx.di;

import dev.emrx.di.atributo.Coche;
import dev.emrx.di.atributo.Motor;
import dev.emrx.di.profiles.EnvironmentService;
import dev.emrx.di.qualifiers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInyectionApplication {

    private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);

    private Animal animal;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
        EnvironmentService env = context.getBean(EnvironmentService.class);
        log.info("Environment: {}", env.getEnvironment());

    }

}
