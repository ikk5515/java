public class Hankook extends Tire{
    public Hankook(String location, int maxRotation) {
        super(location, maxRotation);
    }
    @Override
    public boolean roll() {
        ++accRotation;
        if (accRotation < maxRotation) {
            // 타이어 수명이 남아있는 경우
            System.out.println(location + " 한국타이어 남은수명: " + (maxRotation-accRotation));
            return true;
        } else {
            // 타이어 수명이 다 되고 펑크난 경우
            System.out.println("*** " + location+ " 한국타이어 펑크 ***");
            return false;
        }
    }
}
