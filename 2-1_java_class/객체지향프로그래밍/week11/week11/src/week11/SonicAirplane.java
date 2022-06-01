package week11;

public class SonicAirplane extends Ariplan{
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    int flymod = NORMAL;

    int soundSpeed;
    int maxSpeed;

    int getSoundSpeed() {
        return soundSpeed;
    }

    @Override
    public void fly() {
        if (flymod == SUPERSONIC) {
            System.out.println("음속비행합니다");
        }
        else {
            super.fly();
        }
    }
}
