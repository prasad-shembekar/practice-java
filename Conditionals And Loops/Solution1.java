import java.util.*;

public class Animal{
    public void makeSound(){
        System.out.println("Animal makes a sound.");
    }
}

public class Cat extends Animal{
    public void makeSound(){
        System.out.println("Cat quarrels");
    }
}

public class Solution1{
    public static void main(String args[]){
        Animal animal = new Animal();
        Cat cat  = new Cat();
        animal.makeSound();
        cat.makeSound();
    }
}