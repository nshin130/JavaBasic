package nshin.basic.day15;

import nshin.basic.SungJuk.SungJukVO;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class SerializeSungJuk {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 이름 국어 영어 수학을 키보드로 입력받아
        // sungjuk.bin에 저장하는 코드를 작성하세요
        // 단, 입력받은 값들은 SungJukVO에 저장한 후
        // 직렬화해서 저장함

        // 입력 데이터: 혜교 97 98 95
        // 역직렬화 후 결과 : 혜교,97,98,95,290(총점),96.7(평균)

        String name = "";
        int kor = 0;
        int eng = 0;
        int math = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("성적은? ('이름 국어 영어 수학' 순서로)");
        name = sc.next();
        kor = sc.nextInt();
        eng = sc.nextInt();
        math = sc.nextInt();

        // 입력받은 데이터를 SungJukVO에 저장
        SungJukVO sj = new SungJukVO(name,kor,eng,math);

        // 직렬화 해 저장하기
        String fpath = "/Users/nara/01JAVAb/sungjuk.bin";
        // 관련 객체들 초기화
        FileOutputStream fos = new FileOutputStream(fpath);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(sj);

        oos.close();
        bos.close();
        fos.close();

        // 역직렬화
        FileInputStream fis = new FileInputStream(fpath);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        SungJukVO sjvo = (SungJukVO) ois.readObject();

        ois.close();
        bis.close();
        fis.close();

        int tot = sjvo.getKor() + sjvo.getEng() + sjvo.getMath();
        double avg = (double)tot/3;

        String fmt = "%s, %d, %d, %d, %d, %.1f\n";
        System.out.printf( fmt, sjvo.getName(), sjvo.getKor(), sjvo.getEng(), sjvo.getMath(), tot, avg );

    }
}
