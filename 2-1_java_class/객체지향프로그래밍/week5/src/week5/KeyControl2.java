package week5;

import java.io.IOException;

public class KeyControl2 {
    public static void main(String[] args) throws IOException {
        int keyCode = 0;
        int count = 0;
        boolean run = true;

        System.out.println("숫자를 입력하세요(0~9)");

        while (run) {
            keyCode = System.in.read();

            if (keyCode != 13 && keyCode != 10) {

                System.out.println("입력한 값은: " + (char) keyCode + "입니다");
                System.out.println("숫자를 입력하세요(0~9)");
                //키보드로 값을 입력받을 때마다 카운트해서 5번 입력받으면 빠져나가도록 한다.
                count++;
                System.out.println("count = " + count);
                if (count > 5) {
                    run = false;
                }
            }
        }

        System.out.println("프로그램 종료");
    }
}
