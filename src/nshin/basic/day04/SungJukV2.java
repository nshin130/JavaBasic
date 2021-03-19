package nshin.basic.day04;

import java.util.Scanner;

public class SungJukV2 {
	
// 성적처리프로그램 v2
// 반복문을 이용해서 성적 데이터 입력을 계속 수행
	
	public static void main(String[] args) {
		
		// 변수 선언
		String name;
		int kor, eng, math;
		int tot;
		double avg;
		char grd;
		String fmt="%s, %d, %d, %d \n" + //이름(s)
					"%d, %.1f, %c \n";   //총점 평균 학점
		Scanner sc = new Scanner(System.in);
		
		// 처리
		// while문을 이용해 세번 반복하기
		// 조건식을 true로 설정하면 횟수없이 계속 코드를 실행함. => while(true)
		int i = 1;
		while(i <= 3) {
			
			System.out.print("이름은?");
			name = sc.next();	//왜 인트 여기는 안붙는지?
			System.out.println("국어는?");
			kor = sc.nextInt();
			System.out.println("영어는?");
			eng = sc.nextInt();
			System.out.println("수학은?");
			math = sc.nextInt();
			
			tot = kor + eng + math;
			avg = (double)tot / 3;	//(double)로 꼭 변환해줘야지 평균값 소수점 알맞게 나옴.
			grd = (avg >= 90) ? '수' :
				  (avg >= 80) ? '우' :
				  (avg >= 70) ? '미' :
				  (avg >= 60) ? '양' : '가';
		
			// 결과 출력
			System.out.printf(fmt, name, kor, eng, math, tot, avg, grd );
		
			//반복 증감식
			++i;
	
		} //while
		
	} //main

} //class
