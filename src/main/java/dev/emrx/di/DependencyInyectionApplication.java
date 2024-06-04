package dev.emrx.di;

import dev.emrx.di.atributo.Coche;
import dev.emrx.di.atributo.Motor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInyectionApplication {

    public static void main(String[] args) {
//        Motor motor = new Motor("Xl1", 1981);
//        Coche coche = new Coche("VW", 1986, motor);
        ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
        Coche coche = context.getBean(Coche.class);

        System.out.println(coche);
    }

}
