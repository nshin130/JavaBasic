package nshin.basic.day07;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        // 12. 생년월일을 이용해서 나이를 계산하는 프로그램
        // 현재연도 - 생년년도
        // 생일이 지났으면 그대로 사용
        // 생일이 지나지 않았으면 -1
        agecalculator();

//        int byear, bmonth, bday;
//        int cyear, cmonth, cday;
//
//        Scanner sc = new Scanner(System.in);
//        String fmt = "현재 : %d년 %d월 %d일 \n" +
//                     "생일 : %d년 %d월 %d일 \n" +
//                     "나이 : %d세";
//        cyear = 2021;
//        cmonth = 3;
//        cday = 24;
//
//        System.out.print("생일의 년도는? ");
//        byear= sc.nextInt();
//
//        System.out.print("생일의 월은? ");
//        bmonth= sc.nextInt();
//
//        System.out.print("생일의 일은? ");
//        bday= sc.nextInt();
//
//        int age =  cyear - byear;
//            if (cmonth > bmonth)
//                age = age ;
//            else if (cmonth == bmonth && cday >= bday)
//                age = age ;
//            else
//                age = age - 1;
//
//        System.out.printf(fmt, cyear, cmonth, cday, byear, bmonth, bday, age);
//        System.out.println("");

        // 16. 고객에게 돌려줘야 하는 잔돈을 화폐단위로 계산하는 프로그램을 작성하시오.
        // 즉, 잔돈을 돌려주기 위해
        // 10원, 50원, 100원, 500원, 1000원, 5000원, 10000원, 50000원 등이
        // 몇 개 필요한지 계산하는 것이다. (Change)

        changecalculator();
        // 지불액: 100000 원
        // 금  액: 54320 원
        // 잔  돈: 45680 원

//        int price, pay, change;
//        int $50000, $10000, $5000, $1000, $500, $100, $50, $10;
//        String fmt = "사용요금은 %d원 지불액은 %d원 일때\n" +
//                     "잔돈은 %d원 입니다." +
//                     "50000원권은 %d장, 10000원권은 %d장,\n" +
//                     "5000원권은 %d장, 1000원권은 %d장,\n" +
//                     "500원은 %d개, 100원은 %d개,\n" +
//                     "50원은 %d개, 10원은 %d개입니다.";
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("사용요금은? ");
//        price = sc.nextInt();
//        System.out.print("지불액은? ");
//        pay = sc.nextInt();
//
//        change = pay - price;
//
//        $50000 = change / 50000;
//        //change = change - (50000 * $50000);
//        change = change % 50000;
//
//        $10000 = change / 10000;
//        //change = change - (10000 * $10000);
//        change = change % 10000;
//
//        $5000 = change / 5000;
//        //change = change - (50000 * $5000);
//        change = change % 5000;
//
//        $1000 = change / 1000;
//        //change = change - (1000 * $1000);
//        change = change % 1000;
//
//        $500 = change / 500;
//        //change = change - (500 * $500);
//        change = change % 500;
//
//        $100 = change / 100;
//        //change = change - (100 * $100);
//        change = change % 100;
//
//        $50 = change / 50;
//        //change = change - (50 * $50);
//        change = change % 50;
//
//        $10 = change / 10;
//
//        System.out.printf(fmt, price, pay, (pay-price), $50000, $10000, $5000, $1000, $500, $100, $50, $10);

    }
    public static void agecalculator() {
        int byear, bmonth, bday;
        int cyear, cmonth, cday;

        Scanner sc = new Scanner(System.in);
        String fmt = "현재 : %d년 %d월 %d일 \n" +
                     "생일 : %d년 %d월 %d일 \n" +
                     "나이 : %d세";
        cyear = 2021;
        cmonth = 3;
        cday = 24;

        System.out.print("생일의 년도는? ");
        byear= sc.nextInt();

        System.out.print("생일의 월은? ");
        bmonth= sc.nextInt();

        System.out.print("생일의 일은? ");
        bday= sc.nextInt();

        int age =  cyear - byear;
        if (cmonth > bmonth)
            age = age ;
        else if (cmonth == bmonth && cday >= bday)
            age = age ;
        else
            age = age - 1;

        System.out.printf(fmt, cyear, cmonth, cday, byear, bmonth, bday, age);
        System.out.println("");
    }

    public static void changecalculator() {

        int price, pay, change;
        int[] wons = new int[8];    //배열을 이용한 간소화
        int[] bill = {50000, 10000, 5000, 1000, 500, 100, 50, 10};  //배열을 이용한 간소화
        String fmt = "사용요금은 %d원 지불액은 %d원 일때\n" +
                     "잔돈은 %d원 입니다.\n" +
                     "50000원권은 %d장, 10000원권은 %d장,\n" +
                     "5000원권은 %d장, 1000원권은 %d장,\n" +
                     "500원은 %d개, 100원은 %d개,\n" +
                     "50원은 %d개, 10원은 %d개입니다.";

        Scanner sc = new Scanner(System.in);

        System.out.print("사용요금은? ");
        price = sc.nextInt();
        System.out.print("지불액은? ");
        pay = sc.nextInt();

        change = pay - price;

        for(int i = 0; i < wons.length; ++i) {
            wons[i] = change / bill[i];
            change = change % bill[i];
        }

        System.out.printf(fmt, price, pay, (pay-price),
                          wons[0], wons[1], wons[2], wons[3],
                          wons[4], wons[5], wons[6], wons[7]);

    }

}
