public class Car {
    // 필드
    Tire frontLeft = new Tire("앞왼쪽", 6);            // 1번 타이어
    Tire frontRight = new Tire("앞오른쪽", 2);          // 2번타이어
    Tire backLeft = new Tire("뒤왼쪽", 3);             // 3번타이어
    Tire backRight = new Tire("앞오른쪽", 4);           // 4번타이어

    //Tire[] tires = {
    //        new Tire("앞왼쪽", 6),
    //        new Tire("앞오른쪽", 2),
    //        new Tire("뒤왼쪽", 3),
    //        new Tire("뒤오른쪽", 4),
    //};

    // 주행 메소드
    int run() {
        System.out.println("자동차가 달립니다.");
        if (!frontLeft.roll()) {
            stop();
            return 1;                                               // 1번 타이어 리턴
        }
        if (!frontRight.roll()) {
            stop();
            return 2;                                               // 2번 타이어 리턴
        }
        if (!backLeft.roll()) {
            stop();
            return 3;                                                 // 3번 타이어 리턴
        }
        if (!backRight.roll()) {
            stop();
            return 4;                                                 // 4번 타이어 리턴
        }
        return 0;
    }
    // 정지 메소드
    void stop() {
        System.out.println("자동차가 정지합니다.");
    }
}
