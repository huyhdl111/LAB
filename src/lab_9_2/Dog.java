package lab_9_2;

import java.security.SecureRandom;

public class Dog extends Animal{
    public Dog(){
        this.setSpeed(new SecureRandom().nextInt(60));
    }
}
