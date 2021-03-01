package ru.project.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    @Autowired
    @Qualifier("dogBean")
    private Pet pet;
    private String surname;
    private int age;

    /*public Person() {
        System.out.println("Person bean empty");
    }*/

    /*public Person(Pet pet) {
        System.out.println("Person bean created");
        this.pet = pet;
    }*/

    public void callYourPet() {
        System.out.println("Hello, my pet!");
        pet.say();
    }


    /*public void setPet(@Qualifier("dogBean") Pet pet) {
        System.out.println("Person pet added");
        this.pet = pet;
    }*/

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
