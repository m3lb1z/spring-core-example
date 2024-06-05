package dev.emrx.di.aop;

import org.aspectj.lang.annotation.Pointcut;

public class PointCutExample {


//    @Pointcut("execution(* dev.emrx.di.aop.TargetObject.*(..))")
//    @Pointcut("within(dev.emrx.di.aop.*)")
//    @Pointcut("within(dev.emrx.di.aop.TargetObject)")
//    @Pointcut("within(TargetObject)")
//    @Pointcut("@annotation(dev.emrx.di.aop.CustomAnnotation)")
    @Pointcut("@annotation(CustomAnnotation)")
    public void targetObjectMethods() {
    }

}
