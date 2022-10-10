package lab_9_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Animal tiger = new Tiger();
        tiger.setName("tiger");
        Animal horse = new Horse();
        horse.setName("horse");
        Animal dog = new Dog();
        dog.setName("dog");
        animals.add(tiger);
        animals.add(horse);
        animals.add(dog);
        System.out.println("Speed of Tiger is " + tiger.getSpeed());
        System.out.println("Speed of horse is " + horse.getSpeed());
        System.out.println("Speed of dog is " + dog.getSpeed());
        System.out.println("Winner is " + Calculator.running(animals).getName());
    }
}
