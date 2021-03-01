package ru.project.spring.spring_introduction;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet{

    public Dog() {
        System.out.println("Dog bean created");
    }

    @Override
    public void say(){
        System.out.println("Wow-Wow");
    }
    private void init(){
        System.out.println("Class dog: init method");
    }
    protected void destroy(){
        System.out.println("Class dog: destroy method");
    }
}
