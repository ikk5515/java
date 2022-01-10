public class DataType2 {
    public static void main(String[] args) {

        // [1]: 기본형 타입 --> 8개 --> 변수 선언과 동시에 값을 입력
        byte b = 127;
        short s = 32767;
        int i = 2100000000;
        long l = 7000000000L;    // 숫자 마지막에 L을 붙여주어야 함
        float f = 9.8F;         // 숫자 마지막에 f를 붙여주어야 함
        double d = 3.14;
        char c = 'A';
        boolean bl = false;

        // [2]: 출력
        System.out.println(b + " byte 최댓값 --> " + Byte.MAX_VALUE);
        System.out.println(s+ " short 최댓값 --> " + Short.MAX_VALUE);
        System.out.println(i+ " int 최댓값 --> " + Integer.MAX_VALUE);
        System.out.println(l+ " long 최댓값 --> " + Long.MAX_VALUE);
        System.out.println(f + " float 최댓값 --> " + Float.MAX_VALUE);
        System.out.println(d + " double 최댓값 --> " + Double.MAX_VALUE);
        System.out.println(c + " char 최댓값 --> " + (int)Character.MAX_VALUE);
        System.out.println(bl);
    }
}
