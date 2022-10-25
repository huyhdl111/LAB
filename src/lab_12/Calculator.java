package lab_12;

import java.util.List;

public class Calculator {
    public static int running(List<MoveAble> runnerList){
        int maxSpeed = 0;
        int indexOfWinner = 0;
        for (MoveAble runner : runnerList) {
            if(runner.getSpeed()> maxSpeed){
                maxSpeed = runner.getSpeed();
                indexOfWinner = runnerList.indexOf(runner);
            }
        }
        return indexOfWinner;
    }
}
