package com.pluralsight.animals;

import com.pluralsight.Animal;

public class Cat extends Animal {

    public Cat(){
        System.out.println("TRACE -- from cat constructor");
        super.setSpecies("Cat");
    }

    public void meow(){
        System.out.println("MEOW!");
    }

    public void sayHello(){
        meow();
    }
}