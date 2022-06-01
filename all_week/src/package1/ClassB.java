import week11.ClassA;

public class ClassB {
    ClassA a1 = new ClassA(true);       // public으로 정의된 생성자만 외부 패키지에서 사용 가능
    // ClassA a2 = new ClassA(10);
    // ClassA a3 = new ClassA("문자열");
}
