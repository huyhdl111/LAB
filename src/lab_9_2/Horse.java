package lab_9_2;

import java.security.SecureRandom;

public class Horse extends Animal{
    public Horse(){
        this.setSpeed(new SecureRandom().nextInt(75));
    }
}
