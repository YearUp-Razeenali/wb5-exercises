package com.pluralsight;

import com.pluralsight.animals.Cat;
import com.pluralsight.animals.Dog;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Animal pet1 = new Animal();
        pet1.setName("Fred");
        pet1.setSpecies("Goldfish");
        pet1.eat(0.25f);

        Dog pet2 = new Dog();
        pet2.setName("Spot");
        pet2.setBreed("Labrador");

        Cat pet3 = new Cat();
        pet3.setName("Buttons");

        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(pet3);

        System.out.println(pet2.getBreed());
        pet3.meow();
        pet2.bark();
        pet2.eat(55);
        pet2.bark();


        System.out.println("-----------------------------");
        pet1.sayHello();
        pet2.sayHello();
        pet3.sayHello();

        ArrayList<Animal> myPets = new ArrayList<Animal>();


    }
}