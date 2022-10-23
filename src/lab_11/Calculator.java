package lab_11;

import java.util.List;

public class Calculator {
    public static Animal running(List<Animal> animals){
        int maxSpeed = 0;
        int indexOfWinner = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getSpeed() > maxSpeed){
                maxSpeed = animals.get(i).getSpeed();
                indexOfWinner = i;
            }
        }
        return animals.get(indexOfWinner);
    }
}
