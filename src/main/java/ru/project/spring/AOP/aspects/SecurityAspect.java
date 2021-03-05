package ru.project.spring.AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
   // @Before("Pointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: проверка прав на получении книги или журнала");
    }
}
