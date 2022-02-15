package com.bnta.Exercises.oop_garage_example.src;//Another POJO class called Garage...

import java.util.Arrays;

public class Garage {
    private String name; //what is the name of the garage?
    private Person owner; //who is the owner?
    private int capacity; //how many cars can this garage hold?
    private static boolean isOpen; //is the garage door open or close? (maybe try an enum here?)
    private Cars[] currentCars; //which cars specifically are inside the garage?

    public Garage (String name,
                   Person owner,
                   int capacity) {
        this.name = name;
        this.owner = owner;
        this.capacity = capacity;
        this.isOpen = false; //set to false meaning door is initially closed - modelling real life...
        this.currentCars = new Cars[capacity];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public Cars[] getCurrentCars() {
        return currentCars;
    }

    public void setCurrentCars(Cars[] cars) {
        this.currentCars = currentCars;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "name='" + name + '\'' +
                ", owner=" + owner +
                ", capacity=" + capacity +
                ", currentCars=" + Arrays.toString(currentCars) +
                '}';
    }
}
