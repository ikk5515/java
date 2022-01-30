// 컴파일 단계에서는 에러가 안나고, 실행 단계에서 ClassCast 오류가 발생하는 상황을 만들어보시오.
// 이 문제는 제네릭의 필요성을 보여주는 예를 코드로 설명할 수 있는지를 묻는 문제이다.


class Person3 {
    // Field
    public Object obj;
    // Constructor
    Person3 (Object obj) {this.obj = obj;}
}

class Student2 {
    // Filed
    public Object grade;

    // Constructor
    Student2 (Object grade) {this.grade = grade;}
}

class Teacher {}


public class collection_Generic2 {
    public static void main(String[] args) {

        // [1]: 객체 생성
        Person3 p1 = new Person3(new Student2(1));
        // System.out.println(p1.obj);
        // String str = (String)p1.obj;
        // System.out.println(str.length());

        // [2]: 형변환 --> Cast
        Teacher s1 = (Teacher)p1.obj;       // 이 부분은 컴파일 단계에서는 에러가 안나고, 실행하는 단계에서 ClassCast 오류가 발생한다.
    }
}
