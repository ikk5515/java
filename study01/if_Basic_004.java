// 중첩된 if 조건문을 사용하는 예제를 만들어보시오.
// 이 문제는 if 조건문을 중첩하여 사용하는 방법에 대해서 알고 있는지를 묻는 문제이다.

public class if_Basic_004 {
    public static void main(String[] args) {

        // [1]: 변수 선언
        int kor = 70, eng = 70, math = 60;
        int total_score;
        total_score = kor + eng + math;

        // [2]: if~ else if~ else 조건문 사용하기
        if (total_score >= 270) {
            System.out.println(("당신의 토탈 점수는 " +total_score+"입니다. 매우 매우 잘했어요"));
            System.out.println("축하해요~");
        }
        else if (total_score >= 240) {
            System.out.println(("당신의 토탈 점수는 " +total_score+"입니다. 잘했어요"));
        }
        else if (total_score >= 210) {
            System.out.println(("당신의 토탈 점수는 " +total_score+"입니다. 노력하세요~"));
        }
        else {
            if (math >= 60)
                System.out.printf("당신의 총점은 %d점이고, 수학점수는 %d점 입니다. 수학이 60점 이상이므로 재수강 대상자가 아닙니다.", total_score, math);
            else
                System.out.println(("당신의 토탈 점수는 " +total_score+"입니다. 재수강 대상자입니다."));
        }
    }
}
