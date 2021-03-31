package nshin.basic.day12;

import java.util.Random;
import java.util.Scanner;

public class EX06 {
    public static void main(String[] args) {
        // Q. 14 TimeTime
        // 하루 86400초, 입력값 1234567890 => 며칠인지
        // 한 시간은 3600초, 입력값 98765 => 몇 시간인지
        // 일 분 60초, 입력값 12345 => 몇 분인지
        int data1 = 1234567890;
        System.out.println( 1234567890/86400 );
        System.out.println(
                Math.round((double)data1/86400) );

        int data2 = 98765;
        System.out.println(
                Math.round((double)data2/3600) );

        int data3 = 12345;
        System.out.println(
                Math.round((double)data3/60) );

        // Q. 25
        // 사용자로부터 복권 숫자 3자리 입력(yourkey)
        // 임의의 복권 숫자 3자리 입력(lottokey)
        // 사용자가 입력한 복권 숫자 모두 일치 = 상금 100만원 지급
        // 일치하지 x "아쉽지만, 다음 기회를!!"
        // 자리에 상관없이 숫자만 일치하면 됨

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int match = 0;

        //int yourkey [] = new int[3];
        System.out.println("복권 3자리 숫자를 입력하세요 ");
        int yourkey = sc.nextInt();

        int lottokey = rnd.nextInt(1000);

        // 입력값과 난수 비교
        // String.valueOf()
//        char lkey = String.valueOf(lottokey).charAt(0);
//        char lkey2 = String.valueOf(lottokey).charAt(1);
//        char lkey3 = String.valueOf(lottokey).charAt(2);
//
//        char ykey = String.valueOf(yourkey).charAt(0);
//        char ykey3 = String.valueOf(yourkey).charAt(1);
//        char ykey2 = String.valueOf(yourkey).charAt(2);


//        if ( lkey==ykey ||
//                lkey==ykey2||lkey==ykey3)
//            ++match;
//
//        if ( lkey2==ykey ||
//                lkey2==ykey2||lkey2==ykey3)
//            ++match;
//
//        if ( lkey3==ykey ||
//                lkey3==ykey2||lkey3==ykey3)
//            ++match;

        //중첩시킨 반복문을 이요하면 코드가 다소 간단해짐
        for (int i = 0; i < 3; ++i) {
            char lkey = String.valueOf(lottokey).charAt(i);

            for (int j = 0; j < 3; ++j) {
                char ykey = String.valueOf(yourkey).charAt(j);
                if (lkey == ykey) ++match; }
        }

        System.out.println(yourkey + "/" + lottokey );
        System.out.println("일치갯수: " + match);

        // Q. xx 두수를 입력받아 두 사이의 모든 값의 총합을 구하는 코드를 작성하세요
        // ex) 10, 3 => 3,4,5,6,7,8,9,10에 대한 총합
        // ex) 3, 10 => 3,4,5,6,7,8,9,10에 대한 총합

    }
}
