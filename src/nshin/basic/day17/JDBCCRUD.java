package nshin.basic.day17;

import java.sql.*;
import java.util.Scanner;

public class JDBCCRUD {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // i.g. playground 데이터베이스에 books 테이블을
        // 생성하고 새로운 도서정보를 입력하는 프로그램을 작성
        // 컬럼정보 : bookid, bookname, publish, price
        // 입력방법은 Scanner 클래스를 이용

        // JDBC 접속정보
        String drv = "org.mariadb.jdbc.Driver";
        String amz = "bigdata.ckwuhzosrgyo.ap-northeast-2.rds.amazonaws.com";
        String url = "jdbc:mariadb://"+amz+":3306/playground";
        String usr = "playground";
        String pwd = "bigdata2020";

        // JDBC 관련 SQL정의
        String books = "create table books (bookid int, bookname varchar(30), " +
                          "publish varchar(30), price int)";
        String newbooksql = "insert into books " +
                            " values (99999,'java','oracle',10000) ";
        String newbooksql2 = "insert into books " +
                " values (%d,'%s','%s',%d) ";
        // JDBC 작업 시작
        Class.forName(drv); // JDBC드라이버 메모리에 적재
        // (drv 내용을 new연산자로 생성하는 동적으로 만들어주는 /
        // 드라이버 안에 있는 내용을 객체화 한다는 뜻 /
        // 객체화 시킬 대상을 변수화 해서 객체화 진행)

        try (
             Connection conn = DriverManager.getConnection(url, usr, pwd);
             // 드라이버 매니저를 이용해서 DBMS에 접속하고 세션을 하나 가져옴

             Statement stmt = conn.createStatement();
             // 연결된 세션을 통해 SQL을 실행할 수 있도록 statement 객체 생성
             // statement 가 없으면 sql 문을 실행 할 수 없음
        ){
            boolean isOK = stmt.execute(books);
            // 지정한 sql을 실행 하고 결과를 받아옴
            // 단 insert, update, delete 실행시 사용!

            if (isOK) System.out.println("도서 테이블 생성!");
            // 정상적으로 실행되었다면 적절한 메세지 출력

        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("테이블이 이미 존재하거나 시스템 오류!");
        }

        try (
             Connection conn = DriverManager.getConnection(url, usr, pwd);
             Statement stmt = conn.createStatement();
        ){
            boolean isOK = stmt.execute(newbooksql);
            if (isOK) System.out.println("데이터 저장 성공!");
        } catch(Exception e) {
            e.printStackTrace();
        }

        // Scanner로 데이터 입력받아 테이블에 저장
        Scanner sc = new Scanner(System.in);
        System.out.println("도서번호 도서명 출판사 가격");
        int bookid = Integer.parseInt(sc.next());
        String bookname = sc.next();
        String publish = sc.next();
        int price = Integer.parseInt(sc.next());

        String sql = String.format(newbooksql2,
                bookid, bookname, publish, price);
        System.out.println(sql);
        // 입력받은 값을 이용해서 완전히 sql 문으로 작성

        try (
                Connection conn = DriverManager.getConnection(url, usr, pwd);
                Statement stmt = conn.createStatement();
        ){
            boolean isOK = stmt.execute(sql);
            if (isOK) System.out.println("데이터 저장 성공!");
        } catch(Exception e) {
            e.printStackTrace();
        }


    }
}
