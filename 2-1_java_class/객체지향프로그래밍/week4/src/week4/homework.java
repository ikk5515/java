package week4;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.printf("키(cm)를 입력하세요: ");
        int height = sc.nextInt();
        System.out.printf("몸무게(kg)를 입력하세요: ");
        int weight = sc.nextInt();

        double BMI = weight / (Math.pow((height / 100.0), 2));
        String BMIStr = "";

        System.out.println();
        if (18.5 <= BMI && BMI <= 22.9) {
            BMIStr = "정상";
        } else if (23 <= BMI && BMI <= 24.9) {
            BMIStr = "과체중";
        } else if (25 <= BMI && BMI <= 29.9) {
            BMIStr = "비만";
        } else if (30 <= BMI) {
            BMIStr = "고도비만";
        }

        System.out.println(name + "님의 키는 " + height + "cm이고 몸무게는 " + weight + "입니다.");
        System.out.printf("BMI 지수는 %.2f이고 %s입니다.", BMI, BMIStr);
    }
}
