// 크기 5의 정수형 배열을 선언하고 55, 88, 60, 100, 90 으로 각 요소의 값을 초기화하시오.
// 이 문제는 배열 선언과 동시에 특정 값으로 초기화 할 수 있는지륾 묻는 문제이다.
// 이때, 2가지 방식으로 초기화 할 수 있는데 모두 작성해보시오.


// 배열 요소의 값을 반복문을 사용하여 모두 출력하시오.
// 이 문제는 배열 원소의 값을 for 문과 같은 반복문을 사용하여 출력할 수 있는지를 묻는 문제이다.

public class array_Basic_004 {
    public static void main(String[] args) {

        // [1]: 배열 선언과 동시에 특정 값으로 초기화
        int[] sales_table = {55, 88, 60, 100, 90};
        System.out.println(sales_table[1]);     // 88

        // [2]
        int[] sales_table2 = new int[] {55, 88, 60, 100, 90};     // 1번 방식 보다 불편
        System.out.println(sales_table2[2]);     // 60

        // [3]
        int[] sales_table3;
        // sales_table3 = {55, 88, 60, 100, 90};        // Err
        sales_table3 = new int[] {55, 88, 60, 100, 90};
        System.out.println(sales_table3[3]);     // 100

// ---------------------------- for 문을 통한 배열 출력 ----------------------------------------------

        // [1]: 배열 선언과 동시에 특정 값으로 초기화
        int[] sale_table4 = {32, 52, 93, 100, 87};

        // [2]: 반복문을 사용하여 모든 값 출력
        for (int i = 0; i < sale_table4.length; i++) {
            System.out.print(sale_table4[i] + " ");
        }
    }
}
