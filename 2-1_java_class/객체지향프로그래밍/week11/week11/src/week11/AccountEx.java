package week11;

import java.util.Scanner;

public class AccountEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Account_class account = new Account_class();

        account.setBalance(1000000);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(-1000000);
        System.out.println("현재 잔고: " + account.getBalance());
         */

        Account_class acc = new Account_class("123-45-6789", "홍길동", 100000);
        System.out.println("계좌 생성 완료");

        acc.Print_acc();

        System.out.print("계좌 입금 금액>> ");
        int amount = sc.nextInt();
        acc.setBalance(amount);
        System.out.println("입금 성공~!");

        acc.Print_acc();

        sc.close();
    }
}
