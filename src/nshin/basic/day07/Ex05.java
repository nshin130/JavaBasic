//package nshin.basic.day07;
//
//public class Ex05 {
//    public static void main(String[] args) {
//
//        // 73.
//        // 선풍기를 나타내는 Fan 클래스를 아래의 조건에 따라 작성하라
//        //
//        // 회전속도 1,2,3 을 나타내는 상수 SLOW, MEDIUM, FAST
//        // 선풍기의 속도를 나타내는 speed 변수, 초기값은 SLOW
//        // 동작상태를 표시하는 on 변수, 초기값은 false
//        // 선풍기 팬 크기를 나타내는 radius 변수, 초기값은 5.0
//        // 선풍기 색상을 표시하는 color 변수, 초기값은 blue
//        //
//        // 시험값 : 10, yellow, 최고속도, 동작중 / 5, blue, 중간속도, 정지
//
//        // fan 클래스 사용하기
//        Fan f = new Fan ();
//
//        // 변수 초기화
//        f. speed = "SLOW";
//        f. on = false;
//        f. radius = 5.0;
//        f. color = "blue";
//
//        //생성자를 이용해서 클래스 사용하기
//
//        Fan f2 = new Fan ("yellow");
//
//        //객체에 대입한 값 출력하기
//        System.out.println(f2);
//
//
//
//
//        // 74.
//        // 은행 계좌를 나타내는 Account 클래스를 작성하라
//        //
//        // 계좌번호를 위한 aid 변수, 초기값은 0
//        // 통장잔액을 나타내는 balance 변수, 초기값은 0
//        // 연간 이자율을 나타내는 interestRate 변수, 초기값은 0
//        // 통장개설 날짜를 위한 dateCreated 변수
//        //
//        // 시험값 : 1122, 20000, 4.5, 2014-08-15 14:34:29
//
//        // 76.
//        // 대학교 업무 시스템을 위한 다음의 요구사항을 참고하여 다음 클래스들을 작성하시오
//        //
//        // 학생에는 학번, 이름, 주소, 생년월일 등의 정보가 있다.
//        // 학생은 반드시 하나의 전공학과에 속해야 하며, 한 분의 지도교수 밑에서 전공지도를 받는다.
//        // 교내에 개설된 과목에는 과목번호, 과목명, 과목개요 등이 있다.
//        // 그리고 각 과목은 여러 개의 섹션으로 나누어 관리한다.
//        // 교수는 교수 이름, 전공분야, 보유기술 등의 정보를 가진다.
//        // 특히, 한 명의 교수는 하나 이상의 보유기술을 가질 수 있다.
//        // 또한, 교수는 하나 이상의 과목도 강의할 수 있다.
//        // 전공학과는 학과명, 학과사무실의 위치, 학과사무실의 전화번호 등의 정보가 있다.
//        // 그리고 각 학과의 교수들 중에서 한 명의 교수에게 학과장을 임명한다
//        }   //main
//
//        // 선풍기 클래스?
//        static class Fan {
//        //변수선언
//
//            private String speed;
//            private boolean on;
//            private double radius;
//            private String color;
//
//            public Fan() { }
//
//
//            public Fan( String speed, boolean on, double radius, String color) {
//                this.speed = speed;
//                this.on = on;
//                this.radius = radius;
//                this.color = color;
//            }
//
//        }
//
//        static class FanService {
//        // 데이터 입력
//            public Fan dataFan() {return null; }
//
//            public void printDataFan(Fan f) {
//
//            }
//        }
//}
