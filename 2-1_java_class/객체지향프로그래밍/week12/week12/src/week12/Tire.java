package week12;

public class Tire {
    public String location;         // 타이어 위치
    public int maxRotation;         // 최대 회전수(타이어 수명)
    public int accRotation;         // 누적 회전수

    //생성자
    public Tire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }

    public boolean roll() {
        ++accRotation;

        if (accRotation < maxRotation) {
            // 타이어 수명이 남아있는 경우
            System.out.println(location + "남은수명: " + (maxRotation - accRotation) + "회");
            return true;
        } else {
            // 타이어 수명이 다 되고 펑크난 경우
            System.out.println("*** " + location + "타이어 펑크 ***");
            return false;
        }
    }
}
