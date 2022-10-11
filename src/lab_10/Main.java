package lab_10;

import java.util.ArrayList;
import java.util.List;
import static lab_10.Animal.AnimalRunner;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        //add animal
        AnimalRunner tiger = new AnimalRunner();
        tiger.setName("tiger");
        tiger.setWhithWing(false);
        animalList.add(tiger.build());
        AnimalRunner horse = new AnimalRunner();
        horse.setName("horse");
        horse.setWhithWing(false);
        animalList.add(horse.build());
        AnimalRunner falcon  = new AnimalRunner();
        falcon.setName("falcon");
        falcon.setWhithWing(true);
        animalList.add(falcon .build());
        AnimalRunner eagle  = new AnimalRunner();
        eagle.setName("eagle");
        eagle.setWhithWing(true);
        animalList.add(eagle .build());
        AnimalRunner dog  = new AnimalRunner();
        dog.setName("dog");
        dog.setWhithWing(false);
        animalList.add(dog .build());
        //Test
        System.out.println("Speed of tiger is " + animalList.get(0).getSpeed());
        System.out.println("Speed of horse is " + animalList.get(1).getSpeed());
        System.out.println("Speed of falcon is " + animalList.get(2).getSpeed());
        System.out.println("Speed of eagle is " + animalList.get(3).getSpeed());
        System.out.println("Speed of dog is " + animalList.get(4).getSpeed());
        System.out.println(Calculator.running(animalList).getName());
    }
}
