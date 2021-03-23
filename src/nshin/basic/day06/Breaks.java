package nshin.basic.day06;

import java.util.Random;

public class Breaks {
    public static void main(String[] args) {
        // 반복문 제어하기 break, continue
        // break : 반복문 실행을 중단하는 명령
        // i.g. 1 ~ 100 까지의 총 합을 출력
        //      단 총 합이 500을 넘는 경우, 실행중단
        int sum = 0;
        int i;  // 전역변수

        for (i = 0; i <= 100; ++i) {
            sum += i;
            if (sum >= 500) break;
            // 부분합이 500이상인 경우 반복실행을 중지함
        }   // 이 지역에서 선언한 변수는 이 지역에서만 (local variable) != 전역변수
        // for문에서 변수 선언시 for문안에서만 유효함

        System.out.println("총합: " + sum);
        System.out.println("중지지점 : " + i);

        // i.g. 주사위의 눈이 6이 나올때 까지 굴려보는
        //      프로그램을 작성하세요. 또한, 6이 나올때 까지의
        //      굴린 횟수도 같이 출력하세요.
        //      random()과 break문을 사용
        int dice = 0;
        int count = 0;

        while(true) {
            dice = (int) (Math.random() * 6) + 1;
            ++count;
            System.out.print(dice + " ");
            if (dice == 6) break;
        }
        System.out.println("굴린 총 횟수 : " + count);


        //Random rnd = new Random();
        //int idx = rnd.nextInt(6);

        //double magic = Math.random();
        //System.out.println((int) (magic * 10));

        //for (idx = 0; idx < 7; ++idx) {
        //      if (idx == 5) break;
        //    System.out.println("굴린 횟수: " + idx);
        //}
    }
}
