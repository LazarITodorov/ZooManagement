package com.company;

public class Dog extends Mammal{
    @Override
    public void speak() {
        super.speak();
        System.out.println("Barking ...");
    }
}
