// 반환값이 있고 받는 인자값이 있는 대문자 출력 메서드를 구현해보시오.
// 메서드는 ("korea") 입력시 대문자로 출력되도록 구현한다.
// 이 문제는 자바의 메서드 작성법과 반환값, 인자값에 대한 이해가 있는지를 묻는 문제이다.


import java.util.Scanner;

public class method_Exam_004 {

    public static String capitalMethod(String str) {
        String ret = str.toUpperCase();   // 문자열 변수 선언
        return ret;
    }

    public static void main(String[] args) {

        // [1]: 반환값 --> O       받는 인자값 --> O
        // 반환값이 있다는 것은 메서드(함수) 호출에 따른 리턴되는 값이 있다는 것이므로 호출시 리턴값을 받는 변수를 정의한다.
        Scanner sc = new Scanner(System.in);    // 사용자 입력을 위한 객체 선언
        System.out.print("대분자로 변환할 소문자 입력 = ");

        String rst;       // 문자열 변수 선언
        rst = sc.next();       // 문자열 입력 받기
        rst = capitalMethod(rst);

        // [2]: 출력
        System.out.println("입력한 소문자의 대문자는 = " +rst);
        System.out.println("입력한 문자열의 길이 = "+(rst.length()));
    }
}
