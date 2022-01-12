public class Variable_DataType4 {
    public static void main(String[] args) {

        // [1] 기본형 타입 --> 8개 --> 변수 선언과 동시에 값을 출력
        byte b = 10;
        short s = 32767;
        int i = 2100000000;
        long l = 7000000000L;    // 숫자 마지막에 L을 붙여주어야 함
        float f = 9.8F;         // 숫자 마지막에 f를 붙여주어야 함
        double d = 3.14;
        char c = 'A';
        boolean bl = false;

        // [2]: print(), println()
        System.out.print("안녕하세요~ ");
        System.out.print("홍길동 입니다. 나는 학생입니다.");

        // [3]: printf()출력 --> 지시자를 사용
        // %d(정수), %f(소수점 형식), %c(문자), %s(문자열), %b(부울), %n(줄바꿈), %e(지수), %o(8진수), %x(16진수)
        System.out.printf("나는 %d살의 대학생 입니다. %d %d %d 소수점 형식 --> %.1f %f, 문자 --> %c,%b %n", b,s,i,l,f,d,c,bl);
        System.out.println();
        System.out.printf("10진수 10은 8진수로는 %o이고, 16진수로는 %x이다.",b,b);
    }
}
