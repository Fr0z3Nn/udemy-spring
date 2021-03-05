package ru.project.spring.AOP.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
    @Before("Pointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println(methodSignature);
        System.out.println(methodSignature.getReturnType());
        System.out.println(methodSignature.getMethod());
        System.out.println(methodSignature.getName());
        Object[] arguments = joinPoint.getArgs();
        System.out.println(Arrays.toString(arguments));
        System.out.println("beforeGetBookAdvice: логирование попытки получения книги/журнала");
    }
}
