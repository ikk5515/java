package week9;

public class Calculator {
    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double avg(int x, int y) {
        double sum = plus(x, y);
        double result = sum / 2;
        return result;
    }

    void exec() {
        double result = avg(7, 10);
        printFunc("실행 결과:: " + result);
    }
    void printFunc(String strMsg) {
        System.out.println(strMsg);
    }

    public static void main(String[] args) {
        Calculator myCal = new Calculator();
        myCal.exec();
    }
}
