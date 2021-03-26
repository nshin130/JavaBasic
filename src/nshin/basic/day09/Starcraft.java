package nshin.basic.day09;

// 조상클래스
public class Starcraft {
    public static void main(String[] args) {

        //SCV s = new SCV("SCV", 45, 5, 2.81, 50, 0);
        // scv 유닛을 만들때 마다 초기값을 지정하는 것은
        // 다소 번거로움
        // 즉 동일한 속성을 가진 유닛을 만들때 마다
        // 매개변수를 통해 객체를 만드는 것은 비효율적임
        // 이런경우 생성자내에서 초기값을 지정하는 것이 나음

        SCV s = new SCV();
        System.out.println("SCV의 체력은 " + s.hp);

        s.attack();
        s.move();
        s.speciality();

        Marine m = new Marine();
        System.out.println("해병대의 체력은 " + m.hp);

        m.attack();
        m.move();
        m.speciality();

        Firebat f = new Firebat();
        System.out.println("화염병사병의 체력은" + f.hp);

        f.attack();
        f.move();
        f.speciality();


    }
}

abstract class Unit {
    protected String name;
    protected int hp;
    protected int power;
    protected double speed;
    protected int mineral;
    protected int gas;

    public Unit() { }

//    public Unit(String name, int hp, int power, double speed, int mineral, int gas) {
//        this.name = name;
//        this.hp = hp;
//        this.power = power;
//        this.speed = speed;
//        this.mineral = mineral;
//        this.gas = gas;
//    }

    abstract public void attack();      // 추상메서드
    abstract public void move();
    abstract public void speciality();

}

class SCV extends Unit{

    //
    final String fmtattack = "융합절단기를 이용해서 대상에 %d의 피해를 주고있습니다\n";
    final String fmtmove =  "지정한 위치로 %.2f 속도로 이동중입니다.\n";
    final String fmtspeciality = "대상을 수리하는 중입니다.\n";

    public SCV() {
        name = "건설로봇";
        hp = 45;
        power = 0;
        speed = 2.81;
        mineral= 50;
        gas = 0;
    }

//    public SCV(String name, int hp, int power, double speed, int mineral, int gas) {
//        super(name, hp, power, speed, mineral, gas);
//    }

    @Override
    public void attack() {
    //   System.out.println(
        //           "융합절단기를 이용해서 대상에" + power + "피해를 주고있습니다.");
        // 추상메서드를 이용해서 부모클래스에 정의된
        // attack 메서드를 유닛에 맞게 재정의함
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

class Marine extends Unit{

    final String fmtattack = "가우스소총를 이용해서 대상에 %d의 피해를 주고있습니다\n";
    final String fmtmove =  "지정한 위치로 %.2f 속도로 이동중입니다.\n";
    final String fmtspeciality = "전투자극제를 사용해서 이동속도는 50%%증가, 공격속도 33%% 증가합니다.\n";

    public Marine() {
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
        System.out.printf(fmtmove, speed);
    }

    @Override
    public void speciality() {
        System.out.printf(fmtspeciality);
    }
}

class Firebat extends Unit {

    final String fmtattack = "화염방사기를 이용해서 대상에 %d의 피해를 주고있습니다\n";
    final String fmtmove =  "지정한 위치로 %.2f 속도로 이동중입니다.\n";
    final String fmtspeciality = "전투자극제를 사용해서 이동속도는 50%%증가, 공격속도 33%% 증가합니다.\n";


    public Firebat() {
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


