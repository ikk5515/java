public class DataType3 {
    public static void main(String[] args) {

        // [1]
        short a = 'A';
        System.out.println(a);      //--- 65---;;

        // [2]
        short b = 90;
        System.out.println((char)b);    //(형변환)---Z---;;

        // [3]
        char c = 'a';
        System.out.println((short)c);   //---97---;
    }
}
