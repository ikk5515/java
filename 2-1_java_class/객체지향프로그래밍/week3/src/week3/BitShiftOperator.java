package week3;

public class BitShiftOperator {
    public static void main(String[] args) {
        //좌측이동 연산자(<<)는 최종적으로 2의 3승을 곱한 결과를 얻을 수 있다.
        System.out.println("1 << 3 = " + (1 << 3));
        System.out.printf("1 = %8s\n", Integer.toBinaryString(1));
        System.out.printf("(1<<3) = %8s\n", Integer.toBinaryString(1 << 3));

        System.out.println();
        // 우측이동 연산자(>>)는 최종적으로 2의 3승으로 나눈 결과를 얻을 수 있다.
        System.out.println("-8 >> 3 = " + (-8 >> 3));
        System.out.printf("-8 = %8s\n", Integer.toBinaryString(-8));
        System.out.printf("(-8 >> 3)= %8s\n", Integer.toBinaryString(-8 >> 3));

        System.out.println();
        System.out.println("-9 >>> 3 = " + (-9 >>> 3));
        System.out.printf("-9 = %8s\n", Integer.toBinaryString(-9));
        System.out.printf("(-9>>>3) = %8s\n", Integer.toBinaryString(-9 >>> 3));
    }
}
