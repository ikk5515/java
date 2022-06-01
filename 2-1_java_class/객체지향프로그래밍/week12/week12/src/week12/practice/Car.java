package week12.practice;

public abstract class Car {
    int speed = 0;
    String color;

    void upSpeed(int speed) {
        this.speed += speed;
    }

    abstract void work();

}
