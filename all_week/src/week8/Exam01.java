public class Exam01 {
    public static void main(String[] args) {
        int meter = 100;
        int time = 5;

        double velocity = (double) meter / (time * 60);

        System.out.printf("%.4fm/s 입니다.", velocity);
    }
}
