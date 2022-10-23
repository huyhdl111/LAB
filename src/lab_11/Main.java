package lab_11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Animal tiger = new Tiger();
        tiger.setName("Tiger 1");
        tiger.setSpeed();
        Animal horse = new Horse();
        horse.setName("Horse 2");
        horse.setSpeed();
        Animal dog = new Dog();
        dog.setName("Dog 3");
        dog.setSpeed();
        animals.add(tiger);
        animals.add(horse);
        animals.add(dog);
        for (Animal animal : animals) {
            System.out.printf("Speed of %s is %d\n", animal.name, animal.speed);
        }
        System.out.println("Winner is " + Calculator.running(animals).getName());
    }
}
