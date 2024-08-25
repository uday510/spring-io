package com.app;

import java.beans.ConstructorProperties;

public class Alien {
    private int age = 0;
    private Computer computer;

    public Alien() {
//        System.out.println("Alien object created" );
    }

//    @ConstructorProperties({"age", "laptop"})
//    public Alien(int age, Laptop laptop) {
//        this.age = age;
//        this.laptop = laptop;
//    }

    public Alien(int age) {
        this.age = age;
        System.out.println("Alien object created with age: " + age);
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
