package lab_10;

import java.util.List;

public class Calculator {
    public static Animal running(List<Animal> animalList){
        int maxSpeed = 0;
        int indexOfWinner = 0;
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).getSpeed() > maxSpeed && animalList.get(i).isWhithWing() == false){
                maxSpeed = animalList.get(i).getSpeed();
                indexOfWinner = i;
            }
        }
        return animalList.get(indexOfWinner);
    }
}
