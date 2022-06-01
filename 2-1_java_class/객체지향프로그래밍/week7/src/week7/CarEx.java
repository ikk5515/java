package week7;

public class CarEx {
    public static void main(String[] args) {
        // 객체 생성
        Car car1 = new Car();

        // 필드값 읽기
        System.out.println(car1.company);
        System.out.println(car1.model);
        System.out.println(car1.color);
        System.out.println(car1.maxSpeed);

        Car car2 = new Car("그렌저");
        System.out.println(car2.company);
        System.out.println(car2.model);
        System.out.println(car2.color);
        System.out.println(car2.maxSpeed);

        Car car3 = new Car("소나타", "흰색");
        System.out.println(car3.company);
        System.out.println(car3.model);
        System.out.println(car3.color);
        System.out.println(car3.maxSpeed);

        /*
        // 필드값 변경
        myCar.speed = 60;
        System.out.println("수정된 속도: "+ myCar.speed);
         */
    }
}
