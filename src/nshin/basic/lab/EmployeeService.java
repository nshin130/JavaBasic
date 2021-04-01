package nshin.basic.lab;

// 임플로이 서비스
// 디스플레이 메뉴구현
// 추가정보 자동 생성화
// 임플로이 정보 구현

public interface EmployeeService {
    void displayMenu();
    
    void newEmployees();

    void showEmployee();

    void showOneEmployee();

    void modifyEmployee();

    void removeEmployee();

    void makeExtInfo(EmployeesVO emp);
}
