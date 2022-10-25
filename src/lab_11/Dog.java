package lab_11;

import java.security.SecureRandom;

public class Dog extends Animal {
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void setSpeed() {
        this.speed = new SecureRandom().nextInt(65);
    }
}
