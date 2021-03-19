package nshin.basic.day04;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		// 구구단 출력하기
		// 7단 출력 v1
		System.out.println("7 x 1 = 7");
		System.out.println("7 x 2 = 14");
		System.out.println("7 x 3 = 21");
		System.out.println("7 x 4 = 28");
		System.out.println("7 x 5 = 35");
		System.out.println("7 x 6 = 41");
		System.out.println("7 x 7 = 49");
		System.out.println("7 x 8 = 56");
		System.out.println("7 x 9 = 63");
		System.out.println("----- -----");
		
		//v2 for 반복문 사용 (공통분모)
		for(int i =1; i <= 9; ++i) {
			System.out.println("7 x " + i + "= " + (7 + i));
		}
		
		System.out.println("----- -----");
		
		//v3 while문 printf
		String fmt = "7 x %d = %d\n";			//%d 부분모름
		int i = 1;
		while(i <= 9) {
			System.out.printf(fmt, i, 7*i);		//while문형식 다시보기
			++i;
		}
		System.out.println("----- -----");
		
		// 3단 출력 while, printf
		fmt = "3 x %d = %2d\n";					//자리수 정렬 하려고 숫자 2 붙임
		i = 1;
		while(i <= 9) {
			System.out.printf(fmt, i, 3*i);
			++i;
		}
		System.out.println("----- -----");
		
		
		
		// 구구단 프로그램 v1
		// 사용자로부터 (1 - 9) 하나 입력 받아,
		// 구구단을 출력하는 프로그램 작성
		// Scanner, while, printf
		
		Scanner sc = new Scanner(System.in);			//1. Scanner
		
		System.out.println("출력할 구구단의 단을 입력하세요: ");//2. 입력받을 문구
		int dan = sc.nextInt();
	
		i = 1;
		fmt = "%d x %d = %d\n";
		while(i <= 9) {
			System.out.printf(fmt, dan, i, (i*dan)); 	// 입력받을 값 x i 기때문
			++i;
		}
		
		
		
		// 구구단 프로그램 v2
		// 단 1 - 9 이외의 숫자나 문자를 입력 받으
		// "잘못 입력하셨습니다" 출력하기
		
		System.out.println("출력할 구구단의 단을 입력하세요: ");
		char dan2 = sc.next().charAt(0);
		//입력받은 문자열 중 첫번째 글자만 뽑아서 char형 변수에 대입
		//숫자 0부터 카운팅 (1 x)
		
		//입력받은 문자의 ASCII 코드값이 47~57인지 검사
		String result = (dan2 >= 49 && dan2 <= 57) ? "구구단출력" : "잘못입력하셧습니다";
		System.out.println(result);
		
		
		
		// 구구단 프로그램 v3
		// 단 1 - 9 이외의 숫자나 문자를 입력 받으
		// "잘못 입력하셨습니다" 출력하기
		System.out.println("출력할 구구단의 단을 입력하세요: ");
		String dan3 = sc.next();
			
		i = 1; 
		
		try {
			while(i <= 9) {
				System.out.printf(fmt, dan3, i, (Integer.parseInt(dan3)*i));
			++i;
			}
		} catch(Exception ex) {
			System.out.println("잘못입력하셨습니다");	
		}
		//예외처리코드(try-catch)를 이용해서
		//프로그램 실행중 오류발생시
		//제어를 catch 코드쪽으로 넘김
		
		
		
		//i.g. 주민번호를 이용해 성별을 출력하는 코드를 작성하세요.
		//주민번호 123456-7654321 중 7이 성별을 나타내는 코드
		//1: 1999년 이전에 출생한 남자
		//2: 1999년 이전에 출생한 여자
		//3: 2000년 이후에 출생한 남자
		//4: 2000년 이후에 출생한 여자
		// charAt를 이용해서 풀기
		String jumin = "123456-1234567";
		
		char gender = jumin.charAt(7);
		result = (gender == '1') ? "1999 남" : 
				 (gender == '2') ? "1999 여" :
				 (gender == '3') ? "2000 남" : "2000 여";
				 	
		System.out.println(result);
		
		// 내 주민번호로 연습
		jumin = "950130-2000000";
		char gender2 = jumin.charAt(7);
		result = (gender2 == '1') ? "1999 남" : 
			 	 (gender2 == '2') ? "1999 여" :
			 	 (gender2 == '3') ? "2000 남" : "2000 여";
		System.out.println(result);
		
	}
}

