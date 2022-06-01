public class dice {
    public static void main(String[] args) {
        // 1~6 사이의 랜덤한 숫자
        int dice_num = (int)((Math.random() * 6) + 1);

        System.out.println(dice_num);
    }
}
