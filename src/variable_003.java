/*
자바의 Primitive Data Type의 바이트크기와 비트 크기를 출력하는 코드를 구현하시오.
정수형 타입과 문자형 타입에 대해서만 구현한다.
이때, 각 타입의 최댓값과 최솟값도 같이 구하여 출력한다.
 */

public class variable_003 {
    public static void main(String[] args){

        //byte, short, int, long, char
        System.out.println("Byte: "+Byte.BYTES);  //---바이트 계산---;;
        System.out.println("Byte: "+Byte.SIZE);  //---비트 계산---;;

        System.out.println("Short: "+Short.BYTES+ "(바이트)" +" --> " +Short.SIZE+ "(비트) " +Short.MIN_VALUE+ " ~ " +Short.MAX_VALUE);

        System.out.println("Integer: "+Integer.BYTES );
        System.out.println("Integer: "+Integer.SIZE);
        System.out.println("Integer: "+Integer.MIN_VALUE+ " ~ " +Integer.MAX_VALUE);

        System.out.println("Long: "+Long.BYTES);
        System.out.println("Long: "+Long.SIZE);
        System.out.println("Long: "+Long.MIN_VALUE+ " ~ " +Long.MAX_VALUE);

        System.out.println("Character: "+Character.BYTES+ "(바이트)" +" --> " +Character.SIZE+ "(비트) " +(int)Character.MIN_VALUE +" ~ " +(int)Character.MAX_VALUE);
    }
}
