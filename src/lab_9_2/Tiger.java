package lab_9_2;

import java.security.SecureRandom;

public class Tiger extends Animal{
    public Tiger(){
        this.setSpeed(new SecureRandom().nextInt(100));
    }
}
