package com.bnta.Exercises.oop_garage_example.src;//this class creates a standard Person class aka POJO...

import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    private String email;
    private Cars[] cars;

    public Person (String name,
                   int age,
                   String email,
                   Cars[] cars) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }
}
