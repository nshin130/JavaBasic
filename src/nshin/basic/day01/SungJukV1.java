package nshin.basic.day01;
/**
 * 
 * @author nshin
 * @category javabasic
 * @version 1.0
 * 자바 기초 프로그램 - 성적처리프로그램
 * 입력 : 이름, 국어, 영어, 수학
 * 처리 : 총점, 평균, 학점
 * 출력 : 이름, 국어, 영어, 수학, 총점, 평균, 학점
 *
 */
public class SungJukV1 {
	public static void main(String[] args) {
		// 변수선언
		String name;
		int kor;
		int eng;
		int math;
		int tot;
		double avg;
		char grd;
		
		// 처리
		name = "홍길동";
		kor = 95;
		eng = 78;
		math = 84;
		
		//tot = 95 + 78 + 84;
		tot = kor + eng + math;
		
		avg = (kor + eng + math) / 3;
		avg = tot / 3;
		grd = '가';
		
		//출력
		//이름: ??, 국어: ??, 영어: ??, 수학: ??
		//총점: ??, 평균: ??, 학점: ??
		
		
		 String fmt = "이름: %s, 국어: %d, 영어: %d, 수학: %d\n";
		 System.out.printf(fmt, name,kor,eng,math);
		 
		 fmt = "총점: %d, 평균: %.1f, 학점: %c";	//%.1f: one decimal point
		 System.out.printf(fmt, tot,avg,grd);
		 
		 

	}
}
