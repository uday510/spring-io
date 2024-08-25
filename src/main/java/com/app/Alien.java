package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("25")
    private int age;

    @Autowired
//    @Qualifier("desktop")
    private Computer computer;

    public Alien() {
//        System.out.println("Alien object created");
    }

//    public Alien(int age) {
//        System.out.println("Alien object created with age");
//        this.age = age;
//    }

    public Alien(int age, Computer computer) {
//        System.out.println("Alien object created with age and computer");
        this.age = age;
        this.computer = computer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void code() {
        System.out.println("Alien is coding");
        computer.compile();
    }
}