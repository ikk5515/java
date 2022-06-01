public class HomeWork {
    public static void main(String[] args) {
        int[][] score = {{49, 43, 49}, {80, 60, 82}, {20, 85, 48}, {100, 30, 50}, {80, 90, 100}};

        int[] sum = new int[5];
        double[] avg = new double[5];

        char stu = 65;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i] += score[i][j];
            }
            avg[i] = (double) sum[i] / 3;
            System.out.printf("%c 학생 총점: %d점, 평균: %.1f점\n", stu+i, sum[i], avg[i]);
        }
    }
}