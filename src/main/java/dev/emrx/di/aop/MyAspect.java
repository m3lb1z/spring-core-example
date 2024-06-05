package dev.emrx.di.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Modifier;

@Component
@Aspect
@Order(1)
public class MyAspect {

    private static final Logger log = LoggerFactory.getLogger(MyAspect.class);

//    @Before(value = "execution(* dev.emrx.di.aop.TargetObject.*(..))")
    @Before("PointCutExample.targetObjectMethods()")
    public void before(JoinPoint joinPoint) {
        log.info("Method name {}", joinPoint.getSignature().getName());
        log.info("Object type {}", joinPoint.getSignature().getDeclaringTypeName());
        log.info("Modifiers {}", joinPoint.getSignature().getModifiers());
        log.info("Is public {}", Modifier.isPublic(joinPoint.getSignature().getModifiers()));
        log.info("Arguments {}", joinPoint.getArgs());
        log.info("Before advice");
    }

}
