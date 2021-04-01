package nshin.basic.lab;

import java.util.Scanner;

public class EmployeeV1Main {
    // 데이터에 대한 CRUD 코드 작성
    // 사원 : 사번, 이름, 성, 이메일, 전화번호, 입사일,
    //       직책, 급여, 수당, 상사번호, 부서번호
    //       empno, fname, lname, email, phone, hdate,
    //       jobid, sal, comm, mgrid, deptid
    // 기본정보 : 사번, 이름, 성 , 이메일, 전화번호, 입사일
    // 추가정보 : JOBs file / 난수를 이용해서 자동으로 생성 (method: makeExtInfo)

    // EmployeeV1Main
    // EmployeeService
    // EmployeeServiceImpl
    // EmployVO

    // 사원정보를 입력받아 동적배열에 저장하고
    // 조회및 수정/삭제하는 프로그램 작성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService empsrv = EmployeeServiceImpl.getInstance();

        String menu = "";

        while(true) {
            empsrv.displayMenu();
            menu = sc.next();

            switch (menu) {
                case "1": empsrv.newEmployees(); break;
                case "2": empsrv.showEmployee(); break;
                case "3": empsrv.showOneEmployee();break;
                case "4": empsrv.modifyEmployee(); break;
                case "5": empsrv.removeEmployee();break;
                case "0": System.exit(0); break;
                default:
                    System.out.println("잘못 입력하셨습니다!!");
            }//switch
        }//while

       // empsrv.makeExtInfo(null);

    }//main

}//class
