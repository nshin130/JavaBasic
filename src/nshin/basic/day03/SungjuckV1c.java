package nshin.basic.day03;

import java.util.Scanner;

/**
 * 
 * @author nshin
 * @category javabasic
 * @version 1.0
 * 
 * 이름과 성적데이터를 키보드로 직접 입력받아 처리
 * 처리결과 출력시 printf 메서드 사용
 *
 */
public class SungjuckV1c {
	public static void main(String[] args) {
		//변수선언
		String name;
		int kor;
		int eng;
		int math;
		int tot;
		double avg;  
		char grd;	 
		
		//처리
		Scanner sc = new Scanner(System.in);		//ctrl+space
		//키보드를 이용해서 성적데이터를 입력받기 위해
		// Scanner 클래스를 초기화함
		
		System.out.print("이름은? ");
		name = sc.next();
		//키보드로 문자데이터를 입력받아 name 변수에 대입
		System.out.print("국어는? ");
		kor = sc.nextInt();
		//키보드로 숫자데이터를 입력받아 kor 변수에 대입
		System.out.print("영어는? ");
		eng = sc.nextInt();
		System.out.print("수학은? ");
		math = sc.nextInt();
		
		
		
		//총점, 평균 처리
		tot = kor + eng + math;
		avg = (kor + eng + math)/3;
		
		
		
		
		//출력
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		
		System.out.println(tot);
		System.out.println(avg);

		
	}
}
