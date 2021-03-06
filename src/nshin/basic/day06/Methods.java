package nshin.basic.day06;

public class Methods {
    public static void main(String[] args) {
        // 메서드
        // 어떤 특정 작업을 수행하기 위한 코드들의 집합
        // C언어의 함수와 유사
        // 중복되는 코드들의 반복적인 사용을 피할수 있음
        // 모듈화를 통해 프로그램의 이해도 증가
        // 코드의 문제발생 또는 기능 변경시에
        // 손쉽게 유지보수 가능

        // method 형식
        // 접근지정자 반환타입 메서드명(매개변수목록) {
        //  메서드 몸체
        //  return 변수
        // }

        // 접근지정자: 메서드 접근 허용 범위 여부 (public/private)
        // 반환타입: 메서드 실행 후 return하는 자료의 타입 지정
        //         반환타입이 없는 경우 void로 정의
        // 매개변수목록: 메서드 호출시 전달하는 변수 저장

        // 메서드 호출
        // 메서드명()
        // 메서드명(매개변수)

        // i.g. 1 ~ 10 사이 난수 10개 생성 v1
        for(int i = 1; i <= 10; ++i) {
            int magic = (int)(Math.random() * 10 ) + 1;
            System.out.print(magic + " ");
        }
        System.out.println(" ");
        // i.g. 1 ~ 10 사이 난수 10개 생성 v2
        for(int i = 1; i <= 10; ++i) {
            make_magic();
        }   //for
        System.out.println(" ");

        //인사말 출력 v1
        System.out.println("Hello, World!!");

        //인사말 출력 v2
        sayHello();

        //인사말 출력 v2b - "hello Java" 라는 메시지 출력
        sayHello2();

        //인사말 출력 v3 - 인사말 대상을 변수화
        sayHello3("World");     //Hello, World
        sayHello3("Java");      //Hello, Java
        sayHello3("Python");    //Hello, Python

        //인사말 출력 v4 - 반환타입이 있는 메서드
        String say = sayHello4("Python");
        System.out.println(say);

    }   //main


    // 1 ~ 10 사이 임의의 난수를 출력하는 method
    public static void make_magic() {
        int magic = (int)(Math.random() * 10 ) + 1;
        System.out.print(magic + " ");
    }

    // 간단한 인삿말을 출력하는 메서드 1
    public static void sayHello() {
        System.out.println("Hello, World!!");
    }

    // 간단한 인삿말을 출력하는 메서드 2
    public static void sayHello2() {
        System.out.println("Hello, Java!!");
    }

    // 간단한 인삿말을 출력하는 메서드 3
    // 인삿말을 구성한 후 콘솔에 출력
    public static void sayHello3(String msg) {
        System.out.println("Hello, " + msg + "!!");
    }

    //간단한 인삿말을 출력하는 메서드 4
    //return 타입을 갖는 void x String o
    public static String sayHello4(String msg) {
        String say = "Hello, " + msg + "!!";
        return say;
    }
}   //class
