public class PolyEx {
    public static void main(String[] args) {
        ClassC classC = new ClassC();
        InterfaceA interA = new ClassC();   // 오른쪽 구현객체가 왼쪽 인터페이스 변수에 대입
        InterFaceB interB = new ClassC();   // 이 때, 자동 타입 변환이 일어난다.

        classC.methodA();       // 클래스 ClassC가 정의한 모든 멤버를 호출할 수 있다
        classC.methodB();       // 클래스 ClassC가 정의한 모든 멤버를 호출할 수 있다

        interA.methodA();       // 인터페이스 InterfacA에 정의된 메소드만 호출 가능
        //interA.methodB();     // 자동 변환 후에는 해당 인터페이스 멤버만 호출할 수 있다

        //interB.methodA();     // ClassC에 정의되어 있어도 인터페이스로 자동변환되면서 호출 불가
        interB.methodB();       // 인터페이스 InterfaceB에 정의된 메소드만 호출 가능

        if (interA instanceof ClassC) {     // 객체 타입 확인 후
            ClassC castA = (ClassC)interA;  // 강제 타입 변환
            castA.methodB();
        }

        //interB.methodA();     // ClassC에 정의되어 있어도 인터페이스로 자동변환되면서 호출 불가능
        interB.methodB();       // 인터페이스 InterfaceB에 정의된 메소드만 호출 가능

        if (interB instanceof ClassC) {
            ClassC castB = (ClassC)interB;
            castB.methodA();
        }
    }
}
