package 과제;

public class RemoteControlExample {
    public static void main(String[] args) {


        RemoteControl[] remote = new RemoteControl[3];

        remote[0] = new Television();
        remote[1] = new Audio();
        remote[2] = new Computer();

        for (int i = 0; i < 3; i++) {
            remote[i].turnOn();
            remote[i].turnOff();
            remote[i].setMute(false);
            remote[i].setVolume(25);
            System.out.println("");
        }
    }
}
