package nshin.basic.SungJuk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SungJukServiceV4Impl implements SungJukServiceV4 {


    // 싱글톤 패턴 시작
    private static SungJukServiceV4 sjsrv = null;
    private static SungJukV4DAO sjdao = null;

    private SungJukServiceV4Impl() {
        sjdao = new SungJukV4DAOImpl(); //?
    }

    public static SungJukServiceV4 getInstance() {
        if (sjsrv == null) sjsrv = new SungJukServiceV4Impl();
        return sjsrv;
    }

    //싱글톤 패턴 끝

    @Override
    public void displayMenu() {
        String displaymenu =
                "--------------------- \n" +
                "    성적 프로그램 v8     \n" +
                "--------------------- \n" +
                " 1. 성적데이터 입력       \n" +
                " 2. 성적데이터 조회       \n" +
                " 3. 성적데이터 상세조회    \n" +
                " 4. 성적데이터 수정       \n" +
                " 5. 성적데이터 삭제       \n" +
                " 0. 프로그램 종료        \n" +
                "--------------------- \n" +
                " 작업을 선택하세요 : ";

        System.out.print(displaymenu);
    }

    @Override
    public void newSungJuk() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("이름은?");
            String name = sc.next();
            System.out.print("국어는?");
            int kor = sc.nextInt();
            System.out.print("영어는?");
            int eng = sc.nextInt();
            System.out.print("수학은?");
            int math = sc.nextInt();

            SungJukVO sj = new SungJukVO(name, kor, eng, math);
            //입력받을 성적데이터를 객체화
            computeSungJuk(sj);
            //성적데이터 처리

            int cnt = sjdao.insertSungJuk(sj);
            if (cnt > 0) System.out.println("성적 데이터 추가 완료");

            } catch(Exception ex){
                System.out.println("잘못입력하셨습니다!");
                return;
                // 오류발생시 실행중단하고 main으로 복귀
                // 결과값을 호출자에게 넘겨주는 반환의 return
                // 함수 실행이나 특정코드를 실행하다가 중단할 떄 return이 있음
            }
        }


    @Override
    public void showSungJuk() {
        String fmt = "%s, %s, %d, %d, %d, %s\n";
        ArrayList<SungJukVO> sjlist = (ArrayList<SungJukVO>) sjdao.selectSungJuk(); //이부분 ?

        StringBuffer sb = new StringBuffer();
        for (SungJukVO sj: sjlist) {
            String result = String.format(fmt,
                    sj.getSjno(), sj.getName(),
                    sj.getKor(), sj.getEng(),
                    sj.getMath(), sj.getRegdate());
            sb.append(result);
        }

        System.out.println(sb.toString());
    }

    @Override
    public void computeSungJuk(SungJukVO sj) {
        sj.setTot(sj.getKor() + sj.getEng() + sj.getMath());
        sj.setAvg((double) sj.getTot() / 3);

        switch ((int) sj.getAvg() / 10) {
            case 10: case 9:
                sj.setGrd('수'); break;
            case 8:
                sj.setGrd('우'); break;
            case 7:
                sj.setGrd('미'); break;
            case 6:
                sj.setGrd('양'); break;
            default:
                sj.setGrd('가'); break;
        }
    }

    @Override
    public void showOneSungJuk() {
            String fmt = "%s, %s, %d, %d, %d, %d, %.1f, %c, %s \n";
            Scanner sc = new Scanner(System.in);
            System.out.println("조회할 학생의 번호는?");
            int sjno = sc.nextInt();
            SungJukVO sj = sjdao.selectOneSungJuk(sjno);

            String result = String.format(fmt,
                    sj.getSjno(), sj.getName(), sj.getKor(),
                    sj.getEng(), sj.getMath(), sj.getTot(),
                    sj.getAvg(), sj.getGrd(), sj.getRegdate());

            System.out.println(result);

        }


    @Override
    public void modifySungJuk() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("수정할 학생번호는?");
            String sjno = sc.next();
            System.out.println("수정할 성적데이터를 입력하세요!");
            System.out.println("입력순서는 '이름 국어 영어 수학' 입니다");
            String name = sc.next();
            int kor = Integer.parseInt(sc.next());
            int eng = Integer.parseInt(sc.next());
            int math = Integer.parseInt(sc.next());

            SungJukVO sj = new SungJukVO(name, kor, eng, math);
            sj.setSjno(sjno); // ?
            computeSungJuk(sj);
            // 수정된 정보로 다시 성적처리
            // 이름만 바뀌어도 해당 구문이 실행되겠지만,
            // 과목 성적이 바뀔 때를 대비하여 컴퓨팅 성적을 해줘야함

           int cnt = sjdao.updateSungJuk(sj);
            if (cnt > 0) System.out.println("성적데이터 수정완료!");
        } catch (Exception e) {
            System.out.println("잘못입력하셨습니다");
            return; //리턴 안하면 어떻게 되는지?
        }
    }

    @Override
    public void removeSungJuk() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("수정할 학생번호는?");
            int sjno = Integer.parseInt(sc.next());

            int cnt = sjdao.deleteSungJuk(sjno);
            if (cnt > 0) System.out.println("성적 데이터 삭제 완료");

        } catch (Exception e) {
            System.out.println("잘못입력하셨습니다!");
            return;
        }

    }

}
