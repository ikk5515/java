package week8;

import java.util.Scanner;

public class ConditionOperator3 {
    public static void main(String[] args) {

        /*
        Scanner 객체를 이용하여 성적을 입력받아 등급을 출력하는 프로그램을 완성하시오.
         90 ~ : A, 80 ~ 89 : B, 70 ~ 79 : C, 60 ~ 69 : D, ~ 59 : F
         3항 연산자를 사용할 것
        */

        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';

        System.out.println(grade);
    }
}