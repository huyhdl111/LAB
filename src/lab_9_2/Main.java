package lab_9_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Animal tiger = new Tiger();
        tiger.setName("Tiger 1");
        Animal horse = new Horse();
        horse.setName("Horse 2");
        Animal dog = new Dog();
        dog.setName("Dog 3");
        animals.add(tiger);
        animals.add(horse);
        animals.add(dog);
        for (Animal animal : animals) {
            System.out.printf("Speed off %s is %d\n", animal.name, animal.speed);
        }
        System.out.println("Winner is " + Calculator.running(animals).getName());
    }
}
