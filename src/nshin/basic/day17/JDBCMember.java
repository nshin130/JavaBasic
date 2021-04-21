package nshin.basic.day17;

import nshin.basic.day06.Ex03;

import java.sql.*;
import java.util.Scanner;

public class JDBCMember {
    public static void main(String[] args) {
        // naver 회원가입 기능을 JDBC 로 구현
        // 테이블명 : NMember (playground)
        // 테이블 컬럼 구성 : 아이디 userid, 비밀번호 passwd,
        //                 이름 name, 생년월일 birth, 성별 gender
        //                 본인 확인 이메일 email , 휴대전화 hp
        // 자동 입력 컬럼 : 회원 번호 mbno(PK), 가입일 regdate

        // 회원가입 테이블 :
        // create table NMember (
        //      mbno int primary key auto_increment,
        //      userid varchar(18) not null,
        //      passwd varchar(18) not null,
        //      name   varchar(10) not null,
        //      birth  varchar(10) not null,
        //      gender int         not null,
        //      email  varchar(50) not null,
        //      hp     varchar(15) not null,
        //      regdate datetime default current_timestamp
        // );

        // data 삽입 테스트
//        insert into NMember (userid,passwd,name,birth,gender,email,hp)
//        values ('abc123','xyz987','홍길동','2021-04-21',0,'abc123@987xyz.com','012-3456-6789');

        // data 조회 테스트
        //select mbno, userid, name, regdate from NMember
        //order by mbno desc;

        // data 상세조회 테스트
        //select * from NMember where mbno = 1;

        // data 수정 테스트
        //update NMember set name = '전지현', birth = '2020-04-21', hp ='010-6789-1234'
        //where mbno = 1;

        // data 삭제 테스트
        //delete from NMember where mbno = 1;

        // 회원정보 입력

        Scanner sc = new Scanner(System.in);
        System.out.println("회원정보를 입력하세요");
        System.out.println("입력순서는 아이디 비밀번호 이름 생년월일 성별 이메일 핸드폰 입니다");

        String uid = sc.next();
        String pwd = sc.next();
        String name = sc.next();
        String bth = sc.next();
        String gdr = sc.next();
        String eml = sc.next();
        String hp = sc.next();

        // JDBC 이용해서 NMember 테이블에 회원정보 저장하기
        String sql = "insert into NMember (userid,passwd,name,birth,gender,email,hp) values (?,?,?,?,?,?,?)";

        MariaJDBC jdbc = new MariaJDBC();
        try (
             Connection conn = jdbc.openConn();
             PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            pstmt.setString(1,uid);
            pstmt.setString(2,pwd);
            pstmt.setString(3,name);
            pstmt.setString(4,bth);
            pstmt.setString(5,gdr);
            pstmt.setString(6,eml);
            pstmt.setString(7,hp);

            int cnt = pstmt.executeUpdate();
            if (cnt > 0) System.out.println("회원가입 성공!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 회원가입 완료 후 지금까지 가입한 모든 회원조회
        // 조회 대상 컬럼: 회원번호 아이디 이름 가입일

        sql = " select mbno, userid, name, regdate from NMember order by mbno desc ";

        try (
            Connection conn = jdbc.openConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
        ) {
            String fmt = "%s %s %s %s\n";
            StringBuffer sb = new StringBuffer();
            while (rs.next()) {
                String result = String.format(fmt,
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4).substring(0,10));
                sb.append(result);
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }



    } // main
} // class

