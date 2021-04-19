package nshin.basic.day15;

import java.io.*;
import java.util.Scanner;

public class CharSungJuk {
    public static void main(String[] args) {
        // 실습
        // 이름 국어 영어 수학을 키보드로 입력받아
        // sungjuk.dat에 저장하는 코드를 작성하세요
        // 단 파일에 저장하는 문자열 형식은 다음과 같이 합니다
        // 입력 데이터: 혜교 97 98 95
        // 파일 저장 형식 : 혜교,97,98,95

        String name = "";
        int kor = 0;
        int eng = 0;
        int math = 0;

        Scanner sc = new Scanner(System.in);

//        System.out.print("이름을 입력하세요");
//        name = sc.next();
//        System.out.print("국어는?");
//        kor = sc.nextInt();
//        System.out.print("영어는?");
//        eng = sc.nextInt();
//        System.out.print("수학는?");
//        math = sc.nextInt();
        System.out.println("성적은? ('이름 국어 영어 수학'순서로)");
        name = sc.next();
        kor = sc.nextInt();
        eng = sc.nextInt();
        math = sc.nextInt();

        // 파일에 쓰기
        String fpath = "/Users/nara/Downloads/sungjuk.dat";

        // FileWriter 객체 초기화
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(fpath, true);
            // 파일 데이터 누적 옵션 설정 data accumulative option (, true)
            bw = new BufferedWriter(fw);

            //  bw.write(name + "," + kor + "," + eng + "," + math + "\n" );

            String fmt = "%s,%d,%d,%d\n";
            String data = String.format(fmt, name, kor, eng, math);
            bw.write(data);

            bw.close();
            fw.close();
        } catch (Exception ex) {
            System.out.println("파일쓰기 오류!!");
                ex.printStackTrace();
        }

        // 저장한 성적데이터를 화면에 출력 (파일 읽기)
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(fpath);
            br = new BufferedReader(fr);

            while(br.ready()) {
                System.out.println( br.readLine() );
            }

            br.close();
            fr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
