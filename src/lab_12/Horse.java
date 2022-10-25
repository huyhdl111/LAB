package lab_12;

import java.security.SecureRandom;

public class Horse implements MoveAble, FlyAble{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(75);
    }

    @Override
    public boolean isFlyAble() {
        return false;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                '}';
    }
}
