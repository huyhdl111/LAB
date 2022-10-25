package lab_12;

import java.util.ArrayList;
import java.util.List;

import static lab_12.Calculator.running;

public class Main {
    public static void main(String[] args) {
        List runnerList = new ArrayList();
        Dog dog = new Dog();
        dog.setName("dog dog");
        if (dog.isFlyAble() == false) {
            runnerList.add(dog);
        }
        Horse horse = new Horse();
        horse.setName("horse horse");
        if (horse.isFlyAble() == false) {
            runnerList.add(horse);
        }
        Eagle eagle = new Eagle();
        eagle.setName("eagle eagle");
        if (eagle.isFlyAble() == false) {
            runnerList.add(eagle);
        }
        Falcon falcon = new Falcon();
        falcon.setName("falcon falcon");
        if (eagle.isFlyAble() == false) {
            runnerList.add(eagle);
        }
        System.out.printf("Winner is %s", runnerList.get(running(runnerList)).toString());
    }
}
