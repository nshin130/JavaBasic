package nshin.basic.day10;

public class SayHello {
    //1. 다국어(한글, 영어, 일본어)인삿말 하기 - 국가별 인삿말을 개별적으로 작성
    public static void main(String[] args) {
        SayHelloKor say = new SayHelloKor();
        say.sayHello();

        SayHelloEng say2 = new SayHelloEng();
        say2.sayHello();

        SayHelloJpn say3 = new SayHelloJpn();
        say3.sayHello();

        //2. 인터페이스
        SayHello1func say0 = new Kor1();
        say0.hello();

        say0 = new Eng1();
        say0.hello();

        say0 = new Jpn1();
        say0.hello();

//        Kor1 k1 = new Kor1();
//        k1.hello();
//
//        Eng1 e1 = new Eng1();
//        e1.hello();
//
//        Jpn1 j1 = new Jpn1();
//        j1.hello();
    }
}
//1.
class SayHelloKor{
    public void sayHello() {
        System.out.println("안녕하세요, 자바8!!");
    }
}

class SayHelloEng{
    public void sayHello() {
        System.out.println("Hello, Jva8!!");
    }
}

class SayHelloJpn{
    public void sayHello() {
        System.out.println("こんにちは、ジャワ8！!");
    }
}

//2. 다형성 (인터페이스)를 이용해서 인삿말을 세련되게 하기

//abstract class SayHello1 {
//    protected String Kor;
//    protected String Eng;
//    protected String Jpn;
//}

interface SayHello1func {
    void hello();
}

class Kor1 implements SayHello1func {
    @Override
    public void hello() {
        System.out.println("안녕하세요, 자바8!!");
    }
}

class Eng1 implements SayHello1func {

    @Override
    public void hello() {
        System.out.println("Hello, Jva8!!");
    }
}

class Jpn1 implements SayHello1func {

    @Override
    public void hello() {
        System.out.println("こんにちは、ジャワ8！!");
    }
}