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
@Order(0)
public class MyAspectTwo {

    private static final Logger log = LoggerFactory.getLogger(MyAspectTwo.class);

//    @Before(value = "execution(* dev.emrx.di.aop.TargetObject.*(..))")
    @Before("PointCutExample.targetObjectMethods()")
    public void before(JoinPoint joinPoint) {
        log.info("2 Method name {}", joinPoint.getSignature().getName());
        log.info("2 Object type {}", joinPoint.getSignature().getDeclaringTypeName());
        log.info("2 Modifiers {}", joinPoint.getSignature().getModifiers());
        log.info("2 Is public {}", Modifier.isPublic(joinPoint.getSignature().getModifiers()));
        log.info("2 Arguments {}", joinPoint.getArgs());
        log.info("2 Before advice");
    }

}
