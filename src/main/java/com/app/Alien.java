package com.app;

public class Alien {
    private int age = 0;
    private Laptop laptop;

    public Alien() {
        System.out.println("Alien object created" );
    }

    public void code() {
        System.out.println("Alien is coding");
        laptop.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
