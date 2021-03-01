package ru.project.spring.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("dogBean")
//@Scope
public class Dog implements Pet{

    public Dog() {
        System.out.println("Dog bean created");
    }

    @Override
    public void say(){
        System.out.println("Wow-Wow");
    }
    @PostConstruct
    private void init(){
        System.out.println("Class dog: init method");
    }
    @PreDestroy
    protected void destroy(){
        System.out.println("Class dog: destroy method");
    }
}
