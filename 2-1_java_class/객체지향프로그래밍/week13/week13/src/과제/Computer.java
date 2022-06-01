package 과제;

public class Computer implements RemoteControl{
    // 필드
    private int volume;
    // turnOn() 추상 메소드의 실체 메소드
    @Override
    public void turnOn() {
        System.out.println("Computer를 켭니다.");
    }

    // turnOff() 추상 메소드의 실체 메소드
    @Override
    public void turnOff() {
        System.out.println("Computer를 끕니다.");
    }

    // setVolume() 추상 메소드의 실체 메소드
    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if(volume < RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Computer 볼륨: " + this.volume);
    }

    @Override
    public void setMute(boolean mute) {
        if(mute) {
            System.out.println("Computer 무음 처리합니다.");
        } else {
            System.out.println("Computer 무음 해제합니다.");
        }
    }
}
