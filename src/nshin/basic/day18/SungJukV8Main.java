package nshin.basic.day18;

import nshin.basic.SungJuk.SungJukServiceV3;
import nshin.basic.SungJuk.SungJukServiceV3Impl;
import nshin.basic.SungJuk.SungJukServiceV4;
import nshin.basic.SungJuk.SungJukServiceV4Impl;

import java.util.Scanner;

public class SungJukV8Main {
    // 성적처리프로그램 V8 -  JDBC programming
    // 입력한 성적데이터 DBMS를 이용해서 관리함
    // 따라서, 프로그램 종료시를입력했던 데이터는 그대로 유지됨

    // 새로운 프로그래밍 패턴 도입 : 3 layer architecture
    // presentation - business logic - data access 계층
    //                  ~service        ~DAO

    // SungJukSerivceV4
    // JDBCUtil (JDBC관련 정보 및 객체 생성)
    // SungJukDAO (insertSungJuk, selectSungJuk, selectOneSungJuk, updateSungJuk, deleteSungJuk)



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SungJukServiceV4 sjsrv = SungJukServiceV4Impl.getInstance();

        String menu = "";

        while (true) {
            sjsrv.displayMenu();
            menu = sc.next();

            switch (menu) {
                case "1": sjsrv.newSungJuk(); break;
                case "2": sjsrv.showSungJuk(); break;
                case "3": sjsrv.showOneSungJuk(); break;
                case "4": sjsrv.modifySungJuk(); break;
                case "5": sjsrv.removeSungJuk(); break;
                case "0": System.exit(0); break;
                default:
                    System.out.println("잘못 입력하셨습니다!!");
            }
        }
    }
}