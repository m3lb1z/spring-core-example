package dev.emrx.di.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")  // default scope singleton
@Lazy(false) // default singleton is eager
public class LifeCycleBean implements BeanNameAware, InitializingBean, DisposableBean {

    private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);

    @Override
    public void setBeanName(String name) {
        log.info("1 Bean name is: {} by implementing BeanNameAware", name);
    }

    /**
     * Se ejecutara despues de la inyección de dependencias
     */
    @PostConstruct
    public void initBean() {
        log.info("3 Post construct method called");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("4 After properties set method called by implementing InitializingBean interface");
    }

    /**
     * Se ejecutará antes de que el bean sea destruido
     * No se ejecutará para beans prototype
     * Solo se ejecutará durante una terminación normal
     */
    @PreDestroy
    public void destroyBean() {
        log.info("6 Pre destroy method called");
    }

    @Override
    public void destroy() throws Exception {
        log.info("7 Destroy method called by implementing DisposableBean interface");
    }
}
