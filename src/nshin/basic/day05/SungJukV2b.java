package nshin.basic.day05;

import java.util.Scanner;

public class SungJukV2b {
	
// 성적처리프로그램 v2b
// 성적처리시 학점계산을 switch문으로 작성
	
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
			name = sc.next();	
			System.out.println("국어는?");
			kor = sc.nextInt();
			System.out.println("영어는?");
			eng = sc.nextInt();
			System.out.println("수학은?");
			math = sc.nextInt();
			
			tot = kor + eng + math;
			avg = (double)tot / 3;	//(double)로 꼭 변환해줘야지 평균값 소수점 알맞게 나옴.
			
			grd = '가';
			
			//if (avg >= 90) grd = '수';
			// else if (avg >= 80) grd = '우';
			// else if  (avg >= 70) grd = '미';
			// else if  (avg >= 60) grd = '양';
			
			//학점계산을 switch문으로 작성한다면?
			//avg : 99.9 => (int)avg : 99
			// =>(int)avg / 10 : 9 나머지 버려진 정수형에서 앞자리만 남으니까 범위설정 easy
			
			switch ((int)avg / 10) { 
				case 10:
				case 9: grd = '수'; break;
				case 8: grd = '우'; break;
				case 7: grd = '미'; break;
				case 6: grd = '양'; break;
				default: grd='가';
			}
			
			// 결과 출력
			System.out.printf(fmt, name, kor, eng, math, tot, avg, grd );
		
			//반복 증감식
			++i;

		} //while
		
	} //main

} //class
