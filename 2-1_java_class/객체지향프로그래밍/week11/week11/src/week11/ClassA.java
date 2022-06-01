package week11;

public class ClassA {

    ClassA c1 = new ClassA(true);
    ClassA c2 = new ClassA(10);
    ClassA c3 = new ClassA("문자열");


        ClassA(int data) { }        // 접근제한자가 없는 경우 기본이 default => 같은 패키지 안에서만 사용 가능
        public ClassA(boolean data) { }
        private ClassA(String data) { }
}
