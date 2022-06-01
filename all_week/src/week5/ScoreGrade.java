import java.util.Scanner;

public class ScoreGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("SCORE \t\t GRADE");
        System.out.println("====================");

        char grade;

        while (true) {
            int score = sc.nextInt();
            if (score < 0 ){
                System.out.println("프로그램 종료");
                break;
            }
            else if (90 <= score && score <= 100) {
                grade = 'A';
                System.out.println(score + "\t\t\t" + grade);
            }
            else if (80 <= score && score < 90) {
                grade = 'B';
                System.out.println(score + "\t\t\t" + grade);
            }
            else if (70 <= score && score < 80) {
                grade = 'C';
                System.out.println(score + "\t\t\t" + grade);
            }
            else if (60 <= score && score < 70) {
                grade = 'D';
                System.out.println(score + "\t\t\t" + grade);
            }
            else if (0 <= score && score <= 59) {
                grade = 'F';
                System.out.println(score + "\t\t\t" + grade);
            }
            else {
                System.out.println("다시 입력해주세요.");
            }
        }
    }
}
