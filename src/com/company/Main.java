package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
              List<Animal> animals = new ArrayList<>();
              Scanner sc = new Scanner (System.in);
                 int numberAnimals = sc.nextInt();
                 for(int i=0;i<numberAnimals;i++){
                     Animal animal = new Animal();



                     animal.setName(sc.next());
                     animal.setAge(sc.next());
                     animal.setGender(sc.next());
                     animal.setColor(sc.next());
                     animal.setFood(sc.next());

                    Foodtype foodType = Foodtype.valueOf(sc.next().toUpperCase());
                     animal.setFood(foodType);
                     animal.setWild(sc.nextBoolean());
                     animal.setNumberOfLegs(sc.nextShort());
                     animal.setFood();
                     animals.add(animal);
                 }
                 sc.close();

    }
}
