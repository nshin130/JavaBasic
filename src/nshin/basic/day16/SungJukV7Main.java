package nshin.basic.day16;

import nshin.basic.SungJuk.SungJukServiceV2;
import nshin.basic.SungJuk.SungJukServiceV2Impl;
import nshin.basic.SungJuk.SungJukServiceV3;
import nshin.basic.SungJuk.SungJukServiceV3Impl;

import java.util.Scanner;

public class SungJukV7Main {
    // 성적처리프로그램 V7 -  ArrayList + 텍스트기반스트림 + 직렬화
    // 입력한 성적데이터를 직렬화를 통해 텍스트 기반 파일에 저장
    // 따라서, 프로그램 종료시 입력했던 데이터는 그대로 유지됨
    // SungJukSerivceV3
    // initSungjuk, saveSungjuk (파일처리/직렬화관련 메서드 추가)

    // 기존에 했던 내용들 down below
    // (1)newSungJuk, (2)showSungJuk, (3)showOneSungJuk,
    // (4)modifySungJuk, (5)removeSungJuk
    // computeSungJuk, displayMenu

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SungJukServiceV3 sjsrv = SungJukServiceV3Impl.getInstance();

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
                case "0": sjsrv.saveSungJuk();
                          //데이터를 모았다가 한번에 저장
                          System.exit(0); break;
                default:
                    System.out.println("잘못 입력하셨습니다!!");
            }
        }
    }
}