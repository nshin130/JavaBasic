package nshin.basic.day09;

public class Phones {
    public static void main(String[] args) {
        Regular r = new Regular();
        r.calling();

        MP3Phone m = new MP3Phone();
        m.playingMusic();

        Smartphone s = new Smartphone();
        s.surfingInternet();

    }
    //일반폰
    //전화걸기, 전화받기

    //MP폰
    //전화걸기, 전화받기, 음악재생, 동영상보기

    //스마트폰
    //전화걸기, 전화받기, 사진찍기, 인터넷, 게임

}

interface PhoneInterface {
    void calling();
    void receiving();
}

interface MP3Interface{
    void playingMusic();
    void video();
}

interface SmartPhoneInterface{
    void takingPictures();
    void surfingInternet();
    void playingGame();
}

class Regular implements PhoneInterface{

    @Override
    public void calling() {
        System.out.println("전화 거는 중");
    }

    @Override
    public void receiving() {
        System.out.println("전화 받는 중");
    }
}

class MP3Phone implements PhoneInterface, MP3Interface {

    @Override
    public void calling() { }

    @Override
    public void receiving() { }

    @Override
    public void playingMusic() {
        System.out.println("음악을 재생합니다.");
    }

    @Override
    public void video() {
        System.out.println("동영상을 재생합니다.");
    }
}

class Smartphone implements PhoneInterface, MP3Interface, SmartPhoneInterface {

    @Override
    public void calling() { }

    @Override
    public void receiving() { }

    @Override
    public void playingMusic() { }

    @Override
    public void video() { }

    @Override
    public void takingPictures() {
        System.out.println("사진을 찍습니다.");
    }

    @Override
    public void surfingInternet() {
        System.out.println("인터넷에 접속합니다.");
    }

    @Override
    public void playingGame() {
        System.out.println("게임을 실행합니다.");
    }
}

//방법 2.
// 상속: 부모클래스가 가진 특성과 기능을 변화없이 받음 (extends: 변화 없이 받아옴)
// 구현: 부모클래스가 정해준 틀에 맞춰 새롭게 작성 (interface: 틀만 받아옴)
// 따라서 아래처럼 짜는 것은 다소 세련되지 않음.
// (방법 1을 더 선호) 폰마다 기능적으로 calling and receiving을 다르게 만들 수 있기 떄문에.
//class MP3Phone2 extends Regular implements MP3Interface {
//
//    @Override
//    public void playingMusic() {
//
//    }
//
//    @Override
//    public void video() {
//
//    }
//}
