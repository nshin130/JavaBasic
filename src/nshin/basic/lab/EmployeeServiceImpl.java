package nshin.basic.lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    //멤버변수 선언
    List<EmployeesVO> empdata = new ArrayList<>();
    EmployeesVO emp = null;

    //상수선언 (항상 여러사람이 써야하므로 static에 위로 가져옴 변하면 안되서 final)
    static final String[] JOBID = {
            "FI_MGR,","AC_MGR","SA_MAN","IT_PROG","ST_CLERK"};
    int MINSAL = 2000;
    int MAXSAL = 40000;
    int MAXDEPT = 270;
    int MAXMGRID = 206;

    //싱글톤 블럭 시작
    private static EmployeeService empsrv = null;

    private EmployeeServiceImpl() {
    }

    public static EmployeeService getInstance() {
        if (empsrv == null) empsrv = new EmployeeServiceImpl();
        return empsrv;
    }//싱글톤 블럭 끝

    // 화면에 프로그램 메뉴 출력
    @Override
    public void displayMenu() {
        String displayMenu =
                        "===========================\n" +
                        "     사원관리 프로그램 v1	    \n" +
                        "===========================\n" +
                        "1. 사원 정보 입력            \n" +
                        "2. 사원 정보 조회            \n" +
                        "3. 사원 정보 상세조회         \n" +
                        "4. 사원 정보 수정            \n" +
                        "5. 사원 정보 삭제            \n" +
                        "0. 사원 정보 종료            \n" +
                        "===========================\n" +
                        "작업을 선택하세요 : ";

        System.out.print(displayMenu);

    }

    //새로운 사원정보 입력받음
    @Override
    public void newEmployees() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("사번은? ");
            String empno = sc.next();
            System.out.println("이름은? ");
            String fname = sc.next();
            System.out.println("성은? ");
            String lname = sc.next();
            System.out.println("이메일은? ");
            String email = sc.next();
            System.out.println("전화번호는? ");
            String phone = sc.next();
            System.out.println("입사일은 ? ");
            String hdate = sc.next();

            EmployeesVO emp = new EmployeesVO(
                    empno, fname, lname, email, phone, hdate);

            //사원 추가정보를 생성해서 사원정보로 저장
            empsrv.makeExtInfo(emp);

            empdata.add(emp);
        } catch (Exception ex) {
            System.out.println("잘못입력하셨습니다!!");
        }
    }


    //사원 기본정보 출력- 사번 이름 성 이멜 전번 입사일
    //리스트 형태로 출력함
    @Override
    public void showEmployee() {
        String fmt = "%s %s %s %s %s\n";
        for (EmployeesVO emp: empdata) {
            System.out.printf(fmt, emp.getEmpno(), emp.getFname(),
                    emp.getLname(), emp.getEmail(),
                    emp.getPhone(), emp.getHdate());
        }
    }

    @Override
    public void showOneEmployee() {
        String fmt = "%s %s %s %s %s\n" +
                "%s %s %s %s %s %s\n";

        Scanner sc = new Scanner(System.in);
        System.out.printf("조회할 회원번호는? ");
        String empno = sc.next();

        EmployeesVO emp = null;
        for (EmployeesVO e : empdata) {
            //찾는 데이터가 동적배열에 존재한다면
            //emp변수에 그것을 저장하고 반복문을 종료함
            if (e.getEmpno().equals(empno))
                emp = e;
            break;
        }
        System.out.printf(fmt,emp.getEmpno(),emp.getFname(),emp.getLname(),emp.getEmail(),
                emp.getPhone(),emp.getHdate(),emp.getJobid(),emp.getSal(),
                emp.getComm(),emp.getMgrid(),emp.getDeptid());

    }


    @Override
    public void modifyEmployee() {

    }

    @Override
    public void removeEmployee() {

    }

    @Override
    public void makeExtInfo(EmployeesVO emp) {
//        String[] jobid = {
//                "FI_MGR,","AC_MGR","SA_MAN","IT_PROG","ST_CLERK"};
//        int min_sal = 2000;
//        int max_sal = 40000;
//        int max_dept = 270;
//        int max_mgrid = 206;
        //원래 이곳에 해당하는 내용이나 모두가 공유해서 여러번 써야 하기 때문에
        //상수선언 (final, static, 소문자->대문자)

        //난수 선어 random or Math 사용가능
        Random rnd = new Random();

        int key = rnd.nextInt(JOBID.length);
        String jobid = JOBID[key];

        int sal = rnd.nextInt(MAXSAL) + MINSAL;
        int mgrid = rnd.nextInt(MAXMGRID) + 100;
        int deptid = rnd.nextInt( (MAXDEPT) % 100 ) * 10;

        DecimalFormat df = new DecimalFormat("#.##");
        double comm = Double.parseDouble( df.format(rnd.nextDouble()/2) );

//        System.out.println(jobid);
//        System.out.println(sal);
//        System.out.println(mgrid);
//        System.out.println(deptid);
//        System.out.println(comm);

        emp.setJobid(jobid);
        emp.setSal(sal);
        emp.setComm(comm);
        emp.setMgrid(mgrid+"");
        emp.setDeptid(deptid+"");
    }


}

