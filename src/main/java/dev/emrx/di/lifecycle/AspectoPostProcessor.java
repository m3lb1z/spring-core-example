package dev.emrx.di.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class AspectoPostProcessor implements BeanPostProcessor {

    private static final Logger log = LoggerFactory.getLogger(AspectoPostProcessor.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof LifeCycleBean) // filtrar llamado a solo Bean LifeCycleBean
            log.info("2 Before initialization of bean: {} by implementing BeanPostProcessor", beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof LifeCycleBean) // filtrar llamado a solo Bean LifeCycleBean
            log.info("5 After initialization of bean: {} by implementing BeanPostProcessor", beanName);
        return bean;
    }
}
