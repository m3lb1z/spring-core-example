package dev.emrx.di.qualifiers;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Granja {

    private static final Logger log = LoggerFactory.getLogger(Granja.class);
    @Autowired
    @Qualifier("pajaro")
    private Animal animal;

    public void imprimir() {
        log.info("Mi granja tiene al animal {}", animal.getNombre());
    }

}
