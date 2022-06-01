import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        int scanData = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("구구단 몇 단을 계산할까?");
        scanData = sc.nextInt();

        System.out.println("구구단 "+ scanData + "단을 계산한다.");
        for (int i = 1; i <= 9; i++) {
            // System.out.printf("%d x %d = %d\n", scanData, i, (scanData*i));
            System.out.println(scanData + " x " + "i = " + (scanData * i));
        }
    }
}
