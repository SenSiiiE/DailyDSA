package com.oops.interfaces;

class Animal {
    String n = "Animal";
    Animal(){
        System.out.println("An animal is being created...");
    }

    void run(){
        System.out.println("Animal is running...");
    }
    void eat(){
        System.out.println("Animal is eating...");
    };
}
class Dog extends Animal{
    String n = "Dog";
    Dog(){
        System.out.println("Dog is being is created...");
    }
    void eat(){
        System.out.println("Dog is eating...");
    }

}
class Cat extends Animal{
    String n = "Cat";
    Cat(){
        System.out.println("Cat is being created...");
    }
    void eat(){
        System.out.println("Cat is running...");
    }
}

class God {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.run();
        Dog dog = new Dog();
        dog.eat();
        dog.run();
        Animal a = new Dog();
        a.eat();
        System.out.println(a.n);
    }
}
