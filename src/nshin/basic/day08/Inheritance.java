package nshin.basic.day08;

public class Inheritance {

    public static void main(String[] args) {
        // 상속
        // 객체지향 3대 개념의 하나
        // 기존의 클래스에 기능을 추가하거나 재정의해서
        // 새로운 클래스를 만드는것을 의미

        // 상속을 이용하면 기존에 만들어둔 클래스의
        // 모든 플드와 메서드를 이용해서
        // 새로운 클래스를 편리하게 만들수 있음
        // 기존 클래스를 부모/상위/슈퍼(parent) 클래스라 하고
        // 새롭게 작성된 클래스를 자식/하위/서브(chile) 클래스라 함

        // 상속의 장점
        // 기존에 작성된 클래스를 재활용
        // 클래스의 계층구조 파악 용이
        // 소프트웨어 생산성 향상

        // 형식
        // class 클래스명 extends 부모클래스명

        Tiger2 t = new Tiger2();
        System.out.println(t.eyes);
        System.out.println(t.legs);


    }
}

// 상속을 이용 하지 않을 때 //선생님이 몰 시킨건지 모르겟음

class Eagle {
    String eyes;
    String mouth;
    String wings;

    public void eat() {}
    public void sleep() {}
    public void fly() {}
}

class Tiger {
    String eyes;
    String mouth;
    String legs;

    public void eat() {}
    public void sleep() {}
    public void run() {}
}

class Goldfish {
    String eyes;
    String mouth;
    String fin;

    public void eat() {}
    public void sleep() {}
    public void swim() {}
}

// 상속을 이용한 경우
class Animals{
    String eyes;
    String mouth;

    public void eat() {}
    public void sleep() {}
}

class Eagle2 extends Animals{
    String wings;
    public void fly() {}
}

class Tiger2 extends Animals{
    String legs;
    public void run() {}
}

class Goldfish2 extends Animals{
    String fin;
    public void swim() {}
}

class Person{

    String talk;
    String
}


