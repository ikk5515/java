package week11;

public class AirplaneEx2 {
    public static void main(String[] args) {
        SonicAirplane sPlane = new SonicAirplane();
        sPlane.takeOff();
        sPlane.fly();
        sPlane.land();

        sPlane.flymod = SonicAirplane.SUPERSONIC;
        sPlane.fly();
        sPlane.flymod = SonicAirplane.NORMAL;
        sPlane.fly();
    }
}
