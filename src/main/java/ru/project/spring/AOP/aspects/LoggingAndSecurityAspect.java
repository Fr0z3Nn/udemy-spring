package ru.project.spring.AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

  /*  @Before("execution(public * return*())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
    }*/

   /* @Pointcut("execution(* get*())")
    private void allGetMethods() {
    }

    @Pointcut("execution(* return*())")
    private void allReturnMethods() {
    }

    @Pointcut("allGetMethods() || allReturnMethods()")
    private void allGetAndReturnMethods() {
    }

    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing log#1");
    }

    @Before("allReturnMethods()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing log#2");
    }

    @Before("allGetAndReturnMethods()")
    public void beforeGetAndReturnLoggingAdvice() {
        System.out.println("beforeGetAndReturnLoggingAdvice: writing log#3");
    }*/
}
