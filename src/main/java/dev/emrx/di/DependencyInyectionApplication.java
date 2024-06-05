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

@SpringBootApplication
public class DependencyInyectionApplication {

    private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);

    private Animal animal;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
        EjemploScopeService ejemploScopeService1 = context.getBean(EjemploScopeService.class);
        EjemploScopeService ejemploScopeService2 = context.getBean(EjemploScopeService.class);

        log.info("Are beans equal {}", ejemploScopeService1.equals(ejemploScopeService2));
        log.info("Are beans == {}", ejemploScopeService1 == ejemploScopeService2);

    }

}
