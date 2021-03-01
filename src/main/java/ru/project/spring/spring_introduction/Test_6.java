package ru.project.spring.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("personBean",Person.class);
        person.callYourPet();
        Pet cat = context.getBean("catBean",Pet.class);
        cat.say();
        System.out.println(person.getSurname());
        context.close();
    }
}
