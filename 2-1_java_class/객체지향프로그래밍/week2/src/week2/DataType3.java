package week2;

public class DataType3 {
    public static void main(String[] args) {
        char cData1 = 'A';      //문자를 직접 저장
        char cData2 = 65;       //10진수로 저장
        char cData3 = '\u0041'; // 16진수로 저장
        System.out.println("cData1 = " + cData1);
        System.out.println("cData2 = " + cData2);
        System.out.println("cData3 = " + cData3);

        char cData4 = '가';      //문자를 직접 저장
        char cData5 = 44032;      //10진수로 저장
        char cData6 = '\uac00';      //16진수로 저장
        System.out.println("cData4 = " + cData4);
        System.out.println("cData5 = " + cData5);
        System.out.println("cData6 = " + cData6);

        int cData7 = 'B';      //char 타입 변수의
        int cData8 = '하';      //유니코드를 알고 싶으면
        int cData9 = '&';      //int 타입 변수에 저장
        System.out.println("cData7 = " + cData7);
        System.out.println("cData8 = " + cData8);
        System.out.println("cData9 = " + cData9);

        int cData10 = cData7+cData9;
        char cData11 = (char) (cData7+cData9);

        System.out.println("cData7 + cData9 = " + cData10);
        System.out.println("(cData7+cData9)의 char = " + cData11);
    }
}
