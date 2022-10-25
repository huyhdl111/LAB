package lab_10;

import java.security.SecureRandom;

public class Animal {
    private String name;
    private boolean whithWing;
    private int speed;

    public String getName() {
        return name;
    }

    public boolean isWhithWing() {
        return whithWing;
    }

    public int getSpeed() {
        return speed;
    }

    public Animal(AnimalRunner animalRunner) {
        this.name = animalRunner.name;
        this.speed = animalRunner.speed;
        this.whithWing = animalRunner.whithWing;
    }

    public static class  AnimalRunner{
        private String name;
        private boolean whithWing ;
        private int speed = new SecureRandom().nextInt(100);

        public void setName(String name) {
            this.name = name;
        }

        public void setWhithWing(boolean whithWing) {
            this.whithWing = whithWing;
        }

        public Animal build(){
            return new Animal(this);
        }
    }
}
