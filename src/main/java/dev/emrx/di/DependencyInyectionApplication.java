package dev.emrx.di;

import dev.emrx.di.atributo.Coche;
import dev.emrx.di.atributo.Motor;
import dev.emrx.di.profiles.EnvironmentService;
import dev.emrx.di.qualifiers.*;
import dev.emrx.di.scopes.EjemploScopeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DependencyInyectionApplication {

    private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);

    // definiendo beans de forma explicita
    @Bean
    public String getApplicationName() {
        return "Spring Core learning";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
        String nombreDeAplicacion = context.getBean(String.class);

        log.info("Nombre de la aplicación: {}", nombreDeAplicacion);
    }

}
