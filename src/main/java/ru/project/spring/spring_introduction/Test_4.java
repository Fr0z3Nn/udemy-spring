package ru.project.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Pet myDog = context.getBean("myPet", Pet.class);
        Pet yourDog = context.getBean("myPet", Pet.class);
        System.out.println(myDog == yourDog);
        context.close();
    }
}
