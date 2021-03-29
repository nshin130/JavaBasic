package nshin.basic.day10;

public class Starcraft2 {
    //인터페이스 기반으로 스타크래프트의 유닛을 정의해 봄

    public static void main(String[] args) {

        SCV2 s2 = new SCV2();

        System.out.println("SCV의 체력" + s2.hp);
        s2.attack();
        s2.move();
        s2.speciality();

        Marine2 m2 = new Marine2();

        System.out.println("Marine의 체력"+ m2.hp);
        m2.attack();
        m2.move();
        m2.speciality();

        Firebat2 f2 = new Firebat2();

        System.out.println("Firebat의 체력" + f2.hp);
        f2.attack();
        f2.move();
        f2.speciality();
    }
}

// 추상클래에서 정의했던 추상메서들를
// 독립적인 코드들로 분리함 -> 인터페이스
interface Unit2Action {
    abstract public void attack();  //abstract public은 생략가능
    void move();
    void speciality();
}
//
//class SCV2 extends Unit2 implements Unit2Action{
//
////}
//
abstract class Unit2 {
    protected String name;
    protected int hp;
    protected int power;
    protected double speed;
    protected int mineral;
    protected int gas;

}
//
//interface Unit2Interface {
//    void attack();
//    void move();
//    void speciality();
//} //기능
//
class SCV2 extends Unit2 implements Unit2Action {
    //
    final String fmtattack = "융합절단기를 이용해서 대상에 %d의 피해를 주고있습니다\n";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다.\n";
    final String fmtspeciality = "대상을 수리하는 중입니다.\n";

    //
//    public SCV2() {
//        name = "건설로봇";
//        hp = 45;
//        power = 0;
//        speed = 2.81;
//        mineral= 50;
//        gas = 0;
//    }
//
    @Override
    public void attack() {
        System.out.printf(fmtattack, power);
    }

    @Override
    public void move() {
        System.out.printf(fmtmove, speed);
    }

    @Override
    public void speciality() {
        System.out.printf(fmtspeciality);
    }
}
//
class Marine2 extends Unit2 implements Unit2Action{
//
    final String fmtattack = "가우스소총를 이용해서 대상에 %d의 피해를 주고있습니다\n";
    final String fmtmove =  "지정한 위치로 %.2f 속도로 이동중입니다.\n";
    final String fmtspeciality = "전투자극제를 사용해서 이동속도는 50%%증가, 공격속도 33%% 증가합니다.\n";
//
    public Marine2() {
        name = "해병대";
        hp = 50;
        power = 30;
        speed = 2.9;
        mineral= 50;
        gas = 0;
    }

    @Override
    public void attack() {
        System.out.printf(fmtattack, power);
    }

    @Override
    public void move() {
        System.out.printf(fmtmove,speed);
    }

    @Override
    public void speciality() {
        System.out.printf(fmtspeciality);
    }
}
//
class Firebat2 extends Unit2 implements Unit2Action{

    final String fmtattack = "화염방사기를 이용해서 대상에 %d의 피해를 주고있습니다\n";
    final String fmtmove =  "지정한 위치로 %.2f 속도로 이동중입니다.\n";
    final String fmtspeciality = "전투자극제를 사용해서 이동속도는 50%%증가, 공격속도 33%% 증가합니다.\n";

    public Firebat2() {
        name = "화염병사병";
        hp = 50;
        power = 8 * 2;
        speed = 1.875;
        mineral= 50;
        gas = 25;
    }

    @Override
    public void attack() {
        System.out.printf(fmtattack, power);
    }

    @Override
    public void move() {
        System.out.printf(fmtmove, speed);
    }

    @Override
    public void speciality() {
        System.out.printf(fmtspeciality);
    }
}


