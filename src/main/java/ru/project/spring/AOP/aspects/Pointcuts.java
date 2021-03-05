package ru.project.spring.AOP.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {
    @Pointcut("execution(* add*(..))")
    public void allAddMethods(){}
}
