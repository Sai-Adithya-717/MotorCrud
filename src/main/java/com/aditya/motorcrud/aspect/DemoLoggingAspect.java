package com.aditya.motorcrud.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class DemoLoggingAspect {
    private Logger myLogger = Logger.getLogger(getClass().getName());

    @Pointcut("execute(* com.aditya.motorcrud.controller.*.*(..))")
    private void forController() {}

    @Pointcut("execute(* com.aditya.motorcrud.service.*.*(..))")
    private void forService() {}

    @Pointcut("execute(* com.aditya.motorcrud.Dao.*.*(..))")
    private void forDao() {}

    @Pointcut("forController() || forService() || forDao()")
    private void forAppFlow() {}

    @Before("forAppFlow()")
    public void before(JoinPoint theJoinPoint) {
        String theMethod = theJoinPoint.getSignature().toShortString();
        myLogger.info("===>> in @Before: calling method: " + theMethod);
        Object[] args = theJoinPoint.getArgs();
        for (Object tempArg : args){
            myLogger.info("===>> argument: " + tempArg);
        }
    }

    @AfterReturning(pointcut = "forAppFlow",
    returning = "theResult")
    public void afterReturning(JoinPoint theJoinPoint, Object theResult){
        String theMethod = theJoinPoint.getSignature().toShortString();
        myLogger.info("===>> in @AfterReturning: from method: " + theMethod);
        myLogger.info("===>> argument: " + theResult);
    }
}
