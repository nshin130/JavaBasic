package nshin.basic.day06;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        // 12. 생년월일을 이용해서 나이를 계산하는 프로그램.
        agecalculator();

        // 16. 고객에게 돌려줘야 하는 잔돈을 화폐단위로 계산하는 프로그램을 작성하시오.
        // 즉, 잔돈을 돌려주기 위해
        // 10원, 50원, 100원, 500원, 1000원, 5000원, 10000원, 50000원 등이
        // 몇 개 필요한지 계산하는 것이다. (Change)

//        int price, money, change, count;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("물건값 : ");
//        price = sc.nextInt();
//
//        System.out.println("지불한 금액: ");
//        money = sc.nextInt();
//
//        change = price - money;
//
//        count = change/5000;
//        change = change % 5000;
//        System.out.println("5000원 " + count + " 장.");





    }

    public static void agecalculator() {

        int myage, currentyear, year;
        Scanner sc = new Scanner(System.in);

        System.out.println("현재년도를 입력하세요. ");
        currentyear = sc.nextInt();
        System.out.println("태어난 년도를 입력하세요. ");
        year = sc.nextInt();

        myage = (currentyear - year + 1);

        String fmt = "당신의 나이는 %d세 입니다. ";
        System.out.printf(fmt, myage);

    }
}
