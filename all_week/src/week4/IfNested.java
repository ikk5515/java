public class IfNested {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 100);
        String grade;

        if (score >= 90) {
            if (score > 96)
                grade = "A+";
            else if (score > 93)
                grade = "A";
            else
                grade = "A-";
        } else if (score >= 80) {
            if (score > 86)
                grade = "B+";
            else if (score > 83)
                grade = "B";
            else
                grade = "B-";
        } else if (score >= 70) {
            if (score > 76)
                grade = "C+";
            else if (score > 73)
                grade = "C";
            else
                grade = "C-";
        } else
            grade = "F";

        System.out.println("점수는 " + score);
        System.out.println("학점은 " + grade);
    }
}
