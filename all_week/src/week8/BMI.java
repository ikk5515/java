import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height;
        int weight;
        String name;


        double bmi;

        System.out.print("이름을 입력하세요: ");
        name = sc.nextLine();

        System.out.print("키(cm)를 입력하세요: ");
        height = sc.nextInt();

        System.out.print("몸무게(kg)를 입력하세요: ");
        weight = sc.nextInt();

        double height_m = height / 100.0;
        bmi = weight / (height_m * height_m);

        System.out.println(name  + "님의 키는 " + height + "이고 몸무게는" + weight + "kg 입니다");
        System.out.printf("BMI 지수는 %.2f 입니다", bmi);

    }
}
