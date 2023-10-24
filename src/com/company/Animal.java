package com.company;

public class Animal {
    private String name;
    private String type;
    private String color;
    private String gender;
    private int age;
    private Foodtype food;
    private short numberOfLegs;
    private boolean isWild;
    private String picture;
    private boolean isFed;

    Animal() {
        this.name = "";
        this.type = "Animal";
        this.color = "";
        this.gender = "";
        this.age = 0;
        this.food = food;
        this.numberOfLegs = 0;
        this.isWild = false;
        this.picture = "";
        this.isFed = false;
    }

    Animal(String name, String color, String gender, int age, Foodtype food, short numberOfLegs, boolean isWild, String picture) {
        this.name = name;
        this.type = Animaltype.ANIMAL;
        this.color = color;
        this.gender = gender;
        this.age = age;
        this.food = food;
        this.numberOfLegs = numberOfLegs;
        this.isWild = isWild;
        this.picture = picture;
        this.isFed = false;
    }

    public void feed() {
        this.isFed = true;
        System.out.println(this.type + " with name " + this.name + " was fed with " + this.food);
    }



    public void speak(){
        System.out.println("mm");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public short getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(short numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }





}
