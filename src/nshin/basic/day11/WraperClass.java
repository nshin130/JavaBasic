package nshin.basic.day11;

import java.util.Scanner;

public class WraperClass {
    public static void main(String[] args) {
        // nshin.basic.day11.WraperClass
        // 프로그램에 따라 기본자료형의 데이터를 참조자료형으로
        // 바꿔 취급해야 할 때가 있음
        // 메서드의 매개변수가 객체형을 요구하면
        // 그에 따라 객체형을 사용해야 함
        // 기본자료형 변수를 참조자료형 변수로 변환하는 클래스를
        // 래퍼클래스라함
        // int->Integer, double->DOUBle
        // char->character, boolean->Boolean

        int a = 123;
        Integer b = new Integer(a);
        // 박싱 : 기본자료형 변수를 참조자료형 변수로 변환

        System.out.println(a);
        System.out.println(b);
        // 박싱을 통해 클래스의 장점을 활용할 수 있는 변수로 변화함

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 하나 입력하세요");
        int number = Integer.parseInt(sc.next());
        // 문자 입력값을 정수로 변환함

        int c = b.intValue();
        // 언박싱: 창조자료형변수를 기본자료형 변수로 변환

        Integer d = 456;    //new Integer 사용안함
        //자동 박싱 적용
        int e = d;          //intValue 사용안함
        //자동 언박싱 적용

        // 10진수를 2진수로 변환하기
        // 4==> 100
        System.out.println(Integer.toBinaryString(4));

        // 두 수를 비교해서 큰지 작은지 같은지를 출력
        // compareT(수1,수2)
        // return: 1(크다), 0(같다), -1(작다)
        System.out.println(b.compareTo(d));
        System.out.println(Integer.compare(b,d));

    }
}
